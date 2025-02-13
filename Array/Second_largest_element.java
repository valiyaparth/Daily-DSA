import java.util.Arrays;

public class Second_largest_element {
    public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		for(int i=n-1; i>0; i--){
			if(arr[i] > arr[i-1]){
				return arr[i-1];
			}
		}
		return -1;
	}
}
