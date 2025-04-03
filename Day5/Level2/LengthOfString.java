package Level2;
import java.util.*;
public class LengthOfString {
    public static int calLength(String s){
        int count=0; int ans=0;
        int i=0;
        try {
            while(true) {
                s.charAt(count); //used for accessing char and helps find exception
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return count;
            }
        }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a str to find length");
        String str=sc.nextLine();
        System.out.println("length using created  fn is found to be:"+calLength(str));
        System.out.println("length using in built fn is found to be:"+str.length());
    }
}
