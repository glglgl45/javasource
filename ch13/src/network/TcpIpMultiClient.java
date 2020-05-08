package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpIpMultiClient {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("채팅에 사용할 이름을 입력해 주세요");
			System.exit(0);
		}
		
		try {
			String serverIp = "192.168.0.20";
			Socket socket = new Socket(serverIp,7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}//main 종료
	
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		
		public ClientSender(Socket socket,String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name=name;
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);
				}
				while(out!=null) {
					out.writeUTF("["+name+"]"+sc.nextLine());
				}
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}//thead 종료
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream dis;
		public ClientReceiver(Socket socket) {
			this.socket = socket;			
			try {
				dis = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {e.printStackTrace();}			
		}//생성자 종료
		@Override
		public void run() {
			while(dis!=null) {
				try {
					System.out.println(dis.readUTF());
				} catch (IOException e) {}
			}
		}
	}
}








