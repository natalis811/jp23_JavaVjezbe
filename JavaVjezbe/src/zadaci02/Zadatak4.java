package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		// Korisnik unosi 3 cijela broja 
		// program ispisuje najveći
		String a = JOptionPane.showInputDialog ("Unesi broj");
		String b = JOptionPane.showInputDialog ("Unesi broj");
		String c = JOptionPane.showInputDialog ("Unesi broj");
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int k = Integer.parseInt(c);
		
		if (i>j & i>k ) {
		
		System.out.println(i);
	}
		else if (j>i & j>k) {
			
			System.out.println(j);
		}
		else if (k>i & k>j) {
			
			System.out.println(k);
		}

}
}
