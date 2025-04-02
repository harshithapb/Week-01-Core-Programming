import java.util.*; 
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter age of Amar"); 
		int ageOfAmar=sc.nextInt();  
		System.out.println("Enter age of Akbar"); 
		int ageOfAkbar=sc.nextInt(); 
		System.out.println("Enter age of Anthony"); 
		int ageOfAnthony=sc.nextInt();   
		System.out.println("Enter height of Amar"); 
		int heightOfAmar=sc.nextInt();  
		System.out.println("Enter height of Akbar"); 
		int heightOfAkbar=sc.nextInt(); 
		System.out.println("Enter height of Anthony"); 
		int heightOfAnthony=sc.nextInt();   
		if(ageOfAkbar < ageOfAmar && ageOfAkbar <ageOfAnthony){
			System.out.println("Youngest friend is: " + ageOfAkbar); 
		}
		else if(ageOfAmar<ageOfAkbar && ageOfAmar<ageOfAnthony){
			System.out.println("Youngest friend is: " + ageOfAmar); 
		}
		else{
			System.out.println("Youngest friend is: " + ageOfAnthony); 
		}  
		if(heightOfAkbar > heightOfAmar && heightOfAkbar >heightOfAnthony){
			System.out.println(" Tallest friend is: " + heightOfAkbar); 
		}
		else if(heightOfAmar>heightOfAkbar && heightOfAmar>heightOfAnthony){
			System.out.println(" Tallest friend is: " + heightOfAmar); 
		}
		else{
			System.out.println(" Tallest friend is: " + heightOfAnthony); 
		}  
	} 
}	
		
		
		