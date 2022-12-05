class Armstrong {
static int  b ;
static int c = 0;
public static void main (String [] args){

int n =153;
int a = n;
while (n>0){
b = n%10;
b = Math.pow (b,3);
c = c+b;
n=n/10;
}

if (c == a){
System.out.println ("Armstrong");
}
else {
System.out.println (" not Armstrong");
}

}

}