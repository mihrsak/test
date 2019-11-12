package vjezbe.vjezbanje.operators;

public class ByteShift {

	public ByteShift() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte a = 64, b;
			int i;
			
			i = a << 2;
			b = (byte) (a<<2);
			
			System.out.println("Original value of a: " + a);
			System.out.println("i and b: " + i + " " + b);
			
//The left shift operator, <<, shifts all of the bits in a value to the left a specified number of times.
	}

}
