import java.util.*; 
class Program9{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in); 
		    System.out.println("Enter number:"); 
			int n=sc.nextInt();  
			int greatestFact=1;
			for(int i=1;i<n;i++){
				if(n%i==0){ 
					greatestFact=i; 
				}
			}
			System.out.println("Greatest factor = " + greatestFact);

	} 
}
	