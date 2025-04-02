import java.util.*; 
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of operations"); 
		int n=sc.nextInt(); 
		while(n>0){
			System.out.println("Enter number1:") ;
			double first=sc.nextDouble();
			System.out.println("Enter number2:") ;
			double second=sc.nextDouble(); 
			System.out.println("Enter required operation") ; 
			String op=sc.next(); 
			System.out.println("Enter number1:") ;  
			double  ans=0.0;
			switch(op){
				case  "+": 
				ans=first+second;
				System.out.println(first+ " + " +second +" = " +ans); 
				break;
				case "-": 
				ans=first-second;
				System.out.println(first +" - "+ second +" = " + ans);  
				break;
				case "*": 
				ans=first*second;
				System.out.println(first+" * "+ second +" = " + ans); 
				break;
				case "/": 
				ans=first/second;
				System.out.println(first +" / " +second +" = " + ans);  
				break;
				default : 
				System.out.println("Invalid Operator");  
			} 
			n--; 
		}
	} 
}

	
		