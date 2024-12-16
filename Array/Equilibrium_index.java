public class Equilibrium_index {
    public static int arrayEquilibriumIndex(int[] arr){ 
		int totalSum=0;
		int leftSum=0;

		for(int num:arr){
			totalSum+=num;
		} 

		for(int i=0; i<arr.length; i++){
			int rightSum = totalSum-leftSum-arr[i];
			if(rightSum==leftSum) return i;
			leftSum+=arr[i];
		}
		return -1;
	}
}
