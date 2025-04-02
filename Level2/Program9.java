import java.util.*;
class Program9{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Give 3 sides in meters"); 
		float side1=sc.nextFloat(); 
		float side2=sc.nextFloat(); 
		float side3=sc.nextFloat(); 
		float perimeter=(side1+side2+side3)/1000;
		double rounds=Math.round(5/perimeter);  
		int ans=(int)rounds;
		//System.out.println(Math.round(0.6)); 
		//System.out.println(Math.round(9.8));
		System.out.println("The total number of rounds the athlete will run is " +"  to complete 5 km " + ans); 
	} 
}

