package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport;

	public BasicUDPServer(int sport) {

		try {
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다.");
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다.\n");
			this.dsock = new DatagramSocket(sport);

		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

	public void communicate() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				byte[] buffer = new byte[1024];	// 1 kilo byte

				// 클라이언트에서 전송되는 DatagramPacket을 받기 위해 rPack 생성한 후 대기
				this.rPack = new DatagramPacket(buffer, buffer.length);
				this.dsock.receive(rPack);	// 클라이언트에서 메시지가 올때까지 대기

				// 전송받은 결과를 문자열로 변환
				// String(bytes, offset, length)
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);

				// 클라이언트의 주소와 포트번호를 반환
				this.client = rPack.getAddress();
				this.cport = rPack.getPort();

				// 전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트" + client + ": " + cport + "]" + strIn);
				if (strIn.trim().equals("quit")) {
					break;
				}

				// 표준입력으로 입력된 정보를 DatagramPacket으로 만들어 클라이언트에 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BasicUDPServer server = new BasicUDPServer(7777);
		server.communicate();
	}
}





