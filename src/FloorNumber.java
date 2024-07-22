public class FloorNumber {
    static int getFloorNum(int[] arr, int target){
        int s =0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(target == arr[m])
                return arr[m];
            else if(target > arr[m])
                s = m+1;
            else
                e = m-1;
        }
        if(e < 0)
            return -1;
        else
            return arr[e];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(getFloorNum(arr,target));
    }
}
