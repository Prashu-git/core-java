class FurnitureTester{
	public static void main(String args[]){
		
		Furniture.setFurnitureName("Teak Wood Furniture");
		Furniture.setFurnitureColor("Brown");
		Furniture.setFurniturePrice(30000);
		
		
		System.out.println(Furniture.getFurnitureName()+ " \n " + Furniture.getFurnitureColor()+ "\n" + Furniture.getFurniturePrice() );
	}
}