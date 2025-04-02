class Program7{
	public static void main(String[] args){
		int r=6378;  
		double volKm=(4/3) *3.14* r*r*r ;  
		double radiusMiles=r*1.6;
		double volMiles=4/3 *3.14* radiusMiles*radiusMiles*radiusMiles ;
		System.out.println("The volume of earth in cubic kilometers is " + volKm + " and cubic miles is " +volMiles); 
	} 
}
