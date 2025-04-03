package Level1;
import java.util.*;
public class Compare {
    public static boolean cmp(String a ,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean cmpBuiltIn(String a ,String b){
        return a.equals(b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String a=sc.nextLine();
        System.out.println("Enter 2nd string:");
        String b=sc.nextLine();
        System.out.println("Cmp using charAt:"+cmp(a,b));
        System.out.println("Cmp using equals:"+cmpBuiltIn(a,b));

    }
}
