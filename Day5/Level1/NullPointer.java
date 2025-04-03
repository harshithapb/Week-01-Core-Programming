package Level1;
import java.util.*;
public class NullPointer {
    public static void generateException(String s){
        try{
            if(s.equals("pgm4")){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
        catch(NullPointerException e){
            System.out.print("NullPointerException Caught");
        }

    }
    public static void generateStr( String s){

        try{
            if("pgm1".equals(s)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
        catch(NullPointerException e){
            System.out.print("NullPointerException Caught");
        }
    }
    public static void main(String[] args){
        String s=null;
        System.out.println("Using literal cmp with string");
        generateStr(s);
        System.out.println("Using string cmp with literal");
        generateException(s);
    }
}
