package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
		case 'E':		
		case '�':
		case '�':
		case '�':
			System.out.println("�nce sesli harf");
			break;
			
		default:
			System.out.println("Yanl�� giri�");
			
		}
		
	}

}
