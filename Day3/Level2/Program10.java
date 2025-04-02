import java.util.*; 
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number :"); 
		int n=sc.nextInt();  
		int count=0; 
		int newNumber=n; 
		while(newNumber>0){
			newNumber/=10;
			count++; 
		}  
		int[] digits=new int[count]; 
		for(int i=0;i<digits.length;i++){
			int d=n%10; 
			digits[i]=d;
			n/=10;
		}
		int[] freq=new int[10]; 
		for(int i=0;i<digits.length;i++){
			freq[digits[i]]++;   
			//if(freq[i]=digits[i]
			//freq[i]+=1;
		} 
		for(int i=0;i<freq.length;i++){
			System.out.println( i+ " : " +freq[i]); 
		} 
	} 
} 
