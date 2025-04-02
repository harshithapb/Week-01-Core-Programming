import java.util.*; 
class Program11{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in); 
			int n=sc.nextInt(); 
			if(n>0 &&n<=100){
				System.out.print("Multiples are: "); 
				for(int i=100;i>=1;i--){
					if(i%n==0){
						System.out.print(i+" "); 
					}
				}
			}
			else{
				System.out.print("Not natural number "); 
			}
			
	}
}
//100%100 
//multiple of 5 
//5,10,15
//n=6
