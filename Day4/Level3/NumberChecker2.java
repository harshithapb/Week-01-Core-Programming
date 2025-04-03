package Level3;
import java.util.*;
public class NumberChecker2 {
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
    public static int[] rev(int[] digits){
        //1 2 3 4 5
        //5 4 3 2 1
        int [] temp=new int[digits.length];
        int idx=digits.length-1;
        for(int i=0;i<digits.length;i++){
            temp[i]=digits[idx--];
        }
        return temp;

    }
    public static boolean cmp(int [] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int[] digits){
        int[] revDigits= rev(digits);
        return cmp(digits,revDigits);
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
        int[] revdigits=rev(digits);
        System.out.println("Digits in reverse are: ");
        for(int i=0;i<revdigits.length;i++){
            System.out.print(revdigits[i]+" ");
        }
        System.out.println();
        System.out.println("Enter 2 arrays of size 5");
        System.out.println("Enter 1st array");
        int [] arr1=new int[5];
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array");
        int [] arr2=new int[5];
        for(int i=0;i<5;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Array1 and Array2 are equal ?:"+cmp(arr1,arr2));
        System.out.println(n+ " is a Palindrome?"+ palindrome(digits));
        System.out.println(n +" is a duck number ? "+duckNumber(digits));





    }
}
