package Level1;
import java.util.*;
public class Upper {
    public static String convertToUpper(String s){
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                int ascii=(int)s.charAt(i);
                s1+=(char)(ascii-32);
            }
            else{
                s1+=s.charAt(i);// for blank spaces and other char
            }
        }
        return s1;
    }
    public static boolean cmpStrings(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter str:");
        String s=sc.nextLine();
        String str1=convertToUpper(s);
        String str2=s.toUpperCase();
        System.out.println(str1+" is using user function");
        System.out.println(str2+" is using in built function");
        System.out.println("Are both equal ?:"+cmpStrings(str1,str2));

    }
}
