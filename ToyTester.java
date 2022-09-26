class ToyTester{
	
	public static void main(String pk[]){
		Toys.setToysName("BatMan");
		Toys.setToysColor("Black");
		Toys.setToysPrice(199);
		
		System.out.println(Toys.getToysName() + "\n"+ Toys.getToysColor() +"\n" + Toys.getToysPrice());
	}
}