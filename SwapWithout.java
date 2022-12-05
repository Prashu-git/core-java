class SwapWithout {
public static void main (String [] args){

int a = 1;
int b = 2;

System.out.println ("Before swap a : " + a);
System.out.println ("Before swap b : " + b);

a = a+b;
b = a-b;
a = a-b;

System.out.println ("After swap a : " + a);
System.out.println ("After swap b : " + b);


}

}