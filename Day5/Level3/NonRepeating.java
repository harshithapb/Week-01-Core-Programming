package Level3;
import java.util.*;
public class NonRepeating {
    static final int  CHAR=256;
    public static char firstNonRepeating(String s){
        int count[]=new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return Character.MIN_VALUE;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("First non repeating character is:");
        System.out.println(firstNonRepeating(s));
    }

}
