package other;

import inherit.Tv;
// 다른 패키지에 있는 클래스를 상속 받는 경우
// default 접근 제한자 메소드는 오버라이딩 불가
// protected 접근 제한자 메소드만 오버라이딩 가능
public class CaptionTv extends Tv {

	public CaptionTv(String color, boolean power, int channel) {
		super(color, power, channel);
	}
	
	@Override
	protected void print() {
		super.print();
	}
	

}
