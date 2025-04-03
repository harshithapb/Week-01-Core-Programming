package Level1;
import java.util.*;
public class ArrayException{
    public static void generateException(String []s){
        System.out.println("Names are:");
        try{
            for(int i=0;i<=s.length;i++){
                System.out.print(s[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println();
            handleException();
        }
    }
    public static void handleException(){
        System.out.println("ArrayIndexOutOfBoundsException occurred");
        System.out.println("Array length exceeded");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[5];
        System.out.println("Enter names of 5 people:");
        for(int i=0;i<names.length;i++){
            names[i]=sc.next();
        }
        generateException(names);
    }
}
