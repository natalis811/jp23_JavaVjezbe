package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak7 {

	public static void main(String[] args) {
		// Program od korisnika unosi slovo
		// u slučaju slova A ispisuje 1. mjesto
		// pa sve do slova E gdje ispisuje 5. mjesto
		
		String a = JOptionPane.showInputDialog ("Unesi slovo");
		
		switch (a) {
			case "A" :
				System.out.println("1.mjesto");
				break;
			case "B" :
				System.out.println ("2.mjesto");
				break;
			case "C" :
				System.out.println("3.mjesto");
				break;
			case "D":
				System.out.println("4.mjesto");
				break;
			default :
				System.out.println("5.mjesto");
		}
		
		char f = a.charAt (0);
		
		switch (f) {
			case 'A' :
				System.out.println("1.mjesto");
				break;
			case 'B' :
				System.out.println ("2.mjesto");
				break;
			case 'C' :
				System.out.println("3.mjesto");
				break;
			case 'D':
				System.out.println("4.mjesto");
				break;
			default :
				System.out.println("5.mjesto");
		}
		
//		String a = JOptionPane.showInputDialog ("Unesi slovo");
		
//		char f = a.charAt (0);
		
//		if (f=='A') {
//		System.out.println ("1.mjesto");
//	 }
//	   else if (f=='B') {
//			System.out.println("2. mjesto");
//		}
//		else if (f=='C') {
//			System.out.println("3. mjesto");
//	}
//		else if (f=='D') {
//			System.out.println("4. mjesto");
//	}
//		else  {
//			System.out.println("5. mjesto");
//	}

	}

}
