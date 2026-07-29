package Revise;

public class MountainArray {
    static void main() {
        //int arr[] ={1,2,3,4,5,3,2,0};
        int[] arr={7,1,2,5,3,2,0};
//        int peak1 = 0;
//        if(arr.length <3) {
//            System.out.println("It is not an mountain array!!");
//        }
//        int i =0;
//        int j=i+1;
//        while(i<arr.length-1){
//           if(arr[i]<arr[j])
//           {
//               i++;
//               j++;
//           }
//           else if(arr[i]>arr[j]){
//               if(arr[i]>peak1)
//               {
//                   peak1=arr[i];
//               }
//               i++;
//               j++;
//           }
//           else {
//               System.out.println("It is not an mountain array!!");
//           }
//
//        }
//        System.out.println("It is mountain array");
//        System.out.println(peak1);

        // new logic
        if(arr.length<3){
            System.out.println("It is not an mountain array!!");
        }
        int a =0;
        while(a+1 < arr.length && arr[a]<arr[a+1])
        {
            a++;
        }
        while(a+1 < arr.length && arr[a]>arr[a+1])
        {
            a++;
        }
        System.out.println(a);
        if (a == arr.length-1)
        {
            System.out.println("It is mountain array");
        }
        else
        {
            System.out.println("It is not an mountain array!!");
        }
    }
}
