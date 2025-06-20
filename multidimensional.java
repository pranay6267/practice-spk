package pranay_prac;

public class multidimensional {
	
int e[][];
int f;
int g;

int[][] twoIn() {
	
	e = new int[2][2];
	
	e[0][0]= 2;
    e[0][1]= 4;
    e[1][0]= 6;
    e[1][1]= 8;
    
    return e;
    
}

int twoLc() {
	
	f=e.length;
	System.out.println("the length of the array is " +f);
	return f;
}

int twoLr() {
	g=e[0].length;
	System.out.println("the coolumns are :" +g);
	return g;
}
 void twoIni() {
	 for ( int i =0; i<f;i++) {
		 for (int j=0;j<g;j++) {
			 System.out.println("the array is :" + e[i][j]);
		 }
	 }
 }

}
