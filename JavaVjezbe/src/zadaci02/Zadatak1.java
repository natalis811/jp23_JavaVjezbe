package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		// korisnik unosi cijeli broj. 
		// Program ispisuje 1 ako ne neparan, 0 ako je paran
		String s = JOptionPane.showInputDialog ("Unesi broj");
		
		int i = Integer.parseInt(s);
		
		if (i%2==0) {
			
			System.out.println("0");
			
		} else {
			System.out.println("1");
		}
		
	}

}
