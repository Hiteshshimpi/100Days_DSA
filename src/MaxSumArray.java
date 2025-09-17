import java.util.HashMap;

public class MaxSumArray {

    //Input: nums = [1,1,1], k = 2
    //Output: 2
    public static void main(String[] args) {
            int[] nums={1,1,1};
        HashMap<Integer,Integer> hash= new HashMap<>();
            int count=0;
            int sum=0;
            int k=2;
            for(int i=0;i<nums.length;i++)
            {
                sum =sum+nums[i];
                if(sum==k) count++;
                if(hash.containsKey(sum-k)){
                    count =count+hash.get(sum-k);
                }
                else
                {
                    hash.put(sum,hash.getOrDefault(sum,0)+1);
                }
            }

        System.out.println(hash);
        System.out.println(count);

    }
}
