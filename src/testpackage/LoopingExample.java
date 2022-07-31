package testpackage;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		while(num<=10) 
		
		{
			if (num == 6) {
				num = num + 2;
						break;
			} 
				System.out.println(num);
				num = num + 2;
			
		}
		System.out.println("After while Loop");
		
		for(int index=1;index<=10;index++) {
			if (index == 6) {
						continue;
			} 
			System.out.println(index);
			
		}
		System.out.println("The end of FOR loop");
		
		int[] array1 = {10,20,30,40,50};
		
		for(int num1:array1) {
			
			System.out.println(num1);
		}
		System.out.println("End of For Each Loop");
		
		        int[] numa = {2, 4, 6, 8, 10};
		        for (int index1=0; index1 < numa.length; index1++) {
		            System.out.println(numa[index1]);
		        }
		   
		}
	}


