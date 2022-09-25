package JavaDersi15_ReCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {0.1, 2.3, 4.5, 6.7, 8.9};
		double total=0;
		double max= myList[0];
		
		for(double list:myList) {
			System.out.println(list);
		}
		System.out.println("--------");

		for(double number:myList) {
			total = total + number;
		}
		System.out.println("toplam:" + total);
		System.out.println("--------");
		
		for(double number:myList) {
		if(max<number){
			max = number;
		}
		else{
			max=max;
		}
				
		}
		System.out.println(max);
}

}
