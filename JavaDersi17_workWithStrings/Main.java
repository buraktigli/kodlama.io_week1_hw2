package JavaDersi17_workWithStrings;

public class Main {

	public static void main(String[] args) {

		String message = "bugun hava cok guzel";

		System.out.println(message);

		System.out.println("eleman sayisi: " + message.length()); // stringin uzunluğunu verir

		System.out.println("5. karakter: " + message.charAt(4)); // istediğin sıradaki karakteri verir

		System.out.println(message.concat(". mutlu oldum")); // stringleri birleştirmek için kullanılır

		System.out.println(message);
		
		System.out.println(message.startsWith("A")); //A ile başlıyor mu diye kontrol eder. çıktısı false olur
		
		System.out.println(message.endsWith("l")); //l ile biityor mu diye kontrol eder/ .iktisi true olur
		
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0); //ilk 5 karakteri getirir
		System.out.println(karakterler);
		
		System.out.println(message.indexOf('a')); //aradığın karakterin  kaçıncı index olduğunu gösterir aramaya soldan başlar
		System.out.println(message.lastIndexOf('a')); //aradığın karakterin  kaçıncı index olduğunu gösterir aramaya sağdan başlar 
	

}
}
