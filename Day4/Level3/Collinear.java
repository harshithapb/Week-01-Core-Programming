package Level3;
import java.util.*;
public class Collinear {
    public static boolean isColiinearUsingSlope(int x1,int x2,int x3,int y1,int y2,int y3){
        float slope1= (float) (y2 - y1) /(x2-x1);
        float slope2= (float) (y3 - y2) /(x3-x2);
        float slope3= (float) (y3 - y1) /(x3-x1);
        return (slope1==slope2) &&(slope1==slope3);
    }
    public static boolean isCollinearUsingTriangleFormula(int x1,int x2,int x3,int y1,int y2,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ord of x1,x2,x3,y1,y2,y3");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int y3=sc.nextInt();
        System.out.println("Are the co-ord collinear using slope method?"+isColiinearUsingSlope(x1,x2,x3,y1,y2,y3));
        System.out.println("Are the co-ord collinear using Area of triangle method?"+isCollinearUsingTriangleFormula(x1,x2,x3,y1,y2,y3));
    }
}
