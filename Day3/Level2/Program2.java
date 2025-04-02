import java.util.*; 
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);  
		int[] height=new int[3]; 
		int[] age=new int[3]; 
		String[] friends={" Amar"," Akbar"," Anthony"};
		System.out.println("Enter height of  Amar, Akbar, and Anthony :");
		for(int i=0;i<height.length;i++){ 
		    height[i]=sc.nextInt(); 
		} 
		System.out.println("Enter age of  Amar, Akbar, and Anthony :");
		for(int i=0;i<height.length;i++){ 
		    age[i]=sc.nextInt(); 
		} 
		int youngest=1000; 
		int tallest=0;  
		int idx1=0;int idx2=0;
		for(int i=0;i<height.length;i++){  
		    if(height[i]>tallest){
				tallest=height[i]; 
				idx1=i;
			}
		} 
		for(int i=0;i<age.length;i++){  
		    if(age[i]<youngest){
				youngest=age[i];
				idx2=i;
			}
		}
		System.out.println("Tallest friend is : " +friends[idx1] +" of height ="+tallest+ " cm");  
		System.out.println("Youngest friend is : " +friends[idx2] +" of age ="+youngest+ " years");  
	} 
}
		
		 