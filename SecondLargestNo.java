class SecondLargestNo {

public static void main (String [] args){
	int a [] = {1,2,3,5,6,7,8,9,566};
	int firstNo = 0;
	int secondNo = 0;
	
	for (int i = 0; i<a.length ;i++){
		
		
		
		
		if (firstNo < a[i]){
							
							secondNo = firstNo;
							firstNo = a[i];
		}
		else if (secondNo< a[i]){
			
			secondNo= a[i];
				
				
				
			
	}
	
}
		System.out.print (secondNo);

}
}