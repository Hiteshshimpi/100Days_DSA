package Revise;

public class DecodeStringOptimized {
     public  static void main(String [] args) {
         String input ="d3m4t2b0a1";   // Output: dddmmmmttaa
         StringBuilder output = new StringBuilder();
         // now we would consider the input string in pairs of character and digit

         for(int i =0;i<input.length();i=i+2) //why +2 , as even index is char and odd is digit
         {
             char ch = input.charAt(i);
             int count = input.charAt(i+1)-'0';
             output.repeat(String.valueOf(ch), Math.max(0, count));

         }
         System.out.println(output);
    }
}
