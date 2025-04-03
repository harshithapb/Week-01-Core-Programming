package Level2;
import java.util.*;
public class Quadratic {
    public static double[] quad(int a,int b,int c){
        double [] ans=new double[2];
        double delta=Math.pow(b,2) +4*a*c;
        double root=0.0;
        if (delta==0 ){
            root=-b/(2*a);
            ans[0]=ans[1]=root;
        }//(-b + delta)/(2*a
        else if(delta>0){
            double num1=-b+Math.sqrt(delta);
            ans[0]=num1/(2*a);
            double num2=-b-Math.sqrt(delta);
            ans[0]=num2/(2*a);
        }
        else{
            return ans;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter value of a ,b,c :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double[] ans=new double[2];
        ans=quad(a,b,c);
        System.out.println(" Roots are:");
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
