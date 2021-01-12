package zimski_zadaci;

import javax.swing.JOptionPane;

public class Zadatak01 {

	public static void main(String[] args) {
// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i  najveći uneseni broj.
		int sum = 0;
		int min = 0;
		int max = 0;
		
		for(int i=0;i<24;i++) {
			String unioKorisnik= JOptionPane.showInputDialog("Unesi broj");	
			int a = Integer.parseInt(unioKorisnik);
			sum = sum + a;
			if (i == 0) {
				min = a;
				max = a;
			} else {
				if (a < min) {
					min = a;
				}
				if (a > max) {
					max = a;
				}
 			}
		}
		System.out.println("sum: " + sum);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
	

}
