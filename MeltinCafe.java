class MeltinCafe {
public static void main (String args []  ){
String type = "Cafe";
String address =  "Mysure Road";
String managerNames [] =  {"Jayanth", "Vivek","Rakshith"};
  char noOfManager = 3;
  String foodMenu [] = {"Chicken Briyani", "Potato Fries", "Hooka Pot","Burger", "Magggi", "Drinks"};
  
  
System.out.println ("Welcome to MeltinCafe Service");
System.out.println ("********************************************************");
System.out.println ("Adress" + address);
System.out.println ("********************************************************");
//System.out.println ("Food Menu" + foodMenu);
for (int z = 0;z<foodMenu.length; z++){
	System.out.println ("Food Menu " + foodMenu [z]+ " " );
}
System.out.println ("********************************************************");

for (int m = 0 ; m<managerNames.length;m++){
	System.out.println ("the list of managers are " + managerNames[m] + " " );
}
System.out.println ("********************************************************");
System.out.println ("Thanks for coming to MeltinCafe hope you enjoyed it Visit again");
}
}