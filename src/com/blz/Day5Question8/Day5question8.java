package com.blz.Day5Question8;
import java.util.Scanner;
public class Day5question8 {

	public static void main(String[] args) {
		System.out.println("Welcome to check EvenOdd Number!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();
		if( num % 2 == 0)
		{	
			System.out.println("The number is even: "+num);
		
         }
		else
         {
        	 System.out.println("The number is Odd: "+num);
         }
		
	}
}


