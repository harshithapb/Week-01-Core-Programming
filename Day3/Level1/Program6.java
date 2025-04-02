import java.util.*; 
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		double[] arr= new double[11]; 
		double sum=0.0;
		System.out.println("Enter height of players: "); 
		for(int i=0;i<11;i++){
			arr[i]=sc.nextDouble(); 
			sum+=arr[i]; 
		} 
		double mean=sum/11; 
		System.out.println("Mean height : "+mean); 
	}
}
		
		