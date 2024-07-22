import java.sql.SQLOutput;

public class BookAllocation {
    //Using Linear Search
    static int countStudents(int[] arr,int pages){
        int stCount = 1;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            if(currSum + arr[i] <= pages){
                currSum += arr[i];
            }else{
                stCount++;
                currSum = arr[i];
            }
        }
        return stCount;

    }
    //using binary search
    static int findPages(int[] arr,int m){
        //if m=1 then student can have all the books so calculating sum
        int sum = 0;
        //if m = n then each student can have only one book so find the max value in array
        int max = Integer.MIN_VALUE;
        //here we got the minimum and maximum value to iterate to find the number of pages
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            max = Math.max(max,arr[i]);
        }

        //using linear search
//        int stCount;
//        for(int i=max; i<=sum; i++){
//            stCount = countStudents(arr,i);
//            if(stCount == m){
//                return i;
//            }
//        }
//        return -1;
        //using binary search
        int s = max;
        int e = sum;
        if(m > arr.length)
            return -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            int stCount = countStudents(arr,mid);
            if(stCount > m)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return s;


    }
    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};
        int m = 2;
        System.out.println(findPages(arr,m));

    }
}
