package recursion17;

public class Recursed {

	public static void main(String[] args) {
		System.out.println(SumTheNum(7));
		System.out.println(SumOfOdd(7));
		ReverseOrder(123456);
		System.out.println();
		System.out.println(ProductOfDigits(1231));

	}
	public static int SumTheNum(int x){	
		/**Write a recursive method that is passed an integer 
		 * and returns the sum of the integer and all the 
		 integers less than it but greater than zero.*/
		if(x>0){
			return x+SumTheNum(x-1);
		}
		return 0;
	}
	public static int SumOfOdd(int x){	
		/**Write a recursive method that sums the odd integers 
		 * less than and equal to the odd integer passed to it and greater than zero.*/
		if(x%2==1){
		if(x>0){
			return x+SumOfOdd(x-2);
		}
		return 0;
		}
		else
			return 0;
	}
	public static void ReverseOrder(int x){	
		/**Write a recursive method that accepts an integer 
		 * of unknown size and displays the integer in
		 * reverse order.*/
			System.out.print(x%10);
			if(x>9){
				ReverseOrder(x/10);
			}
	}
	public static void TwoNumSum(int one, int two){
		/**Write a recursive method given two integers 
		 * of the same length and displays the 
		 * sum of their corresponding digits.*/
	}
	public static int ProductOfDigits(int x){
		/**Write a recursive method that when given an 
		 * integer of unknown length, returns the 
		 * product of the digits of the integer.*/
		if(x>9){
			return x*ProductOfDigits(x/10);
		}
		return 1;
	}
	public static void NumOfZeros(int one, int two){
		/**Write a recursive method that takes an integer 
		 * and returns the number of zeroes in the number.*/
		
	}
	public static void Fibonacci(int one, int two){
		/**Write a program that prompts the user for a 
		 * positive integer n and displays the nth term 
		 * of the Fibonacci sequence.*/
		
	}
}
