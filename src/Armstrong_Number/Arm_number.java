package Armstrong_Number;

public class Arm_number {

	public static void main(String[] args) {
		
		int rem;
		int num= 153;
		int sum =0;
		int temp =num;
		while(num>0){
			rem = num%10;
		    sum = sum + rem*rem*rem;
			num = num/10;
			}
		if(temp == sum)
		System.out.println("it is Armstrong");
		else
			System.out.println("It is not");
	}

}
 