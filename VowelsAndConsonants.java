class VowelsAndConsonants {

public static void main (String [] args ){
String s = "aeiou";
int vowel  = 0;
int cons = 0;
s = s.toLowerCase();
for (int i = 0 ; i<s.length(); i++){
char ch = s.charAt(i);


if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
vowel ++;


}

else {
cons ++;
}
}
System.out.println ("Total Vowels are " + vowel +" \n" + "Total Consonants are " + cons );

}

}