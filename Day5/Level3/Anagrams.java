package Level3;
import java.util.Scanner;
public class Anagrams {
    static final int CHAR=256;
    public static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        System.out.println("are the inputs anagram?:"+checkAnagram(s1,s2));
    }
}
