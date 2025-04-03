package Level2;
import java.util.*;
public class RecursionSum {
    public static int recursion(int n){
        int sum=0;
        if(n==1){
             return n;
        }
       sum= n+recursion(n-1);
        return sum;
    }
    public static int sumFunction(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int ans1=recursion(n);
        System.out.println("Recursion sum:" +ans1);
        int ans2=sumFunction(n);
        System.out.println("Formula sum:" +ans2);
        if(ans1==ans2){
            System.out.println("Both give same sum" );
        }

    }
}
