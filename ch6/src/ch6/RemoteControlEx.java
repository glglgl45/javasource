package ch6;

public class RemoteControlEx {
	public static void main(String[] args) {
		
		RemoteControl television = new SmartTv();
		television.turnOn();
		television.setVolume(5);
		television.turnOff();
		
		// 익명구현객체 => 실제로 인터페이스를 구현하는 객체를 생성하지 않고 1회성으로 사용하는 방식
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("끕니다");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 : " + volume);
			}
		};	// 익명 구현
		
		// 사용
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
