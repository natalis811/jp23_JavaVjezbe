package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak6 {

	public static void main(String[] args) {
		// Korisnik unosi 2 broja. 
		// Ukoliko je produkt ta dva broja paran broj
		// ispisuje razliku unesinih brojeva
		// inače ispisuje cijeli dio kvocjenta prvog i drugog broja
		String a = JOptionPane.showInputDialog ("Unesi broj");
		String b = JOptionPane.showInputDialog ("Unesi broj");

		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int k = i*j;

		switch (k % 2) {
			case 0:
				System.out.println (i - j);
				break;
//			case 1:	
//				System.out.println("Tu sam");
//				break;
			default:
				System.out.println (i / j);
		}
		//if (k%2==0){
		//System.out.println (i-j);
		//}
		//else {
		//System.out.println (i/j);
		//}
	}

}