package Level3;
import java.util.*;
public class Eucledian {
    public static double calcDistance(int x1,int x2,int y1, int y2){
        double a=Math.pow(x2-x1,2);
        double b=Math.pow(y2-y1,2);
        double ans=Math.sqrt(a+b); //+Math.sqrt(b);

        return ans;
    }
    public static float[] calcSlope(int x1,int x2,int y1, int y2){
        float slope= (float) (y2 - y1) /(x2-x1);
        float[] ans=new float[2];
        float b=y1-(slope*x1);
        ans[0]=slope;
        ans[1]=b;
        return ans;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ord of x1,x2,y1,y2");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("Eucledian distance= "+calcDistance(x1,x2,y1,y2));
        float[] ans=calcSlope(x1,x2,y1,y2);
        System.out.println(" value of slope and  b :"+ ans[0]+ " "+ans[1]);
    }
}
