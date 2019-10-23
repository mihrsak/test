package vjezbe.vjezbanje.mirko;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte b;
			int i = 257;
			double d = 323.142;
			
			// ostatak dijeljenja djeljenika 257 sa 256 (the range of byte)
			System.out.println("\nConversion of int to byte.");
			b = (byte) i;
			System.out.println("i and b " + i + " " +  b) ;
			
			// fractional component is lost
			System.out.println("\nConversion of double to int.");
			i  = (int) d;
			System.out.println("d and i " + d + " " +  i) ;
			
			// fractional component is lost and the value is reduced modulo 257 which is 67
			// 323 mod 256 = 67
			System.out.println("\nConversion of double to byte.");
			b  = (byte) d;
			System.out.println("d and b " + d + " " +  b) ;

	}

}
