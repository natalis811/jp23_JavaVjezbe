package zadaci01;

import javax.swing.JOptionPane;

public class Vjezba {

	public static void main(String[] args) {
		//Korisnik unosi decimalni broj
		// Program ispisuje samo cijeli dio broja
//String s = JOptionPane.showInputDialog ("Unesi broj");
//		
//		double d = Double.parseDouble(s);
//		
//		double i = (int) d;
//		
//		System.out.println(i);
		
		// Korisnik unosi decimalni broj
		// Program ispisuje samo decimalni dio broja
		
		String s = JOptionPane.showInputDialog ("Unesi broj");
		
		double d = Double.parseDouble(s);
		
		double i = (int) d;
		
		//System.out.println(d-i);
		System.out.printf("%.2f",d-i);

		
	}

}
