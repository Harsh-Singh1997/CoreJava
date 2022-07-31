package testpackage;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {4,5,6};
		try {
			System.out.println(array1[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array exception catch");
		}finally {
			System.out.println("After Finally");
		}
		System.out.println("After Exception");
		
	}
	
}
