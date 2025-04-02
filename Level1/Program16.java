import java.util.*; 
class Program16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:"); 
		int n=sc.nextInt(); 
		if(n>0){
			for(int i=1;i<=n;i++){
				if(n%i==0){
					System.out.println(i +" is even"); 
				}
				else{
					System.out.println(i +" is odd");  
				}
			}
		}
		else{
			System.out.println("Number is not natural"); 
		} 
	} 
}
	