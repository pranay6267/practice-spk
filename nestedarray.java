package pranay_prac;

 class  test1{
	 int x[];
	 int y;
	  
	 int[] nest() {
		 x=new int[3];
		 x[0]=1;
		 x[1]=3;
		 x[2]=4;
		  return x;
		 
	 }
	 
	  int l() {
		  y=x.length;
		  System.out.println("the length of the array is :" +y);
		  return y;
	  }
	 
	   void init() {
		   
		   for(int i:x) {
			   System.out.println("the array are "  + i);
		   }
	   }

}
 
