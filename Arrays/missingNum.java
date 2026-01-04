package Arrays;

public class missingNum {
    public static void main(String[] args) {
        int sum=0,nat;
        int arr []={1,2,4,5};
          int n=5;
        nat=(n*(n+1))/2;
        for(int val:arr){
            sum+=val;
        }
        int miss=nat-sum;
        System.out.println("missing element in the array is "+miss);

    }
}
