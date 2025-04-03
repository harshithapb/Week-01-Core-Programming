package Level3;
import java.util.*;
public class Salary {
    public static float[][] calcSalry() {
        float[][] arr = new float[10][2];
        //[salary][years]

        for (int i = 0; i < 10; i++) {
            arr[i][0] = (int) (Math.random() * (99999 - 1000)) + 10000;
            arr[i][1] = (int) (Math.random() * (100 - 1)) + 1;
        }
        return arr;

    }

    public static float[][] newSalaryCalc(float[][] arr) {
        //[new salary][bonus]
        float[][] arr1 = new float[10][2];
        for (int i = 0; i < 10; i++) {
            if (arr[i][1] > 5) {
                arr1[i][1] = arr[i][0] * 5 / 100;
            } else {
                arr1[i][1] = arr[i][0] * 2 / 100;
            }
            arr1[i][0] = arr[i][0] + arr1[i][1];
        }
        return arr1;
    }

    public static void newSalaryCalcAndPrint(float[][] arr1, float[][] arr2) {
        //float[][] arr1 = new float[10][3];
        System.out.println(" Old Salary" + "    " + " New Salary  " + "     " + " Bonus");
        float old = 0;
        float newSal = 0;
        float bonus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(arr1[i][0] + "    " + arr2[i][0] + "    " + arr2[i][1]);
            old += arr1[i][0];
            newSal += arr2[i][0];
            bonus += arr2[i][1];
        }
        System.out.println(" Total Old Salary" + "    " + " Total New Salary  " + "     " + "  Total Bonus");
        System.out.println(old + "   " + newSal + "   " + bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] arr=new float[10][2];
        arr=calcSalry();
        System.out.println("Salary and Year are:");
        for(int i=0;i<10;i++){
            System.out.println(arr[i][0] +"  "+ arr[i][1]);
        }
        float [][]arr1=newSalaryCalc(arr);
        System.out.println("New Salary and Bonus are:");
        for(int i=0;i<10;i++){
            System.out.println(arr1[i][0] +"  "+ arr1[i][1]);
        }
        newSalaryCalcAndPrint(arr,arr1);

    }
}
//}    0       1           2
//    sal    year
//  0   0,0   0,1           0,2
//   1   1,0       1,1
//2      2,0       2,1