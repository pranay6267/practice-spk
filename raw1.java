package pranay_prac;
//import pranay_prac.spk3;
//import pranay_prac.gset;
public class raw1 {
	
	public static void main(String[] args) {
		
		        spk4 q = new spk4();
		        q.spk1(100, 200);  // Set values of a and b
		        q.spk2();          // Prints values from spk3
		        q.fin();           // Prints values inherited in spk4
		        gset sget = new gset();
		       
		        sget.setId(476);
		        sget.setName("pranay");
		        
		       System.out.println("the id is :" +sget.getId());
		       System.out.println("the name is:"  +sget.getName());
		        
		        
		         b pr = new b();
		         pr.sigle();
		         pr.len();
		         pr.loop();
		         
		         test1 s = new test1();
		         
		         s.nest();
		         s.l();
		         s.init();
		        
		    }

	}


