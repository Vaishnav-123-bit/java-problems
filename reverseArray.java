import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printReverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void printReverse(int []arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    
}
