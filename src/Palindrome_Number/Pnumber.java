package Palindrome_Number;

public class Pnumber {

	public static void main(String[] args) {
		int num=12321;
	int rem;
	int rev =0;

		int temp = num;
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
			if(temp == rev)
				System.out.print("it is palindrome");
			else
				System.out.println("it is not a palindrome");
		
	}
}
