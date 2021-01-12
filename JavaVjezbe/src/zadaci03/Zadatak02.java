package zadaci03;

public class Zadatak02 {

	public static void main(String[] args) {
		// Ispisati sve parne brojeve od 10 do 50
		// koristeći do while
		int i=10;
		do {
			if (i%2==0) {
			System.out.println(i);
			}
			i++;
		}while (i<=50);
		

	}

}
