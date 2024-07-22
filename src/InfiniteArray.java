public class InfiniteArray {
    //find the range to perform binary search
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,140, 160, 170};
        int target = 180;
        System.out.println(findResult(arr,target));
    }
    static int findResult(int[] arr, int target){
        int s=0,e=1;
        while(target > arr[e]){
            int temp = e + 1;
            e = e + (e - s + 1) * 2;
            s  = temp;

        }
        return binarySearch(arr,target,s,e);
    }

    //performing binary search
    static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target > arr[m])
                s = m + 1;
            else if (target < arr[m])
                e = m - 1;
            else
                return m;
        }
        return -1;
    }
}