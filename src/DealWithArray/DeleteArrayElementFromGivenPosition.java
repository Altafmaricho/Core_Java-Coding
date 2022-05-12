package DealWithArray;
import java.util.Arrays;

public class DeleteArrayElementFromGivenPosition {
	
	public static void main(String[] args) {
		
		int [] arr = { 5,8,7,2,4,6};
		int pos = 2;
		
		for(int i=pos;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		System.out.println("deleted Array = " + Arrays.toString(arr));
		

	}

}
