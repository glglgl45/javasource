package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx2 {
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP주소를 다루는 클래스
		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			
			System.out.println("hostname : " + ip.getHostName());
			System.out.println("hostaddress : " + ip.getHostAddress());
			System.out.println("toString : " + ip.toString());
			
			// 하나의 도메인명에 매핑되는 모든 ip 가져오기
			InetAddress ipArr[] = InetAddress.getAllByName("www.naver.com");
			for(int i = 0 ; i < ipArr.length ; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
