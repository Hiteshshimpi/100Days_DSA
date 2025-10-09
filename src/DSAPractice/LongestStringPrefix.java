package DSAPractice;

import java.util.Arrays;

public class LongestStringPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        StringBuilder result = new StringBuilder();
        //Sort the array
        Arrays.sort(strs);
        //get the first and last index

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //start comparing

        for(int i =0;i<first.length;i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }
        System.out.println(result.toString());
    }


}
