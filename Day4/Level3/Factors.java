package Level3;
import java.util.*;
public class Factors {
    public static int[] findFactors(int n){
        int c=0;int newNumber=n;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        int [] f=new int[c];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f[idx++]=i;
            }
        }
        return f;
    }
    public static int greatestFactor(int[] ans) {
        return ans[ans.length-2];
    }
    public static int sumOfFactors(int[] f){
        int sum=0;
        for(int i=0;i<f.length;i++){
            sum+=f[i];
        }
        return sum;
    }
    public static long prodOfFactors(int[] f){
        long prod=1;//when num becomes too large ->integer overflow
        for(int i=0;i<f.length;i++){
            prod*=f[i];
        }
        return prod;
    }
    public static int prodOfCubeOfFactors(int[] f){
        int prod=1;
        for(int i=0;i<f.length;i++){
            prod*=(int)Math.pow(f[i],3);
        }
        return prod;
    }
    public static boolean checkPerfectNumber(int[] f , int n){
        int sum=sumOfFactors(f);
        return sum==n;
    }
    public static boolean checkAbundantNumber(int[] f , int n){
        int sum=sumOfFactors(f);
        return sum>n;
    }
    public static boolean checkDeficientNumber(int[] f , int n){
        int sum=sumOfFactors(f);
        return sum<n;
    }
    public static boolean checkStrongNumber(int n){
        int fact=1; int sum=0;
        int newNum=n;
        while(n>0){
            int dig=n%10;
            while(dig>0){
                fact*=dig;
                dig--;
            }
            sum+=fact;
            n/=10;
        }
        return sum==newNum;
    }





    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println( n+"factors are:? ");
        int[] arr= findFactors(n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println( "greatest divisor: "+greatestFactor(arr) );
        System.out.println( "sum of factors "+sumOfFactors(arr));
        System.out.println( "prod of factors  "+prodOfFactors(arr));
        System.out.println( "cube of product of factors "+ prodOfCubeOfFactors(arr));
       System.out.println(n+"   is Perfect? "+checkPerfectNumber(arr,n));
        System.out.println( n+" is  Abundant? "+checkAbundantNumber(arr,n));
        System.out.println( n+" is  Deficient? "+checkDeficientNumber(arr ,n));
        System.out.println( n+" is  Strong? "+checkStrongNumber(n));
    }
}
