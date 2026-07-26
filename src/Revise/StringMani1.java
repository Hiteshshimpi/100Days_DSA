package Revise;

import java.util.ArrayList;

public class StringMani1 {
    public static void main(String[] args) {
        String input = "abbacdaab";   // op - abcd
        ArrayList<Character> res= new ArrayList<>();
        String finalResult="";
        int j=1;
        int i=0;
        while(j<input.length())
        {
            if(input.charAt(i)!=input.charAt(j))
            {
                if(!res.contains(input.charAt(i)))
                {
                    res.add(input.charAt(i));
                    i+=1;
                    j+=1;
                }
                else
                {
                    i+=1;
                    j+=1;
                }

            }
            else
            {
                j+=1;
                i+=1;
            }
        }

        System.out.println(res.toString());
        for(Character charIndex:res)
        {
            finalResult+=charIndex;
        }
        System.out.println("Final Result: "+finalResult);
    }
}
