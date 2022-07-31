package testpackage;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int num1 = 1;num1<=5;num1++) {
			for(int num2 = 1;num2<=num1;num2++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("End of for loop pattern");
		
		for(int num3 = 1;num3<=5;num3++) {
			int j =1;
			while(j<=num3) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	System.out.println("End of For-While pattern");
	}

}
