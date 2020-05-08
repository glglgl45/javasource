package test;

import java.util.Scanner;

public class BankApplication {
	// Account 객체를 100개 담을 배열 생성
	static Account[] accountArray = new Account[100];
	// 사용자로부터 입력받기 위한 객체 생성
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.계좌선택 | 4.예금 | 5.출금 | 6.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				choiceAccount();
				break;
			case 4:
				deposit();
				break;
			case 5:
				withdraw();
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
		}
	}
	
	public static void createAccount() {
		// 계좌번호(ano), 계좌주(owner), 잔액(balance)
		// 정보 입력받기
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();	// 110-11
		System.out.print("계좌주 입력 : ");
		String owner = sc.next();
		System.out.print("잔액 입력 : ");
		int balance = sc.nextInt();
		
		// 입력받은 정보를 이용해 Account 객체를 생성
		Account account = new Account(ano,owner,balance);
		
		// 배열에 담기 위해 배열 요소의 어느 부분이 비어있는지 확인한 후 생성된 객체를 담아준다
		for (int i = 0 ; i < accountArray.length ; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				// 담은 후 break;
				System.out.println(i+1 + "번째 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	public static void accountList() {
		// 현재 생성된 계좌 목록 출력하기
		System.out.println("----------------------------------------------------");
		System.out.println("                         계좌목록");
		System.out.println("----------------------------------------------------");
		for (int i = 0 ; i < accountArray.length ; i++) {
			if (accountArray[i] != null) {
				System.out.print(i+1 + "번째 계좌\t");
				System.out.print("계좌번호 : " + accountArray[i].getAno() + " | ");
				System.out.print("계좌주 : " + accountArray[i].getOwner() + " | ");
				System.out.print("잔액 : " + accountArray[i].getBalance() + "\n");
			}
		}		
	}
	
	public static void choiceAccount() {
		int choiceNumber = 0;
		System.out.print("계좌번호 입력 : " );
		String ano = sc.next();
		// 입력된 계좌번호 찾기
		for (int i = 0 ; i < accountArray.length ; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					choiceNumber = i;
				}
			}
		}
		// 선택된 계좌로 사용할 메뉴 구현
		boolean choiceRun = true;
		while (choiceRun) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.돌아가기 | 2.예금 | 3.출금 | 4.계좌삭제 | 5.종료");
			System.out.println("----------------------------------------------------");
			AccountInfo(ano);
			System.out.print("메뉴 선택 >> ");
			int choiceMenu = sc.nextInt();
			switch (choiceMenu) {
			case 1:
				choiceRun = false;
				break;
			case 2:
				deposit(ano);
				break;
			case 3:
				withdraw(ano);
				break;
			case 4:
				removeAccount(choiceNumber);
				if (findAccount(ano)!=null) {
					break;
				} else {
					choiceRun = false;
					break;
				}
			case 5:
				choiceRun = false;
				break;

			default:
				break;
			}
		}
	}

	// 계좌 삭제
	public static void removeAccount() {
		System.out.print("삭제할 계좌 입력 : ");
		int num = sc.nextInt();
		accountArray[num-1] = null;
		System.out.println(num + "번째 계좌가 삭제되었습니다.");
	}

	// 계좌 선택 후 계좌 삭제
	public static void removeAccount(int choiceNumber) {
		System.out.print("정말로 삭제하시겠습니까?(yes/no) : ");
		String str = sc.next();
		if (str.equals("yes")) {
			accountArray[choiceNumber] = null;
			System.out.println("계좌가 삭제되었습니다.");
		} else {
			System.out.println("취소되었습니다.");
		}
	}

	// 예금하다
	public static void deposit() {
		// 사용자에게 계좌번호 입력받기
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		// 입력받은 계좌번호를 이용해 몇번째 Account의 입금액을 증가해야 하는지 알아내기 => findAccount
		Account account = findAccount(ano);
		// account => null, 일치한 계좌가 있는 경우
		if (account == null) {
			System.out.println("계좌번호를 확인해 주세요");
		} else {	// 계좌를 찾은 경우
			System.out.print("현재 잔고 : " + account.getBalance() + " | ");
			System.out.print("입금액 : ");
			int deposit = sc.nextInt();
			account.setBalance(deposit + account.getBalance());
			System.out.print("입금 후 잔고 : " + account.getBalance() + "\n");
		}
	}
	
	// 계좌 선택 후 예금하다
	public static void deposit(String ano) {
		// 입력받은 계좌번호를 이용해 몇번째 Account의 입금액을 증가해야 하는지 알아내기 => findAccount
		Account account = findAccount(ano);
		// account => null, 일치한 계좌가 있는 경우
		if (account == null) {
			System.out.println("계좌번호를 확인해 주세요");
		} else {	// 계좌를 찾은 경우
			System.out.print("현재 잔고 : " + account.getBalance() + " | ");
			System.out.print("입금액 : ");
			int deposit = sc.nextInt();
			account.setBalance(deposit + account.getBalance());
			System.out.print("입금 후 잔고 : " + account.getBalance() + "\n");
		}
	}

	// 출금하다
	public static void withdraw() {
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인해 주세요");
		} else {	// 계좌를 찾은 경우
			System.out.print("현재 잔고 : " + account.getBalance() + " | ");
			System.out.print("출금액 : ");
			int withdraw = sc.nextInt();
			if (account.getBalance() > withdraw) {
				account.setBalance(account.getBalance() - withdraw);
				System.out.print("입금 후 잔고 : " + account.getBalance() + "\n");
			} else {
				System.out.println("출금액을 확인해주세요.");
			}
		}		
	}

	// 계좌 선택 후 출금하다
	public static void withdraw(String ano) {
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인해 주세요");
		} else {	// 계좌를 찾은 경우
			System.out.print("현재 잔고 : " + account.getBalance() + " | ");
			System.out.print("출금액 : ");
			int withdraw = sc.nextInt();
			if (account.getBalance() > withdraw) {
				account.setBalance(account.getBalance() - withdraw);
				System.out.print("입금 후 잔고 : " + account.getBalance() + "\n");
			} else {
				System.out.println("출금액을 확인해주세요.");
			}
		}		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account acc = null;
		// 넘겨받은 ano를 이용해 몇번째 계좌인지 찾아내기
		for (int i = 0 ; i < accountArray.length ; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					acc = accountArray[i];
					AccountInfo(ano);
					// 찾은 Account를 리턴하기
					return acc;
				}
			}
		}
		return acc;
		// 입력된 계좌번호 찾기
	}
	public static void AccountInfo(String ano) {
		for (int i = 0 ; i < accountArray.length ; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					System.out.println("----------------------------------------------------");
					System.out.print(i+1 + "번째 계좌 선택 | ");
					System.out.print("계좌번호 : " + accountArray[i].getAno() + " | ");
					System.out.print("계좌주 : " + accountArray[i].getOwner() + " | ");
					System.out.print("잔액 : " + accountArray[i].getBalance() + "\n");
					System.out.println("----------------------------------------------------");
				}
			}
		}
	}
	
	
}
