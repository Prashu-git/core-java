class TajHotelTester {

public static void main (String [] args){
TajHotel th = new TajHotel ();
th.name = " Taj MG Road ";
th.location = " MG Road , Bangalore";
th.popularty = " 4 Stars ";
th.vegOrNonveg = " Veg Only ";
th.hotel();

System.out.println ( th.name  + " \n " + th.location  + " \n " + th.popularty + " \n " + th.vegOrNonveg );
System.out.println ( " ********************************************************* " );


TajHotel th1 = new TajHotel ();
th1.name = " The Taj Mahal Palace ";
th1.location = " Mumbai";
th1.popularty = "5 Stars";
th1.vegOrNonveg = "Veg and Non Veg";
th1.hotel();

System.out.println ( th1.name  + " \n " + th1.location  + " \n " + th1.popularty + " \n " + th1.vegOrNonveg );
System.out.println ( "*********************************************************" );



TajHotel th2 = th;
th2.name = "Taj Exotica Resort";
th2.location = " Goa";
th2.popularty = "5 Stars";
th2.vegOrNonveg = "Veg and Non Veg";
th2.hotel();

System.out.println ( th2.name  + " \n " +th2.location  + " \n " + th2.popularty + " \n " + th2.vegOrNonveg );
System.out.println ( "*********************************************************" );



TajHotel th3 = new TajHotel ();
th3.name = "Taj Theog Resort";
th3.location = " Shimla";
th3.popularty = "5 Stars";
th3.vegOrNonveg = "Veg and Non Veg";
th3.hotel();

System.out.println ( th3.name  + " \n " +th3.location  + " \n " + th3.popularty + " \n " + th3.vegOrNonveg );
System.out.println ( "*********************************************************" );



TajHotel th4 = new TajHotel ();
th4.name = "Taj Madikeri Resort";
th4.location = " Coorg";
th4.popularty = "5 Stars";
th4.vegOrNonveg = "Veg and Non Veg";
th4.hotel();

System.out.println ( th4.name  + " \n " +th4.location  + " \n " + th4.popularty + " \n " + th4.vegOrNonveg );
System.out.println ( "*********************************************************" );

}



}