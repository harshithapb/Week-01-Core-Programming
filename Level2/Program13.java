import java.util.*; 
class Program13{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");			
			int n=sc.nextInt();   
			int counter=100-1;  
			System.out.print("Multiples are: "); 
			while(counter>1){
				if(counter%n==0){
					System.out.print(counter+" "); 
				}
				counter--; 
				continue;
			}
				
		}
	}

