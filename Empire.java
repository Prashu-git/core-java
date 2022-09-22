class Empire {
public static void main (String args []  ){
String type = "3 Star Hotel";
String address =  "Modi Hospel Road";
String managerNames [] =  {"Sham", "Sunder","Yashwant", "Lokeshwar"};
  char noOfManager = 4;
  String foodMenu [] = {"Chicken Briyani", "Mutton Briyani" , "Kabbe" ," pepper dry", "chicken andra", "Andra full meals" , "Hydrabadi chicken Briyani"};
System.out.println ("Welcome to Empire Service");
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
System.out.println ("Thanks for coming to Empire hope you enjoyed it Visit again");
}
}