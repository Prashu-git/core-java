class CollegeTester {
public static void main (String [] args){

College clg = new College ();
clg.name = "Sheshadripuram PU Main College";
clg.location = "Sheshadripuram , Bangalore";
clg.fee = 2800.00;
clg.college ();


 System.out.println (clg.name +"\n"+clg.location+"\n"+clg.fee);
 
 System.out.println ("\n");
 
 College clg1 = new College ();
clg1.name = "Don Bosco Institute of Technology";
clg1.location = "Kumbalgodu , Bangalore";
clg1.fee = 90800.00;
clg1.college ();
 
System.out.println (clg1.name +"\n"+clg1.location+"\n"+clg1.fee);
 
 System.out.println ("\n");
 
  College clg2 = new College ();
clg2.name = "RV College of Engineering";
clg2.location = " Mysore Road , Bangalore";
clg2.fee = 90800.00;
clg2.college ();
 
System.out.println (clg2.name +"\n"+clg2.location+"\n"+ clg2.fee);
 
 System.out.println ("\n");
 
 
  College clg3 = new College ();
clg3.name = "RNS Institute of Technology";
clg3.location = " Dr. Vishnuvardhana Road , Bangalore";
clg3.fee = 90800.00;
clg3.college ();
 
System.out.println (clg3.name +"\n"+clg3.location+"\n"+clg3.fee);
 
 System.out.println ("\n");
 
  College clg4 = clg;
clg4.name = "Indian Institute of Science";
clg4.location = "CV Raman Road  , Bangalore";
clg4.fee = 12400.00;
clg4.college ();
 
System.out.println (clg4.name +"\n"+clg4.location+"\n"+clg4.fee);
 
 System.out.println ("\n");
}


}