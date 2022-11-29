package JavaDersi18_workWithStrings2;

public class Main {

	public static void main(String[] args) {

		String message = "bugun hava cok guzel";

		System.out.println(message);
		
		String newMessage = message.replace(' ','-'); //message'daki boşluk olanları - ile değiştirdi
		System.out.println(newMessage);
	
		 
		System.out.println(message.substring(2)); //2 karakterden sonrasını ekrana yazdırır. ilk 2 karakteri yazdırmaz
		System.out.println(message.substring(2,4)); //2 karakterden 4. karaktere kadarını ekrana yazdırır. 4ü hesaba katmaz.
		
		for(String word : message.split(" ")) {   //split fonksiyonu kelimeleri verilen kritere göre parçalamaya yarar.
			System.out.println(word);            //burada verilen kriter boşluk tur. boşluğa göre kelimeleri parçalar.
		}  
		
		System.out.println(message.toLowerCase()); // içerdiği bütün harfleri küçük harfe çevirir.
		System.out.println(message.toUpperCase()); // içerdiği bütün harfleri büyük harfe çevirir.
		
		
		String message2 = "     bugun hava cok guzel      ";
		System.out.println(message2);
		System.out.println(message2.trim());  // verilen değerin başındaki ve sonundaki boşlukları siler.
		
		

}
}
