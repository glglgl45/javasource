package ch6;

public class SmartTv implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("SmartTv를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTv를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		} else if (volume < RemoteControl.MIN_VULUME) {
			this.volume = RemoteControl.MIN_VULUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 SmartTv 볼륨 : " + this.volume);
	}
}
