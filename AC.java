class AC{
static boolean isPaired = false ;
static int presentVolume  ;
static int minVolume ;
 static int maxVolume  = 10 ;
public static boolean isPaired (){

//String brand = "Boss";
//String colour = "Whight";
//int price = 56960;
 //int minVolume ;
 //int maxVolume  ;
 //int presentVolume  ;
 
//boolean isPaired  ;

System.out.println ("Start");

if (isPaired == false){
	isPaired = true;
System.out.println ("AC is on");
}
else if (isPaired == true){
	isPaired = false;
	System.out.println ("AC is off");
	
}



System.out.println ("end");
return isPaired;

}  
public static void increasCondition () {
	System.out.println ("start increas Condition");
	if (isPaired ==  true){
		if (presentVolume < maxVolume ){
			presentVolume = presentVolume + 1;
			System.out.println ("The present volume is : " + presentVolume);
		}
	else {
			System.out.println("Max Volume reached");
		}	
	}
	else {
			System.out.println ("pleas turn on the speaker");
		}
	System.out.println ("end increas Condition");	
	
	
}
public static void decreasCondition () {
	System.out.println ("Start of Decreas Condition");
	if (isPaired == true){
		if (presentVolume > minVolume){
			presentVolume = presentVolume - 1;
			System.out.println ("The present value :" + presentVolume);
		}
		else {
			System.out.println ("min volume reached");
		}
		}
		else {
			System.out.println ("pleas turn on the AC");
			
		}
		System.out.println ("Start of Decreas Condition");
		
		
	}
	

}