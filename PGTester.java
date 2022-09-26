class PGTester{
	public static void main(String args[]){
		
		PG.setPGName("Shree Manjunatha PG");
		PG.setPGTypes("Boys PG");
		PG.setPGPriceOfMonth(6000);
		
		System.out.println(PG.getPGName() +"\n" + PG.getPGTypes() + "\n" + PG.getPGPriceOfMonth());
	}
}