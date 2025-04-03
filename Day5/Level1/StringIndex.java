package Level1;
import java.util.*;
public class StringIndex {
    public static void generateException(String s){
        try{
            for(int i=0;i<=s.length();i++){
                System.out.print(s.charAt(i));
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println();
            handleException();
        }
    }
    public static void handleException(){
        System.out.println("String length exceeded;");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter str:");
        String s = sc.nextLine();
        generateException(s);
    }
}
