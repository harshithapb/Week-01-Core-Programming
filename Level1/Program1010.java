import java.util.*;
class Program1010{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		float height=sc.nextFloat(); //cm  
		float base= sc.nextFloat();
		// inches 
		double h=height/2.54;   
		double b=base/2.54;
		System.out.println("  Height in cm is " + height+  "Area in square centimeters  is " +(0.5*base*height) +"Area in sqaure inches is" +(0.5*b*h)); 
	}
}

		
		