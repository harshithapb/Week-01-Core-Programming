import java.util.*; 
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter number: "); 
		int n=sc.nextInt();
		int[] multiplicationResult=new int[n]; 
		for(int i=6;i<=9;i++){
			multiplicationResult[i]=i*n;
			System.out.println(n +" * " + i+ " = " +multiplicationResult[i] ); 
		}   
	}
}

		