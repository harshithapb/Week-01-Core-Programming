import java.util.*; 
class Program8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name=sc.next(); 
		String  fromCity =sc.next();
		String viaCity =sc.next();
		String toCity=sc.next(); 
		System.out.println("Give distance in miles");
		float  fromToVia  = sc.nextFloat(); 
		float viaToFinalCity= sc.nextFloat();   
		double totalDistance = fromToVia + viaToFinalCity; 
		System.out.println("Give time taken in hours"); 
		float start=sc.nextFloat();
		float end=sc.nextFloat(); 
		float time=end-start;
		System.out.println("The distance travelled from " + fromCity + " via the city "+ viaCity + " to reach is " + toCity + " is " + totalDistance); 
		System.out.println("Time taken is " + time + " hours"); 
	}
}
