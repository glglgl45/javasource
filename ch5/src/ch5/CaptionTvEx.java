package ch5;

public class CaptionTvEx {
	public static void main(String[] args) {
		
		CaptionTv captionTv = new CaptionTv();
		// 부모(super) 의 속성 접근
		captionTv.channel = 9;
		captionTv.color = "black";
		captionTv.power = true;
		
		// 부모 메소드 접근
		captionTv.channelUp();
		System.out.println("현재 채널 : " + captionTv.channel);
		
		// 자식(본인-sub) 메소드 접근
		captionTv.displayCaption("Hello world");
		// 자식 속성 접근
		captionTv.caption = true;
		captionTv.displayCaption("Hello world222222");

	}
}
