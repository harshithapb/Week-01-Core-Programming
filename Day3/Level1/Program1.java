import java.util.*; 
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		int [] arr= new int[10];  int n=10;
		for(int i=0;i<n;i++){
			System.out.println("Enter age of student " +i); 
			arr[i]=sc.nextInt(); 
		} 
		for(int i=0;i<n;i++){
			if(arr[i]>=18){
				System.out.println("Student " + i+" can vote"); 
			}
			else{
				System.out.println("Student " + i+" cannot vote"); 
			} 
		}
	}
}	
		