package Level1;
import java.util.*;
public class Chocolates {
    public static int[] findRemainderAndQuotient(int number, int divisor){
       int[] arr=new int[2];
        arr[0] = number / divisor;
        arr[1] = number % divisor;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Of chocolates:");
        int[] arr=new int[2];
        int  numberOfchocolates=sc.nextInt();
        System.out.println("Enter the numberOfChildren:");
        int  numberOfChildren=sc.nextInt();
        arr= findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
        System.out.println("Number of chocolates each child gets "+arr[0]);
        System.out.println(" number of remaining chocolates "+arr[1]);
    }
}
