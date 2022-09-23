package JavaDersi10_switchBlocks;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("mukemmel, gectiniz.");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi, gectiniz.");
			break;
		case 'D':
			System.out.println("fena degil, gectiniz.");
			break;
		case 'F':
			System.out.println("maalesef kaldiniz.");
			break;
		default:
			System.out.println("gecersiz not girdiniz!");
			break;
		}

	}

}
