import java.util.Scanner;

public class CheckOddEven {
	public static void main(String args[]) 
	{ 
	int x; 
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("�п�J integer:"); 
	x= scanner.nextInt(); 
	
	if(x%2==0) 
	System.out.printf("The input %d is Even Number",x); 
	else System.out.printf("The input %d is Odd Number",x); 
	
	scanner.close();
	} 
}
