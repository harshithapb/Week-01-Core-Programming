package Level3;
import java.util.*;
public class NumberChecker {
    public static int count(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
    public static int[] storeDigits(int n,int c){
        int[] digits=new int[c]; //1234
        for(int i=0;i<c;i++){
            digits[i]=n/(int)Math.pow(10,c-i-1);
            n=n-digits[i]* (int)Math.pow(10,c-i-1);
        }
        return digits;
    }
    public static boolean duckNumber(int[] digits){
        int sum=0;
        boolean ans=false;
        for(int i=0;i<digits.length;i++){
            if (digits[i]!=0){
                return true;
            }
        }
        return ans;
    }
    public static boolean armstrongNumber(int [] digits,int n){
        int sum=0;
        boolean ans=true;
        for(int i=0;i<digits.length;i++){
            sum+=(int)Math.pow(digits[i],3);
        }
        if(sum!=n){
            ans=false;
        }
        return ans;
    }
    public static int[] findLargest(int [] digits){
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if (digits[i]>largest){
                secLargest=largest;
                largest=digits[i];
            }
            else if(digits[i]>secLargest && digits[i]!=largest){
                secLargest=digits[i];
            }
        }
        int [] large=new int[2];
        large[0]=largest;
        large[1]=secLargest;
        return large;
    }
    public static int[] findSmallest(int [] digits){
        int smallest=Integer.MAX_VALUE;
        int secSmallest=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if (digits[i]<smallest){
                secSmallest=smallest;
                smallest=digits[i];
            }
            else if(digits[i]<secSmallest && digits[i]!=smallest){
                secSmallest=digits[i];
            }
        }
        int [] small=new int[2];
        small[0]=smallest;
        small[1]=secSmallest;
        return small;
    }
    public static void main(String [] arr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int c=count(n);
        System.out.println("Count of Digits is: "+c);
        int [] digits=new int[c];
        digits=storeDigits(n,c);
        System.out.print("Digits are: ");
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
        System.out.println(n +" is a duck number ? "+duckNumber(digits));
        System.out.println(n +" is an Armstrong number ? "+armstrongNumber(digits,n));
        System.out.print(" Largest and Second Largest are:");
        int[] ans1=new int[2];
        ans1=findLargest(digits);
        System.out.println(ans1[0]+"," +ans1[1]);
        System.out.print(" Smallest and Second Smallest are:");
        int[] ans2=new int[2];
        ans2=findSmallest(digits);
        System.out.println(ans2[0]+"," +ans2[1]);



    }
}
