import java.util.*; 
class Program15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:"); 
		int n=sc.nextInt();
		if(n==0){
			System.out.println("Factorial =0"); 
		}
		if(n>=1){
			int fact=1; 
			for(int i=1;i<=n;i++){
				fact*= i;
			}
			System.out.println("Factorial using for loop: "+ fact);
		} 
		else{
			System.out.println("Negative number"); 
		}
	} 
} 

	