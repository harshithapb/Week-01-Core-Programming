import java.util.*; 
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number:");   
		int n=sc.nextInt();
		int origNumber=n;
		int sum=0;
		while(n!=0){
			int dig=n%10; 
			sum+=dig;
			n/=10; 
		}  
		if(origNumber %sum==0){
			System.out.println(origNumber + " is a Harshad Number "); 
		}
		else{
			System.out.println(origNumber + " is not a Harshad Number "); 
		}
		
	}
}
	