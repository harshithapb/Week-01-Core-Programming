package Level3;
import java.util.*;
public class NumberChecker3 {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=3;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int n){
        int sq=(int)Math.pow(n,2);
        int sum=0;
        while(sq>0){
            sum+=(int)Math.pow(sq%10,2);
            sq/=10;
        }
        return sum==n;
    }
    public static boolean isSpy(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        return sum==prod;

    }
    public static boolean isAutomorphic(int n){
        int sq=(int)Math.pow(n,2);
        int count=0;
        int newNum=n;
        while(newNum>0){
            newNum/=10;
            count++;
        }
        return (sq % Math.pow(10, count)) == n;
    }
    public static boolean isBuzz(int n){
        if(n%10==7 || n%7==0){
            return true;
        }
        return false;

    }
    public static void main(String [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println( n+"is  prime? "+isPrime(n));
        System.out.println( n+"is  Neon? "+isNeon(n));
        System.out.println( n+"is  Spy? "+isSpy(n));
        System.out.println( n+"is  Automorphic? "+isAutomorphic(n));
        System.out.println( n+"is  Buzz? "+isBuzz(n));
    }
}
