import java.util.*; 
class Program13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:");  
		int n=sc.nextInt();  
		int ans1=n*(n+1)/2; 
		int ans2=0; 
		for(int i=0;i<=n;i++){
			ans2+=i;
		}
		System.out.println("Ans from formula:  "+ans1 + " and Answer from looping through numbers: " +ans2); 		
	} 
}