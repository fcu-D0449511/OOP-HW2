import java.util.Scanner;
public class StringComparator {

	public static void main (String[] agrs){
		
		String str1,str2;
		Scanner scanner = new Scanner (System.in);
		System.out.print("�п�J�G�Ӧr��:");
		
		str1 = scanner.next();
		
		str2 = scanner.next();
		
		if(str1==str2) 
			System.out.printf("The two strings are the same"); 
			else System.out.printf("The two strings are not the same"); 
		scanner.close();
}
}