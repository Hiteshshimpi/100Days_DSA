package Revise;

public class EncodeString {
    public  static void main(String[] args)
    {
        String s ="ddmmmmtta";
        StringBuilder res= new StringBuilder();
        int j=1;
        int count=1;
        int i=0;
        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                count+=1;
                j+=1;
            }
            else {
                res.append(s.charAt(i));
                res.append(count);
                i=j;
                j+=1;
                count=1;
            }

        }
        res.append(s.charAt(i));
        res.append(count);

        System.out.println(res.toString());
    }
}
