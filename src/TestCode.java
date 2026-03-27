import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCode {
public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1,0,1,2,-1,-4));
        for(int i=0;i<nums.size()-1;i++)
        {
            for(int j=i+1;j<nums.size()-2;j++)
            {
                int k = j+1;
                int left = nums.get(i);
                int mid = nums.get(j);
                int right = nums.get(k);
                if(left != mid && left != right && mid != right)
                {
                    int sums = nums.get(i) +nums.get(j)+nums.get(k);
                    if(sums == 0)
                    {
                        System.out.println(nums.get(i)+" and " + nums.get(j)+" and " +nums.get(k));
                    }
                }
                j++;
                k++;
            }
        }
    }    
}
