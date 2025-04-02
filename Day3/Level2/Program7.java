import java.util.*; 
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter number of people :"); 
		int n=sc.nextInt(); 
		double [][] personData=new double[n][3]; 
		String[] weightStatus=new String[n]; 
		System.out.println("Enter height of 3 people in metres :");
        for(int i=0;i<n;i++){
            personData[i][0]=sc.nextDouble(); 
			while(personData[i][0]<=0){
				i--;
				System.out.println("Enter the correct values: "); 
				personData[i][0]=sc.nextDouble();
			} 
		}
		System.out.println("Enter weight of 3 people in kg :");
        for(int i=0;i<n;i++){
            personData[i][1]=sc.nextDouble();  
			if(personData[i][1]<=0){
				System.out.println("Enter the correct values: "); 
				personData[i][1]=sc.nextDouble();
			} 
		} 
		for(int i=0;i<n;i++){
			personData[i][2]=personData[i][0]*personData[i][1];
		}
		for(int i=0;i<n;i++){
			if(personData[i][2]<=18.4){
				System.out.println("Person "+(i+1) +"height: " +personData[i][0]+" weight "+personData[i][1]+" bmi :"+ personData[i][2]+" bmi status :Underweight"); 
		    } 
			else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
				System.out.println("Person "+(i+1) +"height: " +personData[i][0]+" weight "+personData[i][1]+" bmi :"+ personData[i][2]+" bmi status :Normal");
			} 
			else if(personData[i][2]>=25.0&& personData[i][2]<=39.9){
				System.out.println("Person "+(i+1) +"height: " +personData[i][0]+" weight "+personData[i][1]+" bmi :"+ personData[i][2]+" bmi status :Overweight");
			} 
			else{
				System.out.println("Person "+(i+1) +"height: " +personData[i][0]+" weight "+personData[i][1]+" bmi :"+ personData[i][2]+" bmi status :Obese");  
			}  
		} 
	}
}
