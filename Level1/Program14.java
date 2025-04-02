import java.util.*; 
class Program14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:"); 
		int n=sc.nextInt();
		if(n==0){
			System.out.println("Factorial =0"); 
		}
		if(n>=1){
			int fact=1; 
			while(n>=1){
				fact*=n;
				n--; 
			} 
			System.out.println("Factorial: "+ fact);
		} 
		else{
			System.out.println("Negative number"); 
		}
	} 
}
		