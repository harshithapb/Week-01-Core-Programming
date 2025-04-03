package Level3;
import java.util.*;
public class Students {
    public static float[][] generateMarks(int n){
        float[][] marks=new float[n][3];
        for(int i=0;i<n;i++){
            marks[i][0]= (int)(Math.random() *(99-10))+10;
            marks[i][1]= (int)(Math.random() *(99-10))+10;
            marks[i][2]= (int)(Math.random() *(99-10))+10;
        }
        return marks;
    }
    public static double[][] calculations(float[][] arr){
        double[][] cal=new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            double total= arr[i][0]+arr[i][1]+arr[i][2];
            cal[i][0] = Math.round(total * Math.pow(10, 2)) / Math.pow(10, 2);
            double avg=cal[i][0]/300;
            cal[i][1]=Math.round(avg * Math.pow(10, 2)) / Math.pow(10, 2);//avg
            double percent=cal[i][1]*100;
            cal[i][2]=percent;
            //cal[i][2]=Math.round(percent*Math.pow(10,2))/Math.pow(10,2);
        }
        return cal;
    }
    public static void printScoreCard(float[][] marks, double[][] arr){
        System.out.println("Math"+ "\t "+"Phy"+" \t"+"Chem"+"\t"+ "Total" +"\t"+"Average"+"\t"+ "Percentage");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i][0] +"\t"+ marks[i][1] + "\t"+marks[i][2]+"\t"+arr[i][0]+"\t"+arr[i][2]+"\t"+arr[i][2]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        float[][] arr1=generateMarks(n);
        double[][]arr2=calculations(arr1);
        printScoreCard(arr1,arr2);
    }
}
