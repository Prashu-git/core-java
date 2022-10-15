class IndianRupeeTester {
public static void main (String [] args){
IndianRupee ind = new IndianRupee();
ind.serialNo = "52E145658";
ind.colour = "Purple";
ind.name = "2000 Rupee";
ind.money();

System.out.println (ind.serialNo  + " " + ind.colour + " " + ind.name );
System.out.println ( " \n " );

IndianRupee ind1 = new IndianRupee ();
ind1.serialNo = "22T1457882";
ind1.colour = "Orange";
ind1.name = "200 Rupee";
ind1.money();

System.out.println (ind1.serialNo  + " " + ind1.colour + " " + ind1.name );


}

}