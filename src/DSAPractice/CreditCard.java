package DSAPractice;

import java.util.Arrays;

public class CreditCard {
    public static void main(String[] args) {
        String credit_card = "4818 1011 2896";
        credit_card = credit_card.replace(" ","");
        char ch=' ';
        int sumEven =0;
        int sumOdd=0;
       int multipy=0;
        int vl = credit_card.length()-1;
        System.out.println("val"+vl);
        for(int i=credit_card.length()-1;i>=0;i-- )
        {
            if(i%2==0)
            {
                ch = credit_card.charAt(i);
                multipy= Character.getNumericValue(ch)*2;
                if(multipy>9)
                {
                    int n=multipy;
                    n =n /2;
                }
                sumEven =sumEven+multipy;
            }
            else
            {
                ch = credit_card.charAt(i);
                sumOdd = sumOdd+Character.getNumericValue(ch);

            }

        }
        System.out.println("Sume is "+sumEven);
        System.out.println("Oddsume is "+sumOdd);

    }
}