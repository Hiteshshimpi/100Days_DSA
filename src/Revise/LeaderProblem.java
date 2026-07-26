package Revise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeaderProblem {
    static void main() {
        int [] arr1 ={16,17,4,5,2};
        int rightMax = arr1[arr1.length-1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(rightMax);
        for(int i=arr1.length-2;i>0;i--){
            if(rightMax<arr1[i])
            {
                res.add(arr1[i]);
                rightMax=arr1[i];
            }
        }
        Collections.reverse(res);
        System.out.println("Leaders in the array: "+ res.toString());
    }

}
