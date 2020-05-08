package poly;

public class CaptionTv extends Tv {
	/* private */ boolean caption;	// 캡션 상태
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}

}
