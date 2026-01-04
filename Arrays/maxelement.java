package Arrays;
import java.util.Scanner;
public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        System.out.println("enter the array size");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int curMax=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(curMax<arr[i]){
                curMax=arr[i];
                count=1;
            }
            else if(arr[i]==curMax){
                count++;

            }
        }
        System.out.println("max element in the array is "+curMax);
        System.out.println("and it appeared "+count+" times");
       

    }
}
