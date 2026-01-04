package Arrays;

public class secLargest2 {
    public static void main(String[] args) {
    int arr[]={2,9,5,3,9,4};
    int max=Integer.MIN_VALUE;
    int secMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            secMax=max;
            max=arr[i];
          }else if(arr[i]<max&&arr[i]>secMax){
            secMax=arr[i];
          }
    }
    if(secMax==Integer.MIN_VALUE){
        System.out.println("second highest element doesnt exists");
    }else{
        System.out.println("second highest ele is "+secMax);
    }
}
}
