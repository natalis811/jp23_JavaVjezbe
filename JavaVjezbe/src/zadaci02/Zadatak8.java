package zadaci02;

import javax.swing.JOptionPane;

public class Zadatak8 {

	public static void main(String[] args) {
	//. Napiši program koji određuje površinu trokuta zadanih stranica.
//		int a = 2;
//		int b = 6;
//		int p = a*b;
//		
//		System.out.println(p);
		
		String a = JOptionPane.showInputDialog ("Unesi a");
		String b = JOptionPane.showInputDialog ("Unesi b");
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int p = i*j;
		
		System.out.println(p);
	}

}
