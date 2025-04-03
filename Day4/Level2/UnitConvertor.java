package Level2;
import java.util.*;

public class UnitConvertor{
    public static double convertYardsToFeet(double yards){
        double yards2feet=yards*3;
        return yards2feet;
    }
    public static double convertFeetToYards(double feet){
        double feet2yards=feet*1.60934;
        return feet2yards;
    }
    public static double convertInchToMeters(double inch){
        double meters2inches= inch*39.3701;
        return meters2inches;
    }
    public static double convertMetersToInch(double meters){
        double inches2meters=meters*0.0254;
        return inches2meters;
    }
    public static double convertInchToCentimeters(double inch){
        double inches2cm =inch*2.54;
        return  inches2cm ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in yards to convert to feet :");
        double n1=sc.nextDouble();
        System.out.println("Enter in feet to convert to yards  :");
        double n2=sc.nextDouble();
        System.out.println("Enter in inch to convert to meters :");
        double n3=sc.nextDouble();
        System.out.println("Enter in meters to convert to inch   :");
        double n4=sc.nextDouble();
        System.out.println("Enter in inch  to convert to centimeters   :");
        double n5=sc.nextDouble();


        System.out.println( n1 +" Yards to Feet :" +convertYardsToFeet(n1));
        System.out.println( n2 +" Feet To Yards :" +convertFeetToYards(n2));
        System.out.println( n3 +" Inch To Meters :" +convertInchToMeters(n3));
        System.out.println( n4 +" Meters To Inch :" +convertMetersToInch(n4));
        System.out.println( n5 +" Inch To Centimeters :" +convertInchToCentimeters(n5));

    }
}
