class Banks {

static String bankNames [] = {null,null,null,null,null};
static int a;

public static boolean addBankNames (String bankName){

System.out.println ("inside addBankNames");

bankNames[a++]=bankName;

System.out.println ("end of  addBankNames");
return true;


}
public static String getBankNames (){
for (int i = 0;i<bankNames.length; i++){
String ref = bankNames[i];
System.out.println("The Banks Names are " + ref);

}
return null;
}


}