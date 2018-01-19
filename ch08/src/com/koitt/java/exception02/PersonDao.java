package com.koitt.java.exception02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO (Data Access Object): 실제 데이터에 접근하는 객체를 위한 클래스
 * insert(Person p): 사람 객체를 저장
 * readAll(): 저장된 사람 전체 리스트를 가져오기
 */

public class PersonDao {
	public static final String FILE_NAME = "person-list.dat"; 
	
	List<Person> list;	// DB 대신에 사용자를 저장할 자료구조

	public PersonDao() {
		// this.list = new ArrayList<Person>();
		// TODO 6. this.list = loadFromFile([파일명]);
		this.list = loadFromFile(PersonDao.FILE_NAME);
	}
	
	public void insert(Person p) throws MyException {
		// list에서 중복된 인적정보 찾기
		for (Person item : this.list) {
			// 사람 이름 비교해서 같다면 중복된 사람으로 처리
			if (item.equals(p)) {
				throw new MyException("E01: Person 객체 중복");
			}
		}
			
		this.list.add(p);
		// TODO 3. saveToFile(list, [파일명]);
		this.saveToFile(this.list, PersonDao.FILE_NAME);
	}
	
	// 전체 목록 가져오기
	public List<Person> selectAll() {
		return this.list;
	}
	
	// Argument로 전달받은 객체를 list에서 제거
	public void delete(Person p) throws MyException {
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		/*for (Person item : this.list) {
			if (item.equals(p)) {
				this.list.remove(item);
				return;
			}
		}*/
		
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(p)) {
				this.list.remove(i);
				// TODO 4. saveToFile(list, [파일명]);
				this.saveToFile(this.list, PersonDao.FILE_NAME);
				return;
			}
		}
		
		throw new MyException("E02: 삭제할 사람이 없습니다.");
	}
	
	public void update(Person p) throws MyException {
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				//item.setName(p.getName());	// name을 새로 set할 필요가 없다.
				item.setAge(p.getAge());
				// TODO 5. saveToFile(list, [파일명]);
				this.saveToFile(this.list, PersonDao.FILE_NAME);
				return;	// 찾았으니까 검색을 중단하고 끝낸다.
			}
		}
		
		throw new MyException("E03: 수정할 사람이 없습니다.");
	}
	
	/*
	 * TODO 1. private void saveToFile(List<Person> list, String filename)
	 * list: PersonDao에 있는 list 필드
	 * filename: list 객체를 저장할 파일 이름
	 */
	private void saveToFile(List<Person> list, String filename) {
		// FileOutputStream, ObjectOutputStream
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * TODO 2. private List<Person> loadFromFile(String filename)
	 * filename: 게시글 리스트가 저장된 파일명
	 * 
	 * List<Person> : 파일에서 불러온 list 객체를 리턴
	 */
	private List<Person> loadFromFile(String filename) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object list = null;
		
		try {
			File file = new File(filename);	// 해당 파일 객체화
			
			// 파일이 존재 할 경우
			if (file.exists()) {
				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				// 파일에 있던 리스트 객체를 끄집어내기
				list = ois.readObject();

				ois.close();
				fis.close();
				
				return (List<Person>) list;
			}
			else {
				System.out.println("처음 방문입니다.");
				return new ArrayList<Person>();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
