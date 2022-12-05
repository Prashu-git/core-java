class Reverse {
public static void main (String [] args){
String name = "Boss";
char[] chArr = name.toCharArray();
for (int i = chArr.length-1 ; i >=0 ; i--){

System.out.print (chArr[i]);
}


}
}