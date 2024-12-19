import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_distribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min = arr.get(arr.size()-1);
        for(int i=0; i<=arr.size()-m; i++){
            min = Math.min(min, arr.get(i+m-1) - arr.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        Chocolate_distribution cd = new Chocolate_distribution();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(13);
        arr.add(7);
        arr.add(5);
        arr.add(13);
        arr.add(12);

        System.out.println(cd.findMinDiff(arr, 4));
    }

}