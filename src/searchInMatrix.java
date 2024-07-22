import java.util.Arrays;

public class searchInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 28;
        System.out.println(Arrays.toString(search(mat,target)));

    }
    static int[] search(int[][] mat, int target){
        int r = 0;
        int c = mat.length-1;
        while(r < mat.length && c >= 0){
            if(target == mat[r][c])
                return new int[]{r,c};
            if(target < mat[r][c])
                c--;
            else
                r++;
        }
        return new int[]{-1,-1};
    }
}
