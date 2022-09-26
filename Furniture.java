class Furniture{
	
	static String furnitureName;
	static String color;
	static int price;
	
	//setter and getter
	
	static void setFurnitureName(String name){
		furnitureName = name;
	}
	static String getFurnitureName(){
		return furnitureName;
	}
	static void setFurnitureColor(String co){
		color= co;
	}
	static String getFurnitureColor(){
		return color;
	}
	static void setFurniturePrice(int rate){
		price = rate;
	}
	static int getFurniturePrice(){
		return price;
	}
}