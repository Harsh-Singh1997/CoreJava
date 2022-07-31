package testpackage;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = "Clean World Green World";
String revstr = "";	
		
		//char[] array = {'a' , 'p' ,'e' , 'x'};
		
		int count = 0;
		
		for(int index=str.length() - 1 ;index>=0; index--) {
			char ch = str.charAt(index);
	
			revstr = revstr + ch;
		}
System.out.println(revstr);
	}

}

