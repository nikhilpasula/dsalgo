package Arrays;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        int  sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int val: arr){
            sum+=val;
        }
        System.out.println("sum is "+sum);
    }
}
