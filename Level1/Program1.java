import java.util.*; 
class Program1{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number:") ; 
		int n= sc.nextInt(); 
		if(n%5==0){
			System.out.println("Divisible by 5"); 
		} 
		else{
			System.out.println("Not Divisible by 5"); 
		}
	} 
} 

