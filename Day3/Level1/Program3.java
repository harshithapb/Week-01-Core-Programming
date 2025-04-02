import java.util.*; 
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter number:"); 
		int n=sc.nextInt();  
		int[] arr=new int[11];
		for(int i=0;i<11;i++){
			if(i==0){
				continue; 
			}
			arr[i]=n*i;
		} 
		for(int i=1;i<=10;i++){
			System.out.println(n +" * " + i+ " = " +arr[i] ); 
		} 
	} 
}
