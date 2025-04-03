package Level3;
import java.util.*;
public class Players {
    public static float calcSum(float [] arr){
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static float calcMean(float sum, int n){
        return sum/n;
    }
    public static float calcShortest(float [] arr){
        float shortest=Float.MAX_VALUE;
        float tallest=Float.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<shortest){
               shortest=arr[i];
           }
        }
        return shortest;
    }
    public static float calcTallest(float [] arr){
        float tallest=Float.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>tallest){
                tallest=arr[i];
            }
        }
        return  tallest ;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float [] height=new float[11];
        int min=150;
        int max=250;
        int range=max-min+1;
        System.out.println(" Heights generated b/w 150 cm and 250 cm");
        for(int i=0;i<height.length;i++){
            height[i]=(int)(Math.random()*range) +min;
            System.out.print(height[i]+" ");
        }
        System.out.println();
        System.out.print("Sum of heights:");
        System.out.println(calcSum(height));
        System.out.print("Mean of heights:");
        System.out.println(calcMean(calcSum(height),height.length));
        System.out.print("Shortest of heights:");
        System.out.println(calcShortest(height));
        System.out.print("Tallest of heights:");
        System.out.println(calcTallest(height));

    }
}
