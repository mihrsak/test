package vjezbe.vjezbanje.DataTypesVariablesArrays;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		for(x = 0; x < 10; x  = x + 1)
			System.out.println("This is x: " + x);
		System.out.println("-------------------------------------------------");	
		for(x = 0; x < 10; x++)
			System.out.println("This is x: " + x);
		System.out.println("-------------------------------------------------");
		
		for(x = 0; x < 10; ++x)
			System.out.println("This is x: " + x);
		
		System.out.println("-------------------------------------------------");
		
		for(x = 10; x > 0; x--)
			System.out.println("This is x: " + x);
		

	}

}
