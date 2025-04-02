import java.util.*; 
class Program16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int ans=n * (n - 1) / 2;
		System.out.println("Maximum number of possible handshakes = " + ans);
	}
}

