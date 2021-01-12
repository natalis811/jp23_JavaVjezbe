package zimski_zadaci;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {
		//Kreirati program koji za dva unesena broja ispisuje sve prim/prosti/prime brojeve između njih.
		String unioKorisnik= JOptionPane.showInputDialog("Unesi broj");
		String unioKorisnik1= JOptionPane.showInputDialog("Unesi broj");
		int a = Integer.parseInt(unioKorisnik);	
		int b = Integer.parseInt(unioKorisnik1);
		int i = 0;
		
	    for (i=a; i<=b;i++ ) {
	    	if (i == 1) {
	    		continue;
	    	}
	    	
	    	int c = 0;
	    	for (int j = 1; j<Integer.MAX_VALUE; j++) {
	    		if (i%j == 0) {
	    			c++;
	    		}
	    		if (c == 2 && j == i) {
	    			break;
	    		} else if (c > 2) {
	    			break;
	    		}
	    	}
	    	
	    	if (c == 2) {
	    		System.out.println(i);
	    	}
	    }
	}
}