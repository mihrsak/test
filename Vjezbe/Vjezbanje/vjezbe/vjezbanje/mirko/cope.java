package vjezbe.vjezbanje.mirko;

public class cope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; // known to all code within main
		
		x = 10;
		
		if(x == 10) {//start the new scope
			int y = 20; //known only to this block
			//x and y both known here
			System.out.println("x and y : " + x + " " + y);
			
			x = y * 2;
		}
		// y = 100; Error! y not known here
		// x is still known here.
		System.out.println("x is: " + x);
	}

}
