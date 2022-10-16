class Beaches {
static String beachNames [] = {null,null,null,null,null,null};
static int index;

public static boolean addBeachNames (String beachName){
System.out.println ("inside  addBeachNames");

if(beachNames.length<=5){
	

beachNames[index] = beachName;
index++;
return true;
}
else {
	System.out.println ("All other beaches are full and not allowe to visit");
}
System.out.println ("end of  addBeachNames");
return false;


}
public static void getBeachNames(){
for(int index = 0 ; index < beachNames.length ; index ++){
//String ref = beachNames[index];
System.out.println ("Beach Name is "  + beachNames[index]);
}

}

}