package zadaci04;

import javax.swing.JOptionPane;

public class Zadatak01 {

//Upogonite smisleno svih 6 razlicitih nacina poziva metode
//JOptionPane.showInputDialog
	public static void main(String[] args) {
	            JOptionPane.showInputDialog("Unesi broj");
				JOptionPane.showInputDialog(null, "Unesi broj 2");
				JOptionPane.showInputDialog("Unesi broj 3", 1);
				JOptionPane.showInputDialog(null, "Unesi broj 4", 2);
				JOptionPane.showInputDialog(null, null, null, 0);
				JOptionPane.showInputDialog(null, "Odaberi", "Odabir broja", JOptionPane.WARNING_MESSAGE, null, new String[] {"Broj1", "Broj2"}, "Broj1");
			}
			
		}


	


