import java.util.Scanner;
public class KeyboardScanner {
	public static void main (String[] agrs){
		
		int num1;
		float float1,float2;
		String str1;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("�п�Jinteger:");
		
		num1 = scanner.nextInt();
		
		System.out.print("�п�Jfloat point number:");
		
		float1=scanner.nextFloat();
		
		System.out.print("�п�J your name:");
		
		str1 = scanner.next();
		
		float2=num1*float1;
		System.out.print("Hi "+str1);
		System.out.print(",the multiplication of "+num1);
		System.out.print(" and "+float1);
		System.out.print(" is "+float2);
	
	}

}



