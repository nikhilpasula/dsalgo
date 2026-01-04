package Arrays;

import java.util.Scanner;
public class secLargest {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    int secMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max&&arr[i]>=secMax){
                secMax=arr[i];
            }
        }
        if(secMax==Integer.MIN_VALUE)
            System.out.println("second largest element doesn't exists");
        else
        System.out.println("second largest number is "+secMax);
        sc.close();
}
}
