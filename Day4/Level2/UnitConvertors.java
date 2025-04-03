package Level2;
import java.util.*;
public class UnitConvertors {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius=(fahrenheit - 32) * 5 / 9;;
        return fahrenheit2celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius){
        double celsius2fahrenheit=(celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    public static double convertKilogramsToPounds(double kilograms){
        double  pounds2kilograms=kilograms*0.453592;
        return pounds2kilograms;
    }
    public static double convertPoundsToKilograms(double pounds){
        double  kilograms2pounds =pounds* 2.20462;
        return kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons){
        double gallons2liters =gallons* 3.78541;
        return gallons2liters;
    }
    public static double convertLitersToGallons(double liters){
        double liters2gallons = liters*0.264172;
        return liters2gallons;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in farhenheit to convert to celsius:");
        double n1=sc.nextDouble();
        System.out.println("Enter in celsius to convert to farhenheit :");
        double n2=sc.nextDouble();
        System.out.println("Enter in pounds to convert to kilograms  :");
        double n3=sc.nextDouble();
        System.out.println("Enter in kilograms to convert to pounds  :");
        double n4=sc.nextDouble();
        System.out.println("Enter in gallons to convert to liters  :");
        double n5=sc.nextDouble();
        System.out.println("Enter in liters to convert to gallons  :");
        double n6=sc.nextDouble();


        System.out.println( n1 +" fahrenheit to celsius :" +convertFahrenheitToCelsius(n1));
        System.out.println( n2 +"celsius to fahrenheit :" +convertCelsiusToFahrenheit(n2));
        System.out.println( n3 +" pounds to kilograms :" +convertPoundsToKilograms(n3));
        System.out.println( n4 +" kilograms to pounds  :" +convertKilogramsToPounds(n4));
        System.out.println( n5 +" gallons to  liters  :" +convertKilogramsToPounds(n5));
        System.out.println( n6 +" liters  to gallons  :" +convertKilogramsToPounds(n6));
    }
}
