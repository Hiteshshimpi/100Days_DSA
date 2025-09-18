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

    public static class SumofAllElementsTwoD {
        public static void main(String[] args) {
            int[] [] arr ={{1,2,3},{4,5,6}};
            int sum=0;
            for(int[] row : arr)
                for(int val :row)
                    sum=sum+val;

            System.out.println("Optimzed method"+sum);

            sum=0;
            for(int i=0;i<arr.length;i++)
            {
                for (int col=0;col<arr[0].length;col++)
                {
                    sum= sum+arr[i][col];
                }
            }
            System.out.println(sum);
        }

    }

    public static class ReverseArray {
        public static void main(String[] args) {
            int[] arr={1, 2, 3, 4, 5};
            int i=0;
            int j=arr.length-1;

            while (i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
