package ch5;

public class DMBCellPhone extends CellPhone {
	// 추가된 필드 - channel
	int channel;
	
	// 추가된 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 시작");
	}
	void turnOffDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 종료");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + " 번으로 바꿉니다.");
	}

}
