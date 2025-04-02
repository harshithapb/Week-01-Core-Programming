import java.util.*; 
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number :"); 
		int number=sc.nextInt();
		if(number>1){
			int[] even=new int[number/2+1]; 
			int[] odd=new int[number/2+1];
			int idx1=0;
			int idx2=0;
			for(int i=1;i<number;i++){
				if(i%2==0){
					even[idx1]=i; 
					idx1++;
				} 
				else{
					odd[idx2]=i;
					idx2++; 
				}
			}  
			System.out.println("Even elements arr:");
			for(int i=0;i<even.length;i++){
				if(even[i]==0){
					continue; 
				}
				System.out.print(even[i]+" "); 
			}  
			System.out.println();
			System.out.println("Odd elements arr:");
			for(int i=0;i<even.length;i++){
				if(odd[i]==0){
					continue; 
				}
				System.out.print(odd[i]+" "); 
			} 
		} 
		else{
			System.out.println("Error"); 
		} 
	} 
}

		
		
			