import java.util.*; 
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter salary: "); 
		float salary=sc.nextFloat(); 
		System.out.println("Enter years of service: "); 
		int year=sc.nextInt(); 
		if(year>5){
			double bonus=0.5*salary;
			double income=bonus+salary;  
			System.out.println("Bonus Amount: "+ bonus + " New Income "+ income); 
		} 
		else{
			System.out.println("No Bonus");
		}
	} 
}