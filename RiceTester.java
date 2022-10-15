class RiceTester {
public static void main (String [] args){

Rice rr = new Rice ();
rr.name = "Basmati Rice";
rr.colour = "Wight";
rr.price = "180 Rs/Kg";
rr.rice();


System.out.println (rr.name +"\n"+ rr.colour +"\n"+ rr.price  );
 
 System.out.println ("\n");
 
 
 Rice rr1 = new Rice ();
rr1.name = "Brown Rice";
rr1.colour = "Brown";
rr1.price = "80 Rs/Kg";
rr.rice();


System.out.println (rr1.name +"\n"+ rr1.colour +"\n"+ rr1.price  );
 
 System.out.println ("\n");
 
 
 
 Rice rr2 = new Rice ();
rr2.name = "Sona Masoori Rice";
rr2.colour = "Wight";
rr2.price = "65 Rs/Kg";
rr2.rice();


System.out.println (rr2.name +"\n"+ rr2.colour +"\n"+ rr2.price  );
 
 System.out.println ("\n");
 
 
 
 
}



}