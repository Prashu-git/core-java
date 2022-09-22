class Fibo {
public static void main (String [] args ){

int n = 20 ;
int f = 1, s = 1;
int t;
System.out.println (f);
System.out.println (s);

for (int i = 3; i<=n ; i++){
t=f+s;
System.out.println (t);
f=s;
s=t;





}



}
}