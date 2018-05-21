package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class BasicUDPClient {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress server;
	int port = 8888;

	public BasicUDPClient(String ip, int port) {
		try {
			server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();
			System.out.println(">> 서버에 접속합니다.");
			System.out.println(">> 서버에 전달할 메시지를 쓰고 Enter를 누르세요.");
			System.out.println(">> 종료하려면 quit를 쓰고 Enter를 누르세요.\n");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

	public void communicate() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strOut = null;
		try {
			while ((strOut = br.readLine()) != null) {
				// DatagramPacket에 입력 줄을 저장하고 서버에 전송
				sPack = new DatagramPacket(strOut.getBytes(), 
						strOut.getBytes().length, server, port);
				dsock.send(sPack);
				
				// 서버에 quit를 전송하면 종료
				if (strOut.equals("quit")) {
					break;
				}
				
				// 서버로부터 수신되는 DatagramPacket을 받아 표준출력
				byte[] buffer = new byte[1024];	// 1 kilo byte
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);	// 서버에서 메시지가 올때까지 대기
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				System.out.println("[서버" + server + ": " + port + "]" + strIn);
			}
			System.out.println("UDP 클라이언트를 종료합니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		BasicUDPClient client = new BasicUDPClient("192.168.0.11", 7777);
		client.communicate();
	}
}





