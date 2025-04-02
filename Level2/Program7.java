import java.util.*; 
class Program7{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in); 
		    System.out.println("Enter number:"); 
			int n=sc.nextInt(); 
			if(n>0){
				System.out.print("Factors are: "+" ");
				for(int i=1;i<=n;i++){
					if(n%i==0){ 
					System.out.print(i+ " "); 
					}
				} 
		   }
		   else{
			System.out.println("Not natural number"); 
			} 
	} 
}
	
			
		