/** Program: Temperature Converting Program
* File: TempConvert.java
* Summary: Converts Temperature from Celsius to Fahrenheit and vice versa.
* Author: Robert J. Nichols
* Date: October 12, 2017 
**/
import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature: ");
        int numF = input.nextInt();
        double solutionF = (numF - 32) * 5.0/9;
        System.out.println(numF + "F" + " is equivalent to " + solutionF + "C.");
        
        System.out.print("Enter a Celsius temperature: ");
        int numC = input.nextInt();
        double solutionC = (numC * 9.0/5) + 32;
        System.out.println(numC + "C" + " is equivalent to " + solutionC + "F.");
    }
    
}
