package no.hvl.dat100.lab5.tabeller;
public class Tabeller {
	
	public static void main(String[] args) {
			int[] tabell = {1, 2, 5, 7, 8};
			int[] tabellb = {42, 67, 89};
		skrivUt(tabell);
		tilStreng(tabellb);
		int summer = summer(tabellb); 
		
		System.out.println(summer);
		 
		
	}
	
	// a)
	public static void skrivUt(int[] tabell) {
	
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String en = "["; 
		
		for (int i = 0; i<tabell.length-1; i++) {
			String kopi = Integer.toString(tabell[i]);
			en = en + kopi + ",";
		}
		System.out.println(en + tabell[tabell.length-1] + "]");
		return null;
	}
		

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}	
			return sum;
			
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
