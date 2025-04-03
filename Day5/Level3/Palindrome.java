package Level3;
import java.util.*;
public class Palindrome {
    public static boolean isPalindromeLoops(String s){
        int si=0; int ei=s.length()-1;
        for(int i=0;i<(s.length())/2;i++){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static boolean isPalindromeCharacterArrays(String s){
        char [] ch1=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            ch1[i]=s.charAt(i);
        }
        char[] ch2=s.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromeUsingRecursion(String s,int si,int ei){
        if(si==ei){
            return true;
        }
        if(s.charAt(si)!=s.charAt(ei)){
            return false;
        }
        if(si<ei){
            return isPalindromeUsingRecursion(s,si+1,ei-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Checking if Palindrome using loops:"+isPalindromeLoops(s));
        System.out.println("Checking if Palindrome using Character Arrays:"+isPalindromeCharacterArrays(s));
        System.out.println("Checking if Palindrome using Recursion:"+isPalindromeUsingRecursion(s,0,s.length()-1));
    }
}
