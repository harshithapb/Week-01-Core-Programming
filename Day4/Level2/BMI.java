package Level2;
import java.util.*;
public class BMI {
    public static void bmi(double arr[][]){
        for (int i=0;i<arr.length;i++){
            arr[i][2]=(arr[i][2]/100)*(arr[2][1]/100);
            arr[i][2]=arr[i][0]/arr[i][1];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][2]<=18.4){
                System.out.println("Person " +(i+1)+ "weight :"+ arr[i][0]+" height :"+ arr[i][1] +"BMI Status : Underweight");
            }
            else if(arr[i][2]>=18.5 && arr[i][2]<=24.9){
                System.out.println("Person " +(i+1)+ "weight :"+ arr[i][0]+" height :"+ arr[i][1] +"BMI Status : Normal");
            }
            else if(arr[i][2]>=25.0 && arr[i][2]<=39.9){
                System.out.println("Person " +(i+1)+ "weight :"+ arr[i][0]+" height :"+ arr[i][1] +"BMI Status : Overweight");
            }
            else{
                System.out.println("Person "+ (i+1)+ "weight :"+ arr[i][0]+" height :"+ arr[i][1] +"BMI Status : Obese");
            }

        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double [][] arr=new double[10][3];
        System.out.println("Enter the weight of 10 students in cm :");
        for(int i=0;i<arr.length;i++){
            arr[i][0]=sc.nextDouble();
        }
        System.out.println("Enter the height of 10 students in cm :");
        for(int i=0;i<arr.length;i++){
            arr[i][1]=sc.nextDouble();
        }
        bmi(arr);
    }
}
