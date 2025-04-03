package Level1;
import java.util.*;
public class Substring {
    public static String generateSubstr(String a,int si,int ei){
        String ans="";
        for(int i=si;i<ei;i++){
            ans+=a.charAt(i);
        }
        return ans;
    }
    public static boolean cmp(String ans ,String b){
        if(ans.length()!=b.length()){
            return false;
        }
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static String generateSubstrWithBuiltIn(String a, int si,int ei){
        return a.substring(si,ei);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str=sc.nextLine();
        System.out.println("Enter si inclusive:");
        int si=sc.nextInt();
        System.out.println("Enter ei not inclusive:");
        int ei=sc.nextInt();
        System.out.println("The substring is :"+generateSubstr(str,si,ei));
        System.out.println(" is substr and string equal?"+cmp(generateSubstr(str,si,ei),str));
        System.out.println("Substring created with built in method:"+generateSubstrWithBuiltIn(str,si,ei));
    }
}
