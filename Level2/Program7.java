import java.util.*; 
class Program7{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The swapped numbers are " + a + " and " + b) ;
	} 
}
	