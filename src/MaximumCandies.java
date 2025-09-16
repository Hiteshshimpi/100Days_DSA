import java.util.Arrays;

public class MaximumCandies {
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
//    Explanation: If you give all extraCandies to:
//              - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//              - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//              - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//              - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//              - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

    public static void main(String[] args) {
        int [] arr ={2,3,5,1,3};
        int extraCandies =3;
        int maax = Integer.MIN_VALUE;


        //1st get the max of the max
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maax)
            {
                maax=arr[i];
            }
        }
        System.out.println(maax);

        //now add the extracandies and then check with max
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+extraCandies >= maax)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
    }
}
