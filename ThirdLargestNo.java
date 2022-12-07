class ThirdLargestNo{
static int temp;
public static void main (String args []){
int a [] = {5,7,3,0,2,6,94,1};
int b;
for (int i = 0 ; i<a.length ;i++){
for (int j=i+1; j<a.length;j++){		
		if (a[i]<a[j]){			
			temp = a[i];
			a[i]=a[j];
			a[j]= temp;
			
		}
	}
	
}

for (int s =0 ; s<a.length;s++ ){
	
	System.out.println(a[s]+ " " + " \n ");
	
}
	System.out.println ("The third largest element is " +   a[2]);




}
}