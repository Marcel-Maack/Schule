import java.util.Scanner;
public class Unterrichtsende {

	

	public static void main(String[] args) {
		double temp;
		boolean klima;
		boolean getraenke;
		
		
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Bitte geben sie die Temperatur ein: ");
		temp = meinScanner.nextDouble();
		System.out.println("Klimaanlage vorhanden true / false ");
		klima = meinScanner.nextBoolean();
		System.out.println("Getränke vorhanden true / false ");
		getraenke = meinScanner.nextBoolean();
		
		
		hitzefrei(temp, klima, getraenke);
		
		//System.out.println(hitzefrei(temp, klima, getraenke));
		
		meinScanner.close();
	}
	
	
		public static void  hitzefrei(double temp,boolean klima,boolean getraenke){
		if (temp > 35 && !klima && getraenke) {
			System.out.println("Ende 14:00");
		}
		
		else if(temp >35 && !klima && !getraenke) {
			System.out.println("Ende sofort");
		}
		
		else {
			System.out.println("Ende 16:45");
		}

	}
}

