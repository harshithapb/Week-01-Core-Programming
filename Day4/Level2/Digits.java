package Level2;
import java.util.*;
public class Digits {
    public int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        int max=9999;
        int min=1000;
        int range=max-min+1;
        for(int i=0;i<5;i++){
            arr[i]=(int)(Math.random() * range) + min;
        }
        return arr;
    }
    public double[] findAverageMinMax(int[] numbers){
        double[] arr=new double[3];
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        double avg=0.0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
            avg+=numbers[i];
            avg/=numbers.length;
            arr[0]=avg;
            arr[1]=max;
            arr[2]=min;

        }
        return arr;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size to generate 4 sized random digits");
        int size=sc.nextInt();
        int[] ans1=new int[size];
        Digits dig=new Digits();
        ans1=dig.generate4DigitRandomArray(size);
        double [] ans2=new double[3];
        ans2=dig.findAverageMinMax(ans1);
        System.out.println(" 5 numbers are:");
        for(int i=0;i<ans1.length;i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println();
        System.out.println(" Avg, min ,max:");
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
