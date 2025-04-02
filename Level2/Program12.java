import java.util.*; 
class Program12{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");			
			int n=sc.nextInt();   
			System.out.println("Enter power:");			
			int power=sc.nextInt();
			int ans=1;
			for(int i=1;i<=power;i++){
				ans*=n;
			} 
			System.out.println("Result is :" +ans); 
	}
}

			
			
			