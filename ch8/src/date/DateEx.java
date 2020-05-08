package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E a hh:mm:ss ");
		System.out.println(sdf.format(date));

		// HH : 24시 기준 / SSSS(1/1000초)
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS E");
		System.out.println(sdf.format(date));
		// hh : 12시 기준 / a(am/pm)
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		System.out.println(sdf.format(date));
		// D : 년의 몇 번째 일
		sdf = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		System.out.println(sdf.format(date));
		// d : 월의 몇 번째 일
		sdf = new SimpleDateFormat("오늘은 이 달의 d째 날입니다.");
		System.out.println(sdf.format(date));
		// w : 년의 몇 번째 주
		sdf = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		System.out.println(sdf.format(date));
		// W : 월의 몇 번째 주
		sdf = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		System.out.println(sdf.format(date));
		// F : 월의 몇번째 요일 / E : 요일
		sdf = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		System.out.println(sdf.format(date));
		
	}
}
