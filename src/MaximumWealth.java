public class MaximumWealth {

//    Input: accounts = [[1,2,3],[3,2,1]]
//    Output: 6
//    Explanation:
//            1st customer has wealth = 1 + 2 + 3 = 6
//            2nd customer has wealth = 3 + 2 + 1 = 6
//            Both customers are considered the richest with a wealth of 6 each, so return 6.
    public static void main(String[] args) {
        int nums [][] = {
                        {1,2,4},
                        {3,2,1}
                        };
        int len = nums.length;
        int width = nums[0].length;
        int sum =0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<len;i++)
        {
            for(int j=0;j<width;j++)
            {
                sum = sum +nums[i][j];
            }
            if(sum>max)
            {
                max =sum;
            }
            System.out.println(sum);
            sum=0;
        }

    }
}
