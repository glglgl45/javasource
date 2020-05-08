package inherit;

public class CaptionTv extends Tv {

	/* private */ boolean caption;	// 캡션 상태
	
//	public CaptionTv() {
//		super();
//	}
	public CaptionTv(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel);
		this.caption = caption;
	}
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}

}
