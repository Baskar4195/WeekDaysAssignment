package weekDaysWorkOut;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		// * a) Declare An array for {3,2,11,4,6,7};
		int arr[] = {3,2,11,4,6,7};
		
		 //* b) Declare another array for {1,2,8,4,9,7};
		 int arr1[] = {1,2,8,4,9,7};
		
		 Arrays.sort(arr);
		 Arrays.sort(arr1);
		 
		//* c) Declare for loop iterator from 0 to array length	
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
			if(arr[i] == arr1[j])
					System.out.println(arr[i]);
			}
		}
		 
		 /* d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
	}

}
