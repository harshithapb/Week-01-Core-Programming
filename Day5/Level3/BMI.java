package Level3;
import java.util.*;
public class BMI {
    public static String[][] calculateBMI(String[][] arr){
        String [][] bmi=new String[10][3];
        for(int i=0;i<10;i++){
            bmi[i][0]=arr[i][0]; //weight
            bmi[i][1]=arr[i][0];//height
            float w=Float.parseFloat(bmi[i][0]);
            float h=Float.parseFloat(bmi[i][1]);
            float b=w/(h/100*h/100);
            bmi[i][2]=Float.toString(b);
        }
        return bmi;
    }
    public static String[][] bmiStatus(String[][] bmi){
        String [][] status=new String[10][4];
        for(int i=0;i<10;i++){
            status[i][0]=bmi[i][0];
            status[i][1]=bmi[i][1];
            status[i][2]=bmi[i][2];
            float b=Float.parseFloat(status[i][2]);
            if(b<=18.4){
                status[i][3]="Underweight";
            }
            else if(b>=18.5 && b<=24.9){
                status[i][3]="Normal";
            }
            else if(b>=25 && b<=39.9){
                status[i][3]="Overweight";
            }
            else{
                status[i][3]="Obese";
            }
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[][] arr=new String[10][2];
        System.out.println("Enter weight of 10 people in kg:");
        for(int i=0;i<10;i++){
            arr[i][0]=sc.next();
        }
        System.out.println("Enter height of 10 people in cm:");
        for(int i=0;i<10;i++){
            arr[i][1]=sc.next();
        }
        String bmi[][]=calculateBMI(arr);
        String[][] status=bmiStatus(bmi);
        System.out.println("Weightb \t Height \tBMI \tStatus ");
        for(int i=0;i<status.length;i++){
            System.out.println(status[i][0]+"\t"+status[i][1]+"\t"+status[i][2]+"\t"+status[i][3]);
        }

    }
}
