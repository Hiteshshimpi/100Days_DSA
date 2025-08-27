public class Practice1 {
    public static void main(String[] args){
       boolean val =prime1(5);
        System.out.println(val);
        evenOddNum(3);
        vowelsOrConstants('a');
        leapYear(2009);
    }
    public static boolean prime1(int num){
            if(num <=1)
            {
                return false;
            }
            else if(num % 2 ==0){
                return false;
            }
        return true;
    }

    // Homework day 1 Even and Odd

    public static void evenOddNum(int num)
    {
        for(int i =1;i<=num;i++){
            if(i % 2 ==0)
            {
                System.out.println("It is a Even Number: "+i);
            }
            else
            {
                System.out.println("It is a Odd Number: "+i);
            }
        }
    }
    // Homework day 1 Vowels and constants
    public static void vowelsOrConstants(char ch)
    {
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            System.out.println("Alphabet "+ch +" is Vowel");
        }
        else {
            System.out.println("Alphabet "+ch +" is Constant");
        }
    }

    // Homework day 1 LeapYear

    public  static  void leapYear(int year)
    {
        if((year % 4==0 && year %100!=0)|| (year % 400 ==0)){
            System.out.println(year +" this year is a leap year");
        }
        else
        {
            System.out.println(year +" this year is not a leap year");
        }
    }
}
