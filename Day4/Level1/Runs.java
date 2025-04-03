package Level1;
import java.util.*;
public class Runs {
    public static void rounds(float s1,float s2,float s3){
        float perimeter=(s1+s2+s3);//m
        int r=Math.round(5000/perimeter);
        System.out.println("Rounds required :"+r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle in meters");
        float side1=sc.nextFloat() ;
        float side2=sc.nextFloat() ;
        float side3=sc.nextFloat() ;
        rounds(side1,side2,side3);

    }
}
