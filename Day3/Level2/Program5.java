import java.util.*; 
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number :"); 
		int n=sc.nextInt();   
		int count=0;  
		int temp=n;
		while(n>0){
			n/=10;
			count++; 
		} 
		int[] arr=new int[count];  
		int idx=0;
		while(temp>0){
			arr[idx]=temp%10;
			idx++;
			temp/=10;  
		}  
		System.out.print("Number in reverse order is ");
		for(int i=0;i<count;i++){
		System.out.print(arr[i]); 
		} 
	}
}
			