public class RotateArray90 {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
                };



        //getting the tranpose, by swapping (0,0),(0,1)
        for(int row =0;row<a.length;row++)
        {
            for(int col=row;col<a[0].length;col++){
                int val = a[row][col]; //5
                a[row][col] = a[col][row];
                a[col][row]=val;
            }

        }

        //not swapping again with the 1st and last index and 2nd and 3rd index
        for(int i=0;i<a.length;i++)
        {
            int l=0;
            int r = a[0].length-1;

            while(l<r)
            {
                int temp = a[i][l];
                a[i][l]=a[i][r];
                a[i][r]=temp;
                l++;
                r--;
            }
        }


        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


}

