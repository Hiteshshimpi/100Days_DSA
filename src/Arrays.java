import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        // Running sum of arrays 1408 leetcode
//        Input: nums = [1,1,1,1,1]
//        Output: [1,2,3,4,5]
//        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

        int [] arr = {1,1,1,1,1};
        runningSum(arr);
    }

    public  static void runningSum(int[] arr){

        int sum =0;
      for(int i =0;i<arr.length;i++)
      {
          sum =sum +arr[i];
          arr[i+1-1]=sum;

      }
        System.out.println(sum);
        System.out.println(java.util.Arrays.toString(arr));

    }
}
