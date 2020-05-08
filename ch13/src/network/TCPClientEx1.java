package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientEx1 {
	public static void main(String[] args) {
		// 클라이언트가 서버에 요청하기 위한 소켓 생성
		Socket socket = null;
		String serverIp = "127.0.0.1";
		System.out.println("[ 연결 요청 ]");
		try {
			socket = new Socket(serverIp,5001);
			System.out.println("[ 연결 성공 ]");
			
			// 서버로 메세지 보내기
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("클라이언트가 보내는 메시지");
			
			
			// 서버가 보내는 메시지를 읽기 위한 스트림 생성
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println(dis.readUTF());
			dos.close();
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
