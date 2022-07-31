package testpackage;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int num = scanner.nextInt();
		boolean flag=true;
		
		for(int index=2;index<num;index++) {
			
			int rem = num%index;
			
			if(rem==0) {
				
				System.out.println("Num is not Prime");
				flag = false;
				break;
			}
			
		}
		
		if(flag==true) {
			System.out.println("Num is Prime");
		}

	}

}
