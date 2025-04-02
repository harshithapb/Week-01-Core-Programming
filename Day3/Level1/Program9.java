import java.util.*; 
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);    
		System.out.println("Enter rows: ");
		int r=sc.nextInt(); 
		System.out.println("Enter columns: ");
		int c=sc.nextInt(); 
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt(); 
			}
		} 
		int[] arr2=new int[r*c];  
		int idx=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			     arr2[idx++]=arr[i][j]; 
			} 
		} 
		System.out.print("Elements are:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" "); 
		} 
	} 
}
		