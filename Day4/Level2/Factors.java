package Level2;
import java.util.*;
public class Factors {
    public static  int[] factorOperations(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[idx]=i;
                idx++;
            }
        }
        return factors;
    }
    public static void sumOfFactors(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=i;
        }
        System.out.println("Sum Of Factors :"+ sum);
    }
    public static void productOfFactors(int[] arr){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=i;
        }
        System.out.println("Product Of Factors :"+ prod);
    }
    public static void sumOfSquares(int[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.round(Math.pow(arr[i],2));
        }
        System.out.println("Sum Of  Square of Factors :"+ sum);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int [] arr=factorOperations(n);
        System.out.println("Factors are :");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        sumOfFactors(arr);
        productOfFactors(arr);
        sumOfSquares(arr);
    }
}
