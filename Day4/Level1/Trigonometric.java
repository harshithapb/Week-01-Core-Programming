package Level1;
import java.util.*;
public class Trigonometric {
    public double[] calculateTrigonometricFunctions(double angle){
        //sine,cosine,tangent arr
        double radians=Math.toRadians(angle);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        double[] arr={sin,cos,tan};
        return arr;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of angle ");
        double a=sc.nextDouble();
        double[]arr=  new double[ 3];
        Trigonometric trigno=new Trigonometric();
        arr=trigno.calculateTrigonometricFunctions(a);
        System.out.println("Sine cos and tan values in radians are:");
        for (double v : arr) {
            System.out.print(v + " ");
        }


    }
}
