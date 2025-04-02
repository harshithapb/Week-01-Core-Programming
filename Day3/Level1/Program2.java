import java.util.*; 
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		int [] arr= new int[5];  
		System.out.println("Enter numbers:");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt(); 
		}
		for(int i=0;i<5;i++){ //positive/negative/zero 
			if(arr[i]<0){
				System.out.print(arr[i] +" :negative," +" "); 
			} 
			else if(arr[i]>0){
				System.out.print(arr[i] +" :positive," +" "); 
			}
			else{
				System.out.print(arr[i] +" :zero," +" "); 
			}				
		} 
		System.out.println(); 
		for(int i=0;i<5;i++){ //even or odd
			if(arr[i]%2==0){
				System.out.print(arr[i] +" :even," +" "); 
			}  
			else{
				System.out.print(arr[i] +" :odd," +" ");  
			}
		}    
		System.out.println();
		if(arr[0] <arr[4]){
			System.out.println(arr[0] +"is greater"); 
		}
		else if(arr[0] >arr[4]){
			System.out.println(arr[4] +"is greater");  
		} 
		else{
			System.out.println("first and last element of the array are equal"); 
		}
	}
}
		
		