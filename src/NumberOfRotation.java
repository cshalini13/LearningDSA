public class NumberOfRotation {


    public static void main(String[] args){
        int[] nums = {7, 9, 11, 12, 5};
        int minValIndex = findMinimum(nums);
        System.out.println(minValIndex);

    }
    static int findMinimum(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while(s <= e){
            int m  = s + (e-s)/2;
            if(nums[s] <= nums[e]){
                if(nums[s] < min) {
                    min = nums[s];
                    index = s;
                }
                break;
            }
            if(nums[s] <= nums[m]){
                if(nums[s] < min) {
                    min = nums[s];
                    index = s;
                }
                s = m + 1;
            }else{
                if(nums[m] < min) {
                    min = nums[m];
                    index = m;
                }
                min = Math.min(min,nums[m]);
                e = m - 1;
            }
        }
        return index;

    }
}
