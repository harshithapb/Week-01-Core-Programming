import java.util.*; 
class Program11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		int opt=1; 
		double total=0.0;
		while(true){
			System.out.println("Enter number:");   
			double n=sc.nextDouble();  
			if(n==0 || n<0){
			break;
			} 
			else{
				total+=n; 
				System.out.println("Enter number:");   
				n=sc.nextDouble();  
			if(n==0 || n<1){
					break;
				}
			}
		} 
		System.out.println("Total: "+total); 	
	} 
}