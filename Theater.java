class Theater{
	static long priceOfKannadaMovies [] = {1000, 500, 250, 565445454454L};
static String kannadaMovies [] = {"KGF","Om","Super Ranga"};
static String hindiMovies [] = {"Pk" , "Don" , "3 Idiots" , "Bj"};

public static void main (String boss[]){
 String name = "Boss";

int priceOfHindiMovies [] = {700, 600, 100};
System.out.println ("List of kannada Movies");
System.out.println (kannadaMovies [0] + " " + kannadaMovies[1] + " " + kannadaMovies[2] );
System.out.println ("*************************************************");
System.out.println ( priceOfKannadaMovies [0] + " " + priceOfKannadaMovies [1] + " " + priceOfKannadaMovies [2] + " " + priceOfKannadaMovies [3]);

System.out.println ("List of hindi Movies");
System.out.println (hindiMovies [0] + " " + hindiMovies[1] + " " + hindiMovies[2] );
System.out.println ("*************************************************");
System.out.println ( priceOfHindiMovies [0] + " " + priceOfHindiMovies [1] + " " + priceOfHindiMovies [2]);
System.out.println ( name.length() );
System.out.println ( name.substring(0 , 3) );
}



}