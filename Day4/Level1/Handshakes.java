package Level1;
import java.util.*;
public class Handshakes {
    public static void maxHandshakes(int n){
        int max=(n*(n-1))/2;
        System.out.println("Max Handshakes= "+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of people");
        int n=sc.nextInt();
        maxHandshakes(n);

    }
}
