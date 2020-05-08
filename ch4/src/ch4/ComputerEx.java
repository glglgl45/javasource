package ch4;

public class ComputerEx {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		int result = computer.sum(new int[] {15,16,17,18,19}) ;
		System.out.println(result);
		
		System.out.println();
		
		int arr1[] = {25,35,45,55,65};
		result = computer.sum(arr1);
		System.out.println(result);		
	}
}
