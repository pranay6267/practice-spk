package pranay_prac;
import java.util.Scanner;
 public class Inputarray{
	 
	 Scanner sc = new Scanner (System.in);
	 int s;
	 
	 int size() {
		 System.out.println("enter the size fo array:");
		 
	     s = sc.nextInt();
		System.out.println("the size of the array is :" +s);
		 return s;
	 }
	 
	 void ar() {
		 int array[] = new int[s];
		 for (int i=0;i<s;i++) {
			 System.out.println("enter the element"+(i+1)+ ":" );
			 array[i] = sc.nextInt();
			 
		 }
		 
		 for (int i =0;i<s;i++) {
			 System.out.println("the array is " +i+ ":"  + array[i]);
		 }
		 
	
			 
		 }
	 public static void main (String[]args) {
		 Inputarray v = new Inputarray();
		 v.size();
		 v.ar();
	 }
	 
	 }

 
	 
 
 