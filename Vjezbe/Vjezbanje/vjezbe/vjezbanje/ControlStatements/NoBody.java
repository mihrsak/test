package vjezbe.vjezbanje.ControlStatements;

public class NoBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 100;
		j = 200;
		
		// find mindpoint between 1 and j
		
		//while(++i < --j); //no body in this loop
		while(i++ < j--); //no body in this loop
		
		System.out.println("Mindpoint is :" + i);

	}

}
