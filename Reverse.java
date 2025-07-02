package pranay_prac;

public class Reverse {

	int a[]= {20,30,40,50,60};
	int l;
	
	void r() {
		int l = a.length;
		System.out.println("length is :"+l);
		for(int  i=0; i<l;i++) {
			System.out.println("the array orginal sequence is:"+a[i]);
		}
		for (int j=l-1;j>=0;j--) {
			System.out.println("revere order is:"+a[j]);
		}
	}
	public static void main(String[] args) {
		Reverse e = new Reverse();
		e.r();
	}
} 
