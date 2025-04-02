import java.util.*; 
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number:");   
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n>1){
			for(int i=2;i<n;i++){
				if(n%i==0){ 
				    isPrime=false;
					break;
				} 
			}
		}
		System.out.println("Result of isPrime :"+isPrime); 
	}
}
			