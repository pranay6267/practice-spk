package pranay_prac;
public class Searchmultidimensionalarray {
	int a[][]= {{1,2} ,{3,4}};
	int se;
	int fe;
	boolean t = false;
	

    void ch(int element) { //  took element from class lsearch class 
        se = a.length;
        // For each sub-array, get its length inside the loop (not once outside)
        for (int i = 0; i < se; i++) {
            fe = a[i].length;
            for (int j = 0; j < fe; j++) {
                if (a[i][j] == element) {
                    System.out.println("The number is found");
                    t = true;
                    break; // breaks inner loop
                }
            }
        }

        if (t==false) {
            System.out.println("The number is not found");
        }
    }
	
		
public static void main(String[]args) {
	
	lsearch op = new lsearch();// took from aother class lsearc  the method ele()  which consits of enter searchble number 
	op.ele();
	Searchmultidimensionalarray gp = new Searchmultidimensionalarray(); 
	gp.ch(op.element);
}
}

	  

  

