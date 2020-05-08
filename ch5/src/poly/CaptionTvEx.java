package poly;

public class CaptionTvEx {

	public static void main(String[] args) {
		Tv tv = new CaptionTv();
		
		// 부모가 가지고 있는 멤버변수나 메소드로 범위 제한
		tv.channel = 7;
		tv.color = "black";
		tv.power = true;
		
		tv.channelUp();
		tv.channelDown();

	}

}
