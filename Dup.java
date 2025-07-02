package pranay_prac;

public class Dup {
		
		int a[]= {1,3,4,5,2,1,5,7,9};
		int size;
		
		void check ()
		{
			int  size = a.length;
			System.out.println("the size of array is :" +size);
			for (int i =0;i<size;i++) {
				for (int j =i+1;j<size;j++) {
					if(a[i]==a[j]) {
						System.out.println("the following are duplicate:"+a[i]);
						break;
					}
				}
			}
		}
		public static void main(String[] args) {
			Dup s = new Dup();
			s.check();
		}
	}

