package Revise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MaximumQuantity {
    public static void main(String [] args){
        HashMap<String,Integer> maps1 = new HashMap<>();
        int maxVal = Integer.MIN_VALUE;
        String[] arr={"xyz 9","abc 20","xyz 31"};
        for(String i: arr)
        {
            String [] parts = i.split(" ");
            String key = parts[0];
            int value= Integer.parseInt(parts[1]);
            maps1.put(key,maps1.getOrDefault(key,0)+value);
//            if(!maps1.containsKey(key))
//            {
//                maps1.put(key,value);
//            }
//            else {
//                maps1.put(key, maps1.get(key) + value);
//            }
        }
        System.out.println(maps1);

        for(int vals:maps1.values())
        {
            if(vals > maxVal)
            {
                maxVal = vals;
            }
        }
        System.out.println("Maximum quantity: "+maxVal);
    }
}
