import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number Of chocolates :");
		int numberOfchocolates=sc.nextInt();
		System.out.println("Enter number Of children :");		
		int numberOfChildren=sc.nextInt(); 
		int ans=numberOfchocolates/numberOfChildren; 
		int rem=numberOfchocolates%numberOfChildren;  
		System.out.println("The number of chocolates each child gets is  "+ ans+ " and the number of remaining chocolates are  " +  rem); 
	} 
} 

