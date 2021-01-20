package zadaci04;

import javax.swing.JOptionPane;

public class Zadatak02 {

	public static void main(String[] args) {
		// Program unosi 2 broja od korisnika
		// Program ispisuje razliku kao rezultat izvođenja
		// metode koja prima dva parametra i tipa je float
		String a = JOptionPane.showInputDialog("Unesi prvi broj");
		String b = JOptionPane.showInputDialog("Unesi drugi broj");
		float x = Float.parseFloat(a);
		float y = Float.parseFloat(b);
		
		System.out.println(oduzmi(x, y));
		
	}
	
	public static float oduzmi (float x, float y) {
		return x-y;
		
	}

}

