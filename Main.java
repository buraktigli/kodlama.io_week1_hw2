package JavaDersi19_AsalSayiBulma;

public class Main {

	public static void main(String[] args) {
		
		double number=11;
		
		if(number==1){
        	System.out.println("asal degildir");
        	return; //number=1 olursa bu satirdan dolayı diger sorgu calismaz. 
        }
		
		if(number<1) {
			System.out.println("kendi sorgum: gecersiz sayi");
			return;
		}
		else if(number%2==0) {
			if(number==2) {
				System.out.println("kendi sorgum: asaldir");
			}
			else
        	System.out.println("kendi sorgum: asal degildir");
        }
        else if(number%3==0){
        	if(number==3) {
				System.out.println("kendi sorgum: asaldir");
			}
			else
        	    System.out.println("kendi sorgum: asal degildir");
        }
        else if(number%5==0){
        	if(number==5) {
				System.out.println("kendi sorgum: asaldir");
			}
			else
        	    System.out.println("kendi sorgum: asal degildir");
        }
        else if(number%7==0){
        	if(number==7) {
				System.out.println("kendi sorgum: asaldir");
			}
			else
        	    System.out.println("kendi sorgum: asal degildir");
        }
        
        else
        	System.out.println("kendi sorgum: asaldir");
		
		System.out.println("----------------------------------");
		
		
		//youtube ders videosunda yapılan:
		
		int given=11;
		boolean isPrime = true;
		
		if (given==1) {
			System.out.println("hocanin sorgusu: asal degildir");
        	return;
		}
		if(given<1) {
			System.out.println("hocanin sorgusu: gecersiz sayi");
			return;
		}
		
		for(int i=2; i<given; i++) {
			if(given%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
		       System.out.println("hocanin sorgusu: asaldir");
		}
		else
			System.out.println("hocanin sorgusu: asal degildir");
	    
	    
 }
	
}