package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		
		
		int sayi = 22;
		Boolean asal = true; 
		
		if(sayi<1) {
			System.out.println("ge�ersiz say�");
			return;
		}
		
		
		for(int i = 2; i<sayi;i++) {
			if(sayi % i == 0) {
				asal = false;
				
			}
		}
		
		if(asal) System.out.println("asald�r");
		else System.out.println("asal de�il");
	}

}
