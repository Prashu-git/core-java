class AirportsInIndia {

static String airportNames [] = {null, null , null , null, null};

static int i ;
public static String addAirportNames (String airportName){
System.out.println ("Inside the addAirportNames ");

airportNames[i++] = airportName;
System.out.println ("Inside the addAirportNames ");
return null ;
}

public static void getAirportNames (){
for (int a = 0; a<airportNames.length; a++){

System.out.println ("Airports name are " + airportNames[a]);

}
}



}


