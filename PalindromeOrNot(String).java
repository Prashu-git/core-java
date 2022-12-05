class PalindromeOrNot {
public static void main (String [] args){

String  a = "abcba";
int i = 0 , j = a.length() -1;
while (i<j){
if (a.charAt(i) != a.charAt(j)){
System.out.println ("not palindrome");
System.exit (0);
}
i++;
j--;
}
System.out.println ("palindrome");
}

}