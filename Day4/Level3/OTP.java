package Level3;
import java.util.*;
public class OTP {
    public static int generateOTP(){
        int min=100000;
        int  max=999999;
        int range=max-min+1;
        int num=(int)(Math.random() *range)+min;
        return num;
    }
    public static int[] generateArray(){
        int[] arr =new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=generateOTP();
        }
        return arr;
    }
    public static boolean checkUnique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        int[] arr=generateArray();
        System.out.println("6 DIGIT valued  10 OTP 's are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(" Are the 6 DIGIT valued  10 OTP 's unique?: "+checkUnique(arr));
    }
}
