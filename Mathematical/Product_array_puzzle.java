public class Product_array_puzzle {
        public static long[] productExceptSelf(int arr[]) {
            int n = arr.length;
            long[] pro = new long[n];
            long totalProduct = 1; 
            int zeroCount = 0;      
    
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    totalProduct *= arr[i];
                } else {
                    zeroCount++;
                }
            }
    
            if (zeroCount > 1) {
                return pro; 
            }
    
            for (int i = 0; i < n; i++) {
                if (zeroCount == 1) {
                    pro[i] = (arr[i] == 0) ? totalProduct : 0;
                } else {
                    pro[i] = totalProduct / arr[i];
                }
            }
    
        return pro;
    }
}
    
