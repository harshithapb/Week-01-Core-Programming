package Level2;
import java.util.*;
public class Numbers {
    public static boolean[] isPositive(int[] arr){
        boolean[] ans=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) {
                ans[i] = true;
            }
            else{
                ans[i]=false;
            }
        }
        return ans;
    }
    public static boolean isEven(int n){
        boolean ans=true;
        if(n%2==0){
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;
    }
    public static int comapre(int[] arr){
        int ans=0;

        if(arr[0]>arr[arr.length-1]){
           ans=1;
        }
        else if(arr[0]<arr[arr.length-1]){
            ans=-1 ;
        }
        else{
            ans= 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  5 numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean[] positive= new boolean[arr.length];
        positive= isPositive(arr);
        boolean even=true;
        for(int i=0;i<positive.length;i++){
            if(positive[i]){
                System.out.println(arr[i]+" is positive ");
                even=isEven(arr[i]);
                if(even){
                    System.out.println(arr[i]+" is even");
                }
                else{
                    System.out.println(arr[i]+" is not even");
                }
            }
            if(!positive[i]){
                System.out.println(arr[i]+" is negative ");
            }
        }
        int cmp=comapre(arr);
        if (cmp == 1) {
            System.out.println("First element is greater  than last element of array ");
        }
        else if(cmp==-1){
            System.out.println("First element is lesser  than last element of array ");
        }
        else{
            System.out.println("First and last elements of array are equal");
        }
    }
}
