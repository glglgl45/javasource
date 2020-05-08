package ch5;

public class DMBCellPhone2 extends CellPhone {
	// 추가된 필드 - channel
	int channel;
		
	public DMBCellPhone2() {
		super();
	}
		
	public DMBCellPhone2(String model, String color, int channel) {
		super();
		// 부모의 멤버변수 초기화 가능
		// 단, 부모 클래스에 인자를 받는 생성자가 없어야 함
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

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
