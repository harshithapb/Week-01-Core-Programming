import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		float fahrenheit =sc.nextFloat(); 
		double celsiusResult =(fahrenheit-32)*5/9; 
		System.out.println("The " + fahrenheit+"  fahrenheit is " +" celsius " +celsiusResult);   
	}
} 