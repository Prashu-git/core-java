class TouristPlaces {

static String touristPlacesNames [] = {null,null,null,null,null};
static int a;

public static String addTouristPlacesNames (String touristPlacesName){

System.out.println ("inside addTouristPlacesNames");

touristPlacesNames[a++]=touristPlacesName;


System.out.println ("end of  addTouristPlacesNames");
return null;
}
public static boolean getTouristPlacesNames (){
for (int i =0; i<touristPlacesNames.length; i++){
String ref = touristPlacesNames[i];
System.out.println ("The Tourist Places must visit are " + ref);

}
return true;
}

}