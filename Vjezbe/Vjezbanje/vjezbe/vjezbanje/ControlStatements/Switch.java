package vjezbe.vjezbanje.ControlStatements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 4;
		
		String season;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			season ="winter";
			break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Autumn";
				break;
				default:
				season = "Bogus Month";
		}
		System.out.println("April is in the " + season + ".");

	}

}
