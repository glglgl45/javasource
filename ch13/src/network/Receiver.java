package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Receiver extends Thread {
	
	Socket socket;
	InputStream in;
	DataInputStream dis;	
	
	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in=socket.getInputStream();
			dis=new DataInputStream(in);			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}	
	@Override
	public void run() {		
		while(dis!=null) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}
	}
}














