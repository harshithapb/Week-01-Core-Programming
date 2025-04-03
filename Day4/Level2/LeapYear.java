package Level2;
import java.util.*;
public class LeapYear {
    public static void checkLeapYear(int n){
        if(n>=1582){
            if(n%4==0 ||n%40==0){
                System.out.println(n+" is a leap year");
            }
            else{
                System.out.println(n+" is  not a leap year");
            }
        }
        else{
            System.out.println(" Cannot determine as year not part of Gregorian Calender");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year :");
        int n=sc.nextInt();
        checkLeapYear(n);

    }
}
