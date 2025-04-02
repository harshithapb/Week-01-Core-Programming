import java.util.*; 
class Program11{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter Principal: ");
		float principal=sc.nextFloat(); 
		System.out.println("Enter Rate: "); 
		float rate= sc.nextFloat(); 
		System.out.println("Enter  Time in Years: ");
		float time=sc.nextFloat();  
		double si=principal*rate*time; 
		System.out.println("The Simple Interest is  " +si + " for Principal " +principal +" , Rate of Interest "  +rate +"  and Time  " +time); 
	}
}
