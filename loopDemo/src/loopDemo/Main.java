package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("for d�ng�s� bitti");

		int i=2;
		//while
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("while d�ng�s� bitti");
		
		//do-while
		int j=100;
		do {
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("do-while d�ng�s� bitti");
		
		
		
	}

}
