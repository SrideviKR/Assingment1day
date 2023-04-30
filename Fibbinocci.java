package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int maxCount = 11;
		int i=firstNum;
		
		System.out.print(firstNum + " ");
		System.out.print(secNum + " ");
		
		for (i = 0; i < maxCount;i++) {
			sum = firstNum + secNum;			
			firstNum = secNum;
			secNum = sum;
			System.out.print(sum + " ");		
			
		}
		

	}

}
