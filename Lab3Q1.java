//Lab D3 ques_no. 1

/*
1. Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the
original number. 
For example: 145 is a strong number. Since, 1! + 4! + 5! = 145 [Hint: conditional operator,method,use parameterized method to take input] 
Sample Input 1: 145 
*/

import java.util.Scanner;

public class Lab3Q1 
{

	static int factorial(int num) {   //method: cal factorialof num
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact*= i;
		}
		return fact;
	}

	static boolean isStrong(int num) {  //method : check if armstrong no.
	int originalNum = num;
	int sum = 0;

	while (num > 0)
	{
		int digit = num % 10;
		sum += factorial(digit);
		num /= 10;
	}

	return  sum == originalNum;
	}


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("\t Enter the number : " );
	int num = scanner.nextInt();

	boolean isStrongNumber = isStrong(num);

	System.out.println();
		if (isStrongNumber){
			System.out.println("\t" + num + " is a strong number." );
		} else {
			System.out.println("\t" + num + " is not a stong number. ");
		}
	

	scanner.close();
	}
}
