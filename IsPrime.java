package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 6;
		boolean isPrime = true;
		int i = 0;
		
		for( i = 2;i<=(n-1);i++) {		
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(n + " is a prime number");
		}else {
			System.out.println(n + " is divisible by " + i + ". Hence not a prime number.");
		}
			

	}

}
