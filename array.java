package pranay_prac;

class b {
	int a[];
	int c;
	 int[] sigle() {
		  a = new int[5];
		  a[0] =9;
		  a[1] =8;
		  a[2] =7;
		  a[3] =6;
		  a[4] =5;
		  
		 return a;
	 }
	 void len() {
		  c = a.length;
		 System.out.println("the legth of the array is :" +c);	 
	 }
	 void loop() {
		 for (int i=0; i<a.length;i++) {
			 System.out.println("the array are " +a[i]);
		 }
	 }
}
