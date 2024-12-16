public class Non_decreasing_array{
    public static boolean isPossible(int[] arr, int n) {
		int k=0;
		for(int i=0; i<=n-2; i++){
			if(arr[i] > arr[i+1]){
				k++;
				if(k>1) return false;

				if(i>0 && arr[i-1]>arr[i+1]){
					arr[i+1]=arr[i];
				}
				else{
					arr[i]=arr[i+1];
				}
			}
		}
			return true;
	}
}