package JavaDersi14_Arrays;

public class Main {

	public static void main(String[] args) {

		String[] ogrenciler = new String[4];

		ogrenciler[0] = "engin";
		ogrenciler[1] = "salih";
		ogrenciler[2] = "murat";
		ogrenciler[3] = "ayse";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		
		System.out.println("-------------");
		
		
		for(String students:ogrenciler)
		{
			System.out.println(students);
		}

	}

}
