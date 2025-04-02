import java.util.*; 
class Program12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:");  
		int n=sc.nextInt();   
		if(n>0){
			int ans1=n*(n+1)/2;  
			int ans2=0; 
			while(n>-0){
				ans2+=n;
				n--;
			}  
			System.out.println("Ans from formula:  "+ans1 + " and Answer from looping through numbers: " +ans2); 
		} 
		else{
			System.out.println("Not natural");
		}			
	} 
}