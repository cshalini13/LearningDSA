public class CeilingNumber {
    static int getCeilingNum(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(target == arr[m])
                return arr[m];
            else if(target > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        if(s > arr.length-1) // in case the target is greatest of all the elements in array so return -1
            return -1;
        else
            return arr[s];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(getCeilingNum(arr,target));
    }
}
