package Arrays;

public class occurane {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6,9,9,5};
        int num=9;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;

            }
        }
        System.out.println(num+" occured "+count+" times");
        }
    }
