package Level1;
import java.util.*;
public class Substr {
    public static void generateException(String s, int si, int ei){
        try{
            if(ei<si){
                throw  new IllegalArgumentException(" SI grater than EI");
            }
            String ans=s.substring(2,1);
        }
        catch(IllegalArgumentException e){
            System.out.println();
            handleException();
        }
    }
    public static void handleException(){
        System.out.println("IllegalArgumentException");
        System.out.println(" Start index is greater than the end index.Out of bounds");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter str:");
        String s = sc.nextLine();
        System.out.println("Enter si:");
        int si=sc.nextInt();
        System.out.println("Enter ei:");
        int ei=sc.nextInt();
        generateException(s,si,ei);

    }
}
