
import java.util.Scanner;
public class PrintNumberInWord {
	public static void main (String[] agrs){
		
		int num1;
		
		Scanner scanner = new Scanner (System.in);
		
        System.out.print("½Ð¿é¤Jinteger:");
		
		num1 = scanner.nextInt();
		
		if(num1<1||num1>9) 
			System.out.printf("The input integer is ¡§OTHER¡¨ "); 
		else if(num1==1) 
			System.out.printf("The input integer is ¡§ONE¡¨ ");
		else if(num1==2)
			System.out.printf("The input integer is ¡§TWO¡¨ ");
		else if(num1==3) 	
			System.out.printf("The input integer is ¡§THERR¡¨ ");
		else if(num1==4) 	
			System.out.printf("The input integer is ¡§FOUR¡¨ ");
		else if(num1==5) 	
			System.out.printf("The input integer is ¡§FIVE¡¨ ");
		else if(num1==6) 	
			System.out.printf("The input integer is ¡§SIX¡¨ ");
		else if(num1==7) 	
			System.out.printf("The input integer is ¡§SEVEN¡¨ ");
		else if(num1==8) 
			System.out.printf("The input integer is ¡§EIGHT¡¨ ");
		else
			System.out.printf("The input integer is ¡§NIGHT¡¨ ");
		scanner.close();
	}

}
