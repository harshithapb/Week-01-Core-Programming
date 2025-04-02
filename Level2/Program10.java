import java.util.*; 
class Program10{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in); 
		    System.out.println("Enter number:"); 
			int n=sc.nextInt();  
			int greatestFact=0; 
			int counter=n-1; 
			int fact=1;
			while(counter>=1){
				if(n%counter==0){ 
					fact=counter;  
					greatestFact=Math.max(greatestFact,counter);		
				} 
				counter--; 
			}
			System.out.println("Greatest factor = " + greatestFact);

	} 
}
	