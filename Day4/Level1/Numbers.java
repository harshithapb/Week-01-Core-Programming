package Level1;
import java.util.*;
public class Numbers {
    public static void checkNum(int n){
        if(n>0){
            System.out.println("Number "+ n +"is Positive");
        }
        else if(n<0){
            System.out.println("Number "+ n +"  is Negative");
        }
        else{
            System.out.println("Number "+ n +"is Zero");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        checkNum(n);
    }
}


