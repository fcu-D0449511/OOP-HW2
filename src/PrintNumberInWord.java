
import java.util.Scanner;
public class PrintNumberInWord {
	public static void main (String[] agrs){
		
		int num1;
		
		Scanner scanner = new Scanner (System.in);
		
        System.out.print("½Ð¿é¤Jinteger:");
		
		num1 = scanner.nextInt();
		
		if(num1<1||num1>9) 
			System.out.printf("The input integer is ¡§OTHER¡¨ "); 
			else System.out.printf("The input integer is ¡§ONE¡¨ ");
		
	}

}
