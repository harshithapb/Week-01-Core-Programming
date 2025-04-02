import java.util.*; 
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		float[] height=new float[3];  
		float[] weight=new float[3]; 
		System.out.println("Enter height of 3 people in metres :");
        for(int i=0;i<3;i++){
            height[i]=sc.nextFloat(); 
		}
		System.out.println("Enter weight of 3 people in kg :");
        for(int i=0;i<3;i++){
            weight[i]=sc.nextFloat(); 
		} 
		double [] bmi=new double[3]; 
		for(int i=0;i<bmi.length;i++){
			bmi[i]=height[i]*weight[i]; 
			if(bmi[i]<=18.4){
				System.out.println("Person "+(i+1) +"height: " +height[i]+" weight "+weight[i]+" bmi status :Underweight"); 
		    } 
			else if(bmi[i]>=18.5 && bmi[i]<=24.9){
				System.out.println("Person "+(i+1) +"height: " +height[i]+" weight "+weight[i]+" bmi status :Normal");
			} 
			else if(bmi[i]>=25.0&& bmi[i]<=39.9){
				System.out.println("Person "+(i+1) +"height: " +height[i]+" weight "+weight[i]+" bmi status :Overweight");
			} 
			else{
				System.out.println("Person "+(i+1) +"height: " +height[i]+" weight "+weight[i]+" bmi status :Obese");  
			} 
		} 
	}
}
        		