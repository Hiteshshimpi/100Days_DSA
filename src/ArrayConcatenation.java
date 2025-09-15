public class ArrayConcatenation {

//    Example 1:
//    Input: nums = [1,2,1]
//    Output: [1,2,1,1,2,1]
//    Explanation: The array ans is formed as follows:
//    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//    - ans = [1,2,1,1,2,1]
    public static void main(String[] args) {
        int nums [] = {1,3,2,1};
        int leng= nums.length *2;
        int res[]=new int[leng];
        int j=0;

        for(int i=0;i<nums.length;i++)
        {
            res[i]=nums[i];
        }
        for(int i=nums.length;i<res.length;i++)
        {
            res[i]=nums[j];
            j++;

        }
        System.out.println(leng);
        System.out.println(java.util.Arrays.toString(res));
    }
}
