package vjezbe.vjezbanje.operators;

public class MultByTwo {

	public MultByTwo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i;
			int num = 0xFFFFFFE;
			
			for (i=0;i<4;i++) {
				num = num << 1;
				System.out.println(num);
			}

	}

}
