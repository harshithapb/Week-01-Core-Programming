package Level1;
import java.util.*;
public class SmallestLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest=0;
        int largest=0;
        if(number1>number2 &&number1>number3){
            largest=number1;
        }
        else if(number2>number1 && number2>number3){
            largest=number2;
        }
        else{
            largest=number3;
        }
        if(number1<number2 &&number1<number3){
            smallest=number1;
        }
        else if(number2<number1 && number2<number3){
            smallest=number2;
        }
        else{
            smallest=number3;
        }
        int[] arr={smallest,largest};
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[2];
        System.out.println("Enter the number1:");
        int n1=sc.nextInt();
        System.out.println("Enter the number2:");
        int n2=sc.nextInt();
        System.out.println("Enter the number3:");
        int n3=sc.nextInt();
       arr= findSmallestAndLargest(n1,n2,n3);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }


    }
}
