import java.util.*; 
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter weight in kg:");
		float wt=sc.nextFloat(); 
		System.out.println("Enter height in cm:");
		float h=sc.nextFloat();   
		h/=100;
		double bmi=wt/(h*h);  
		System.out.println("Your bmi is : "+ bmi +"kg/m*m");
		if(bmi>=40){
			System.out.println("Obese");
		} 
		if(bmi>=40){
			System.out.println("Overweight");
		} 
		if(bmi>=40){
			System.out.println("Normal");
		} 
		else{
			System.out.println("Underweight");
		}  
	}
}
		
		
		