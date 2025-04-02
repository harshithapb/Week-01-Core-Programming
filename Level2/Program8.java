import java.util.*; 
class Program8{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in); 
		    System.out.println("Enter number:"); 
			int n=sc.nextInt(); 
			if(n>0){
				System.out.print("Factors are: "+" ");  
				int i=1;
				while(i<=n){
					if(n%i==0){
						System.out.print(i+ " "); 
					} 
					i++; 
				} 
		    }
		   else{
			System.out.println("Not natural number"); 
			} 
	} 
}
	