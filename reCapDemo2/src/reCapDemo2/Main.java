package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double total =0;
		double max = myList[0];
		for(double o:myList) {
			total = total + o;
			System.out.println(o);
			if(max < o) {
				max = o;
			}
		}
		System.out.println("toplam = " + total);
		System.out.println("en buyuk sayi :" + max);
	}

}
