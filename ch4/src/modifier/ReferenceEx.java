package modifier;

public class ReferenceEx {
	public static void main(String[] args) {
		
//		ReferenceEx ref = new ReferenceEx();
//		ref.change();
		
		int arr[] = {5,6,7,8,9};		
		change(arr);
		System.out.println(arr[3]);
		
		change(arr[2]);
		System.out.println(arr[2]);
	}
	public static void change(int[] arr) {
		arr[3] = 55;
		
	}
	public static void change(int a) {
		a = 25;
	}
}