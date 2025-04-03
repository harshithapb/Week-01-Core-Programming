package Level1;
import java.util.*;
public class SumNaturals {
    public static void sum(int n){
        int sumOfN=0 ;
        for(int i=0;i<=n;i++){
            sumOfN+=i;
        }
        System.out.println("Sum:"+sumOfN);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        sum(n);
    }
}
