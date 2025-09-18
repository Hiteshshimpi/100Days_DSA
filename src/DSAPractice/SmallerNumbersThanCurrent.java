import java.util.ArrayList;
import java.util.Arrays;

public class SmallerNumbersThanCurrent {

//    Input: nums = [8,1,2,2,3]
//    Output: [4,0,1,1,3]
//    Explanation:
//    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//    For nums[1]=1 does not exist any smaller number than it.
//    For nums[2]=2 there exist one smaller number than it (1).
//    For nums[3]=2 there exist one smaller number than it (1).
//    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

    public static void main(String[] args) {

       int[] nums = {8,1,2,2,3};
       // First sort them
        int val=0;
        int numsval=0;

        int numsSorted[] = Arrays.stream(nums).sorted().toArray();
       int [] res = new int[nums.length];
        for(int i= 0;i<numsSorted.length;i++){
            if(numsSorted[i]!=numsSorted[i+1]){
                 val = numsSorted[i];
                numsval=nums[val];
                res[numsval]=i;
            }
            else
            {
              res[numsval]=i;
              numsval++;
            }
        }
        System.out.println(res);
    }
}
