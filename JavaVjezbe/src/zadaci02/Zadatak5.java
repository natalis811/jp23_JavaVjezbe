package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {

		// Korisnik unosi cijeli broj
		// Ako je paran broj unesen ispiši Osijek
		// Ako je neparan broj unesen ispiši Zagreb

		// koristiti inline if
		String a = JOptionPane.showInputDialog ("Unesi broj");
		
		int i = Integer.parseInt(a);
		
		System.out.println(i%2==0 ? "Osijek" : "Zagreb");

	}

}
