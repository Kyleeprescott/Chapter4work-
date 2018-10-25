package Programwork;
import java.util.Scanner;
public class SortThreeIntegers {
	/* 
	 * kylee prescott
	 * 10/18
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user input 
		System.out.println("Enter three integers");
		
		//declare variables 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp  ;
		System.out.println("The non-decreasing order of your integers is:");
		
         // calculations
		if (num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		else if  (num2>num3) {
			temp =num2;
			num2=num3;
			num3=temp;
					
		}
		else if ( num3>num1) {
			temp = num3;
			num3=num1;
			num1 = temp;
					
		
		}
		System.out.println( num1 + " " +num2+ " " + num3 );
			
		
	}
	

}
