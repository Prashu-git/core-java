class ConventionHallTester {
public static void main (String [] args ){

ConventionHall ch = new ConventionHall ();
ch.name = "Mantra";
ch.location = "Chikkabellandur , Bangalore";
ch.capacity = 1000 ;
ch.rate = " 50 Lakhs ";

System.out.println ( ch.name +"\n"+ ch.location +"\n"+ ch.capacity+"\n"+ ch.rate  );
System.out.println ("\n");


ConventionHall ch1 = new ConventionHall ();
ch1.name = "Shubh Convention Hall";
ch.location = "JP Nagar , Bangalore";
ch1.capacity = 2500 ;
ch1.rate = " 60 Lakhs ";

System.out.println ( ch1.name +"\n"+ ch1.location +"\n"+ ch1.capacity+"\n"+ ch1.rate  );
System.out.println ("\n");



ConventionHall ch2 = new ConventionHall ();
ch2.name = "Star Convention Hall";
ch2.location = "Bangalore";
ch2.capacity = 2000 ;
ch2.rate = " 50 Lakhs ";

System.out.println ( ch2.name +"\n"+ ch2.location +"\n"+ ch2.capacity+"\n"+ ch2.rate  );
System.out.println ("\n");


}

}