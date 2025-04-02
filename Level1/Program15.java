import java.util.*;
class Program15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		float price= sc.nextFloat();
		int quantity= sc.nextInt();
		double ans=price*quantity; 
		System.out.println("The total purchase price is INR" + ans+" if the quantity "+" and unit price is INR"+ price); 		
	}
}