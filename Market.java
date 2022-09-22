class Market {
 static String superMarket = "Prashanths Super Mart";
 static String clothes [] = {"Allen Solly" , "Peter England" , "Adidas" ,"Nike" , "Levi's" , "Puma "};
 static String footwears [] = {"Adidas", "Reebok" , "Bata" , "Crocs" , "Sparx" , "Lunars Walkmate " };
 static String chocolates [] = {"Cabdury Dairy Milk" , "Nestle" , "Amul" , "Ferrero Rocher" , "Ootymade" } ;
 static String watches [] = {"Rolex" , " Harry Winston" , "Fastrack" , " Casio", "Titan"};
 static String grocery [] = {"Milk" , "Salty Snacks" , " Eggs " , " Bread" , "Oil" , "Rice"};
 static String meats [] = {"Chicken" , "Pork", " Fish", "Crab"};
 static String fruits [] = {"Apples" , "Oranges" , " Bananna" , "Grapes" , "Papaya"};
 
  static String perfumes [] = {"Denver", "Axe", "Fogg"};
 public static void main (String args[] ) {
   
 String vegitables[] = {"Carrot" , "Tommato" , "Onion", "Beens" , "Drum Stick" , "Ginger" , "Pumpkin" , "Heere Kai"};
 System.out.println (" Welcome to " + superMarket);
 System.out.println ("Types of vegitables");
 for (int a = 0; a < vegitables.length;a++){
 System.out.println(vegitables[a] + " " );
	}
 System.out.println ("********************************************************");
 System.out.println ("The size of the Clothes" + clothes.length);
 System.out.println ("Types of Clothes");
 for(int b = 0; b < clothes.length; b++){
 System.out.println( clothes[b] + " ");
	}
 System.out.println ("********************************************************");
 System.out.println ("Types of Footwears");
 for(int c = 0; c < footwears.length; c++){
 System.out.println( footwears[c] + " ");
	}
 System.out.println ("********************************************************");
 System.out.println ("Types of Chocolates");
 for(int d = 0; d < chocolates.length; d++){
 System.out.println( chocolates[d] + " ");
	}
 System.out.println ("********************************************************");
 System.out.println ("Types of watches");
 for(int e = 0; e< watches.length; e++){
 System.out.println( watches[e] + " ");
	}
 System.out.println ("********************************************************");
 System.out.println ("Types of grocery");
 for(int f = 0; f< grocery.length; f++){
 System.out.println( grocery[f] + " ");
 }
 System.out.println ("********************************************************");
 System.out.println ("Types of meats");
 for(int g = 0; g < meats.length; g++){
 System.out.println( meats[g] + " ");
	}
 System.out.println ("********************************************************");
 System.out.println ("Types of fruits");
 for(int h = 0; h< fruits.length; h++){
 System.out.println( fruits[h] + " ");
	}
   }
}