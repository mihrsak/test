package vjezbe.vjezbanje.mirko;

public class BlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x, y;
			
			y = 20;
			
			//the target of this loop in the block
			for(x= 0; x<10;x++) {
				System.out.println("This is x: "+x);
				System.out.println("This is y: "+y);
				y = y - 2;
			}
			 
			if(x<y) {//Begin a block
				x=y;
				y=0;
			}//end of block
	}

}
