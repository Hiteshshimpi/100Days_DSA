package Revise;

public class DecodeString {
    public static void main(String[] args) {
        String input ="d3m4t2b0a1";   // Output: dddmmmmttaa
        StringBuilder output = new StringBuilder();
        int j=0;
        char oldch=' ';

        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(Character.isDigit(ch))
            {
                int num = ch - '0';
                System.out.println("num: "+num);
                for(int k=0;k<num;k++)
                {
                    output.append(oldch);
                }
            }
            oldch= input.charAt(i);

            j = j+1;
        }
        System.out.println(output);
    }
}
