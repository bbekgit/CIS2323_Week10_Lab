import java.util.Scanner;

public class FizzBuzz{
	public static void main (String [] args){
		int lower = 0;
		int upper = 0;
		
		System.out.println("Welcome to FizzBuzz. Please type an integer");
		
		upper = inputDevice.nextInt();
		
		for(int i = lower; i<=upper;i++){
			boolean printNum = true;
			if(i%3)==0;{
			System.out.println("Fizz");
			printNum = false;
			}
			
			if(i%5)==0;{
			System.out.println("Buzz");
			printNum = false;
			}
			
			if(printNum){
			System.out.println(i);
			
			}
			System.out.println();
			
		}
	}
}