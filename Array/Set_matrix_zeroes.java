import java.util.*;

public class Set_matrix_zeroes {
    public void setZeroes(int[][] matrix) {
        List<int[]> zeroes = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    zeroes.add(new int[]{i, j});
                }
            }
        }
        for(int[] pair : zeroes){
            for(int j=0; j<matrix[0].length; j++){
                matrix[pair[0]][j] = 0;
            }
            for(int i=0; i<matrix.length; i++){
                matrix[i][pair[1]] = 0;
            }
        }
    }
}
