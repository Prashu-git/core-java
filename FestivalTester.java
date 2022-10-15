class FestivalTester {
public static void main (String [] args){

Festival fc = new Festival ();
fc.name = "Diwali";
fc.month = "November";
fc.festival();

 System.out.println (fc.name +"\n"+ fc.month +"\n");
 
 System.out.println ("\n");
 
 
 Festival fc1 = new Festival ();
fc1.name = "Maha Shivaratri";
fc1.month = "January";
fc1.festival();

 System.out.println (fc1.name +"\n"+ fc1.month +"\n");
 
 System.out.println ("\n");
 
 
 Festival fc2 = new Festival ();
fc2.name = "Dussehra";
fc2.month = "October";
fc2.festival();

 System.out.println (fc2.name +"\n"+ fc2.month +"\n");
 
 System.out.println ("\n");

}

}