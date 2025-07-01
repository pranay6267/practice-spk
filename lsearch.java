package pranay_prac;

import java.util.Scanner;


//search the element is found or not in the given array

public class lsearch {
	int a[ ]= {10,20,30,40};
	int element ;
	boolean tem = false;
	
	 int ele() {
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the searchable number :");
	  element=sc.nextInt();
	  System.out.println("enter the searchable number :"  +element);
	  return element;
	}

	void search() {
		int b = a.length;
		
		for (int i=0;i<b;i++) {
			
				if(a[i]== element) {
					System.out.println("the number is found");
					tem = true;
					break;
				}
		}
				if(tem= false) {
					System.out.println("the number is not found ");
			}
		
		}
		
	
	public static void main(String[] args) {
		lsearch q= new lsearch();
	    q.ele();
		q.search();
		
	
	}

}
