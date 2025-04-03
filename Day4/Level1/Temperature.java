package Level1;
import java.util.*;
public class Temperature {
    public double calculateWindChill(double temperature, double windSpeed){
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 53.75) * windSpeed;
    }

    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int[] arr=new int[2];
        float  temp=sc.nextFloat();
        System.out.println("Enter the wind speed:");
        float  speed=sc.nextFloat();
        Temperature temperature=new Temperature();
        double ans=temperature.calculateWindChill(temp,speed);
        System.out.println("The wind chill temperature "+ans);
    }
}
