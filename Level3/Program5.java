import java.util.*; 
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number:");   
		int n=sc.nextInt();  
		int number=n; 
		int sum=0;
		while(n!=0){
			int digit=n%10; 
			sum+=digit*digit*digit; 
			n/=10; 
		}
		if(sum== number){
			System.out.println(number +" is an Armstrong number"); 
		}
		else{
			System.out.println(number +" is not an Armstrong number"); 
		}
	}
}
		