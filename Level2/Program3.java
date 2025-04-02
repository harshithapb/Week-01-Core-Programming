import java.util.*; 
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		double a=sc.nextDouble(); 
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double ans1= a + b *c;
		double ans2=a * b + c;
		double ans3=c + a / b; 
		double ans4=a % b + c; 
		System.out.println("The results are: " +ans1+ "  " + ans2+"  " + ans3+ "  " + ans4); 
	}
}
