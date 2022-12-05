 class Remindar {
 public static void main (String [] args){
 
 long number = 465565595l, revers = 0, lastdigit;
 while (number!=0){
lastdigit = number%10;
revers = revers*10+lastdigit;
number = number/10;
 }
  System.out.println (revers);

 }
 }  