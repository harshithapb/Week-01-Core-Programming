package Level1;
import java.util.*;
public class ArrayComparison {
    public static char[] returnArray(String a){
        char[] ans=new char[a.length()];
        for(int i=0;i<a.length();i++){
            ans[i]=a.charAt(i);
        }
        return ans;
    }
    public static boolean cmpStringArrays(String []arr1, String[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static boolean cmpCharArrays(char []arr1, char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static char[] generateCharBuiltIn(String str){
        return str.toCharArray();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
        System.out.println("Char array generated : ");
        char[] arr=returnArray(str);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Char array generated with built in fn: ");
        char[] arr1=generateCharBuiltIn(str);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Are both  char arrays equal?"+cmpCharArrays(arr,arr1));
        System.out.println("Enter 1st string array of length 5:");
        String[] str1=new String[5];
        for(int i=0;i<5;i++){
            str1[i]=sc.nextLine();
        }
        System.out.println("Enter 2nd string array of length 5:");
        String[] str2=new String[5];
        for(int i=0;i<5;i++){
            str2[i]=sc.nextLine();
        }
        System.out.println("Are both arrays equal?"+cmpStringArrays(str1,str2));
    }
}
