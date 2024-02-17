

import java.util.*;
public class chocolateProblems {
    static int chocolate(int []arr ,int n ,int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min){
                min=diff;

            }


        }
        return min;
    }
 public static void main(String[] args) {
    int arr[]={1,3,4,52,3};
    int n=arr.length;
    int m=5;
    int sol =chocolate(arr, n, m);
    System.out.println(sol);
    
 }   
}
