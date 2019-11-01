package vjezbe.vjezbanje.operators;

public class ShortCircuitBool {

	public ShortCircuitBool() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  int x, y, z, denom = 0, num = 100;

		  x = 10;
		  y = 20;
		  z = 30;
		  
		  
		  // T T
		  // T F
		  // F T
		  // F F

		  //SET A
		  boolean a = (x < z) && (x == x);
		  boolean b = (x < z) && (x == z);
		  boolean c = (x == z) && (x < z);
		  boolean d = (x == z) && (x > z);
		  //SET B    
		  boolean aa = (x < z) & (x == x);
		  boolean bb = (x < z) & (x == z);
		  boolean cc = (x == z) & (x < z);
		  boolean dd = (x == z) & (x > z);
		  
		  // if denom is zero (0) with && there is  no error becoause second part wont be done (num / denom) dividing by zero is not allowed
		  // change && to & and set denom as 0 and run = error
		  if (denom != 0 && num / denom > 10) System.out.println("denom: " + denom + ", num: " + num + ", score (num / denom): " + num / denom);

		}

}
