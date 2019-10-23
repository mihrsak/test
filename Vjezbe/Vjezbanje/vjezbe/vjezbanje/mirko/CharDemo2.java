package vjezbe.vjezbanje.mirko;

public class CharDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1;
		
		ch1 = 'X';
		System.out.println("ch1 contains " + ch1); 
		
		ch1++; // increment ch1
		System.out.println("ch1 is now: " + ch1);
		
		int i = 1;
		for(ch1= 1; ch1<128; ch1++) {
			System.out.println("ch1 is now: '" + ch1 + "' at ASCII " + i);
			i++;
		}
		
	}

}
