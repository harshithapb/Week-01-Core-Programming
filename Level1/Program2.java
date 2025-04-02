import java.util.*; 
class Program2{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter threee numbers:"); 
		int a=sc.nextInt(); 
		int b=sc.nextInt();
		int c=sc.nextInt(); 
		if(a<b && a<c){
			System.out.println(a+" is the smallest number"); 
		}
		else{
			System.out.println("First number is not the smallest"); 
		}
		
	}
}