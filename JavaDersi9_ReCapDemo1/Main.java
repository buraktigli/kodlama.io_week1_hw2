package JavaDersi9_ReCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=3;
		int sayi2=1;
		int sayi3=5;
		int enBuyuk;
		
		if(sayi1>sayi2) {
			
			if(sayi1>sayi3) {
				enBuyuk=sayi1;
			}
			else {
				enBuyuk=sayi3;
			}
		}
		else {
			if(sayi2>sayi3) {
				enBuyuk=sayi2;
			}
			else {
				enBuyuk=sayi3;
			}
		}
		System.out.println("en buyuk sayi: " + enBuyuk);

	}

}
