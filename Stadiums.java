class Stadiums {
static String stadiumNames [] = {null,null,null,null,null};
static int a;

public static boolean addStadiumNames (String stadiumName){
System.out.println ("inside addStadiumNames");
stadiumNames[a++] = stadiumName;
System.out.println ("end of  addStadiumNames");
return true;

}
public static String getStadiumNames (){
for (int i =0; i<stadiumNames.length; i++){
System.out.println ("The name of Stadiums are " + stadiumNames[i]);


}
return null;
}

}