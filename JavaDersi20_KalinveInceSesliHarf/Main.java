package JavaDersi20_KalinveInceSesliHarf;

public class Main {

	public static void main(String[] args) {

		/*
		 * String harf = "ü";
		 * 
		 * String[] kalin = {"a","ı","o","u"}; String[] ince = {"e","i","ö","ü"};
		 * 
		 * for(int i=0; i < kalin.length; i++) {
		 * 
		 * if(harf == kalin[i]) { System.out.println("girilen harf kalin seslidir");
		 * return; } else System.out.println("girilen harf ince seslidir."); return; }
		 */

		char harf = 'B';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("girilen harf kalin sesli bir harftir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("girilen harf ince sesli bir harftir.");
			break;
		default:
			System.out.println("lutfen sesli bir harf giriniz.");
		}

	}

}
