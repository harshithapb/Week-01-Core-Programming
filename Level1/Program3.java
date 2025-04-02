import java.util.*; 
class Program3{
	public static void main(String [] args){
		System.out.println("Enter three numbers:");
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt(); 
		int b=sc.nextInt();
		int c=sc.nextInt(); 
		if(a>b &&a>c){
			System.out.println("First number is the largest"); 
		}
		else if(b>a && b>c){
			System.out.println("Second number is the largest");  
		}
		else{
			System.out.println("Third number  is the largest");  
		} 
    } 
}
