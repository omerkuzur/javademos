package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		int sayi = 497;
		int mukemmel = 0;
		
		for(int i=1;i<sayi;i++) {
			if(sayi % i == 0) mukemmel += i;
		}
		if(sayi == mukemmel) System.out.println("mukkemel sayi");
		else System.out.println("deðil");
	}

}
