class Swap {
static int c;
public static void main (String [] args){

int a = 1;
int b = 2;
System.out.println ("Befor Swap a : " + a );
System.out.println ("Befor Swap b : " + b );



c=a;
a=b;
b=c;
System.out.println ("After Swap a : " + a );
System.out.println ("After Swap b : " + b );

}
}