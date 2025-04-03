package Level1;
import java.util.*;
public class NumberFormat{
    public static void generateException(String s){
        try{
            int number=Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println();
            handleException();
        }
    }
    public static void handleException(){
        System.out.println("NumberFormatException occurred");
        System.out.println("String cannot be converted to integer ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter str:");
        String s = sc.nextLine();
        generateException(s);

    }
}
