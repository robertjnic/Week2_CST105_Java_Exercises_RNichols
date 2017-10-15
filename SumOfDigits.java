/** Program: Sum of Digits Program
* File: SumOfDigits.java
* Summary: Adds 5 digits together.
* Author: Robert J. Nichols
* Date: October 12, 2017 
**/

import java.util.Scanner;

public class SumOfDigits {
      
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("This program will find the sum of a 5-digit number.");
    System.out.print("Please enter a 5-digit number: ");
    int num = sc.nextInt();
    
    int sum = 0;
    int input = num;
    while(input !=0){
        int lastDigit = input % 10;
        sum += lastDigit;
        input /= 10;
    }
    
    System.out.printf("The sum of the digits %d is %d.", num, sum);
    }
}
