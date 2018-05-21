package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	int port = 7070;
	ServerSocket server;
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	
	public MyServerSocket(int port) {
		this.port = port;
		System.out.println(">> 서버를 시작합니다.");
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void waitForClient() {
		System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다.");
		try {
			// 클라이언트 접속할 때까지 대기
			socket = server.accept();
			printInfo();
			
			// 클라이언트 소켓에 스트림을 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void receive() {
		// 클라이언트 소켓으로부터 받은 메시지를 화면에 출력
		try {
			System.out.println("[클라이언트] " + in.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(String msg) {
		// 클라이언트 소켓에 메시지 전송
		out.println(msg);
		out.flush();
		System.out.println("[서버] " + msg);
	}
	
	public void close() {
		try {
			// 클라이언트 소켓 종료
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void printInfo() {
		System.out.println(">> 클라이언트가 접속에 성공했습니다.");
		
		// 서버 포트번호와 클라이언트 주소와 포트번호 출력
		System.out.println("	서버 포트번호: " + socket.getLocalPort());
		System.out.println("	클라이언트 주소: " + socket.getInetAddress());
		System.out.println("	클라이언트 포트번호: " + socket.getPort() + "\n");
	}
	
	public static void main(String[] args) {
		int port = 7070;
		MyServerSocket myServer = new MyServerSocket(port);
		myServer.waitForClient();
		myServer.receive();
		myServer.send("서버에 접속하신 것을 환영합니다!");
		myServer.close();
	}
}
