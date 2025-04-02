import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int fee=sc.nextInt();
		float discountPercent=sc.nextFloat();
		double discount=fee/discountPercent; 
		double amt=fee-discount; 
		System.out.println(" The discount amount is INR " + discount+ " and final discounted fee is INR " + amt); 
	} 
} 