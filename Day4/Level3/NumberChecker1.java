package Level3;
import java.util.*;
public class NumberChecker1 {
    public static int[] storeDigits(int n){
        int c=0; int newNumber=n;
        while(newNumber>0){
            newNumber/=10;
            c++;
        }
        int[] digits=new int[c]; //1234
        for(int i=0;i<c;i++){
            digits[i]=n/(int)Math.pow(10,c-i-1);
            n=n-digits[i]* (int)Math.pow(10,c-i-1);
        }
        return digits;
    }
    public static int findSum(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=digits[i];
        }
        return sum;
    }
    public static int findSumSqures(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=(int)Math.pow(digits[i],2);
        }
        return sum;
    }
    public static boolean Harshad(int n){
        int [] arr=storeDigits(n);
        int sum=findSum(arr);
        return sum%n==0;
    }
    public static void freq(int []digits){
        int[][] arr=new int[10][2];
        for(int i=0;i<10;i++){
            arr[i][0]=i;
            arr[i][1]=0;
        }
        for(int i=0;i<digits.length;i++){
            arr[digits[i]][1]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i][0]+" :"+arr[i][1]);
        }


    }


    public static void main(String [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int[] digits=storeDigits(n);
        System.out.print("Digits are: ");
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
        System.out.println("Sum: "+findSum(digits));
        System.out.println("Sum of squares: "+findSumSqures(digits));
        System.out.println(n +" is a Harshad number ? "+Harshad(n));
        freq(digits);




    }

}
