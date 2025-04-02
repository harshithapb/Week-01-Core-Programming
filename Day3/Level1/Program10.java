import java.util.*; 
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number :"); 
		int n=sc.nextInt();  
		if(n>0){
			String [] arr=new String[n+1];  
			for(int i=0;i<arr.length;i++){  
			    if(i%3==0 && i%5==0){ 
				   arr[i]="FizzBuzz";  
				}
			    else if(i%3==0){ 
				   arr[i]="Fizz";
			    } 
			    else if(i%5==0){ 
				   arr[i]="Buzz"; 
				} 
				else{ 
				   arr[i]=String.valueOf(i); 
				} 
			} 
			for(int i=0;i<arr.length;i++){
				System.out.println("Position "+ i+" = "+arr[i]); 
			} 
		} 
		else{
			System.out.println("Wrong input");
		}
	}
}

				
			
				