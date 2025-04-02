import java.util.*; 
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number :"); 
		int n=sc.nextInt();  
		int maxDigit=10; 
		int[] arr=new int[maxDigit]; 
		int index=0; 
		while(n!=0){
			if(index>maxDigit){
				maxDigit+=10; 
				int [] temp=new int[maxDigit]; 
				for(int i=0;i<index;i++){
					temp[i]=arr[i];
				} 
				arr=temp;
			} 
			arr[index]=n%10;  
			n/=10;  
			index++;  
		} 
		int largest=0; 
		int secLargest=0; 
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				secLargest=largest; 
				largest=arr[i]; 
			}
			if(arr[i]>secLargest && arr[i]!=largest){
				secLargest=arr[i]; 
			}
		} 
		System.out.println("Largest number is: "+largest);  
		System.out.println("Second Largest number is: "+secLargest); 
	}
}

		
		