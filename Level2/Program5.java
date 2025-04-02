import java.util.*; 
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:"); 
		int n=sc.nextInt();
		if(n>0){ 
		    int i=1;
			while(i<=n){
				if(i%3==0 &&i%5==0){
					System.out.println("FizzBuzz"); 
			    }
				else if(i%3==0){
					System.out.println("Fizz"); 
				}
				else if(i%5==0){
					System.out.println("Buzz");  
				} 
				else{
					System.out.println(i); 
				} 
				i++; 
			}
		}
		else{
			System.out.println("Not natural Integer");  
		}
	}
}

	