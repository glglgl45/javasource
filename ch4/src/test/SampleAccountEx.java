package test;

public class SampleAccountEx {

	public static void main(String[] args) {
		SampleAccount acc = new SampleAccount();
		acc.setBalance(500000);
		System.out.println("현재잔고 : " + acc.getBalance());
		acc.setBalance(-100000);
		System.out.println("현재잔고 : " + acc.getBalance());
		acc.setBalance(1300000);
		System.out.println("현재잔고 : " + acc.getBalance());

	}

}
