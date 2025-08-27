public class Practice1 {
    public static void main(String[] args){
       boolean val =prime1(5);
        System.out.println(val);
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
}
