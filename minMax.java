public class minMax {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,9};
        findMinMax(arr);
    }
    static void findMinMax(int [] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min >arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max+"max");
        System.out.println(min+"min");


    }
    
}
