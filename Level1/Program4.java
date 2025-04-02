import java.util.*; 
class Program4{
	public static void main(String[] main){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter  number:"); 
		int n=sc.nextInt(); 
		if(n>1){
			int sum= n*(n+1)/2; 
			System.out.println("The sum of " + n +"   natural numbers is " +sum); 
		}
		else{
			System.out.println("The number  " +n + " is not a natural number"); 
		}
	}
}

