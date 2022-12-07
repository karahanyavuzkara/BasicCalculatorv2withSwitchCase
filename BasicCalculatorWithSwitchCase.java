package patika;
import java.util.Scanner;
public class BasicCalculatorWithSwitchCase {

 public static void main (String[]args) {
	 
	 
	 int process , number1 , number2 ;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the first number : ");
	 number1 = input.nextInt();
	 System.out.print("Enter the second number : ");
	 number2 = input.nextInt();
	 System.out.println("Select operation:\n1 - Add\n2 - Extract\n3 - Divide\n4 - Multiply ");
	 
	 System.out.print("Enter your selection as 1-2-3-4 : ");
	 process = input.nextInt();
	 
	 switch (process) {
	 
	 case 1 : 
		 System.out.print("Result is : " + number1 + number2 );
		break;
	
	 case 2 : 
		 System.out.print("Result is : " + (number1 - number2 ));
		 break;
     
	 case 3 :
		 System.out.print( "Result is : " + number1 / number2);
		 break;
		 
	 case 4 :
		 System.out.print("Result is : " + number1 * number2);	 
		 break;
		 
	 }
 }
}