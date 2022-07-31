package testpackage;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 30;
int num2 = 20;
int sum = num1 + num2;
int multi = num1 * num2;
float div = (float) num1 / num2;
System.out.println("The Sum of two number is " + sum);
System.out.println("The Multiplication of two number is " + multi);
System.out.println("The division of two number is " + div);

String str1 = "Clean world Green world";

System.out.println(str1);
System.out.println("The length of string is " + str1.length());

char ch1 = str1.charAt(0);

System.out.println("the frist character of str1 is " + ch1);

char chn = str1.charAt(str1.length() - 1);

System.out.println("the last character of str1 is " + chn);

System.out.println(" the string in UPPERCASE is " + str1.toUpperCase());

System.out.println(" the string in lowercase is " + str1.toLowerCase());

	}

}
