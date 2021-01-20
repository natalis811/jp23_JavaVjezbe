package zadaci04;

public class Zadatak04 {

	public static void main(String[] args) {
		// Kreirati metodu tipa int naziva suma koja prima 
		// jedan parametar koji je tipa niz cijelih brojeva (int[])
		// metoda vraća sumu svih elemenata primljenog niza
		
		// Prikazati poziv metode tako da ispisani rezultat bude 12
		int [] niz = {6,4,2};
		System.out.println(suma(niz));
	
	}

	static int suma (int[] niz) {
		int suma = 0;
		
		for (int i=0; i<niz.length; i++) {
			suma = suma + niz[i];
		}
		
		return suma;
		
	}
	
}


