import java.util.*; 
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);    
		double[] arr=new double[10]; 
		double sum=0;  
		int idx=0;
		while(true){
			System.out.println("Enter number:");
			double n=sc.nextDouble();  
			if(n>0 && idx<arr.length){
				arr[idx]=n; 
				idx++;
			}
			else{
				break;
			} 
		}  
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		} 
		System.out.println("Total = " +sum); 
	}
}
		
		
			
		
				