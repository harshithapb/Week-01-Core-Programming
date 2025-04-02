class Program6{
	public static void main(String[] args){
		int fee=125000; 
		double discountPercent=10; 
		double discount=fee/discountPercent; 
		System.out.println("The discount amount is INR " +discount+ " and final discounted fee is INR " + (fee - discount)); 
	} 
}