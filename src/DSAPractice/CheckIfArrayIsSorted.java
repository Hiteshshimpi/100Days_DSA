package DSAPractice;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        boolean is_Sorted =true;

        for(int i=1;i<arr.length;i++){
            if(arr[i] <arr[i-1]){
                is_Sorted =false;
                break;
            }
        }
        System.out.println(is_Sorted ? "Array is Sorted" : "Array is not sorted");
    }
}
