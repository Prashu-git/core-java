class TajHotel {
public static void main (String args []  ){
String type = "5 Star Hotel";
String address =  "MG Road";
String managerNames [] =  {"Shashi", "Sandesh","Yashwant","Tharun K", "Mahendre"};
  char noOfManager = 5;
  String foodMenu [] = {"Roti", "Paratha","Dosa", "Idli", "Vada", "Fried Rice" ,"Gee Rice", "Noodles", "Jeera Rice", "Full Meals", "Rice Bath"};
System.out.println ("Welcome to Taj Service");
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
System.out.println ("Thanks for coming to Taj hope you enjoyed it Visit again");
}
}