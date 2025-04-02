import java.util.*; 
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter physics marks:"); 
		int physics=sc.nextInt(); 
		System.out.println("Enter chemistry marks:"); 
		int chemistry=sc.nextInt();  
		System.out.println("Enter  maths marks:"); 
		int  maths=sc.nextInt();  
		int avg=(maths+chemistry+physics)/3;
		int percent=avg*100;
		System.out.println(percent);
		if(percent>=80){
			System.out.println("Grade : A " +"Average Marks: " +avg); 
			System.out.println("Level 4, above agency-normalized standards"); 
		}
		else if(percent>=70 && percent<=79){
			System.out.println("Grade : B" +"Average Marks: " +avg); 
			System.out.println("Level 3, at agency-normalized standards"); 
		} 
		else if(percent>=60 && percent<=69){
			System.out.println("Grade : C" +"Average Marks: " +avg); 
			System.out.println("Level 2,below, but approaching agency-normalized standards"); 
		} 
		else if(percent>=50 && percent<=59){
			System.out.println("Grade :  D"+"Average Marks: " +avg); 
			System.out.println("Level 1, well belowagency-normalized standards"); 
		} 
		else if(percent>=40 && percent<=49){
			System.out.println("Grade : E" +"Average Marks: " +avg); 
			System.out.println("Level 1, too below agency-normalized standards"); 
		}
		else {
			System.out.println("Grade : F" +"Average Marks: " +avg); 
			System.out.println("Remedial standards"); 
	    }
	} 
}
	
		