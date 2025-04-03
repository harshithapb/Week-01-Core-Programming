package Level1;
import java.util.*;
public class SpringSeason {
    public static boolean season(int m , int d){
        //March 20 to June 20
        boolean ans=true;
        if(m>=3 && m <=6){
            if(m==3 && (d<20)){
                ans=false;
            }
            else if(m==6 && d>20){
                ans=false;
            }
            else{
                ans=true;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        int m=sc.nextInt();
        System.out.println("Enter date");
        int d=sc.nextInt();
        System.out.println(season(m,d));


    }
}
