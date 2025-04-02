import java.util.*; 
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter month:");  
		int month=sc.nextInt();
		System.out.println("Enter month:");  
		int date=sc.nextInt(); 
		if(month>=3 && month<=6){
			if(date>=20 && month==3){
				System.out.println("Its a Spring Season");  
			} 
			else if(month>3 &&month<6){
				System.out.println("Its a Spring Season");   
			}
			else if(date<=20 && month==6){
				System.out.println("Its a Spring Season");   
			} 
			else{
				System.out.println("Not a Spring Season"); 
			}
		}
		 else{
			 System.out.println("Not a Spring Season");  
		 } 
	}
} 
