package zadaci04;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {
		// kreirajte metodu naziv ucitajBroj tipa int
		// koja od korisnika beskonačno traži 
		// unos sve dok korisnik ne unese broj veći od 0
		// kada se to dogodi metoda tako unesenu vrijednost
		// vrati onome koji ju je pozvao
		
		System.out.println(ucitajBroj());
		
	}
	public static int ucitajBroj() {
		int x = 0;
		while (x <= 0) {
			String a =JOptionPane.showInputDialog("Unesi broj");
			x = Integer.parseInt(a);	
		}
		return x;
		
	}
	

}

