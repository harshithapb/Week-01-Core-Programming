package Level2;
import java.util.*;
public class Trim {
    public static int[] trimmer(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end && Character.isWhitespace(s.charAt(start))){
            start++;
        }
        while(end>=start && Character.isWhitespace(s.charAt(end))){
            end--;
        }
        return  new int[]{start,end};
    }
    public static String  generateSubstring(String s, int si, int ei){
        String ans="";
        for(int i=si;i<=ei;i++){
            ans+=s.charAt(i);
        }
        return ans;

    }
    public static boolean cmp(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=(s2.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println(" string with trim fn:");
        String ans1=s.trim();
        System.out.println(ans1);
        System.out.println(" string with user fn:");
        int[] arr=trimmer(s);
        String ans2=generateSubstring(s,arr[0],arr[1]);
        System.out.println(ans1);
        System.out.println("Are both trimmed string equal? :"+cmp(ans1,ans2));
//        System.out.println(ans1.equals(ans2));
    }
}
