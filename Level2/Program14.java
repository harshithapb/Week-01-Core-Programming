import java.util.*; 
class Program14{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");			
			int n=sc.nextInt();   
			System.out.println("Enter power:");			
			int power=sc.nextInt();
			int ans=1;
			int counter=1;
			while(counter<=power){
				ans*=n; 
				counter++;
			}
			System.out.println("Result is :" +ans); 
	}
}
