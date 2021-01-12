package zimski_zadaci;

public class Zadatak02 {

	public static void main(String[] args) {
	// Kreirati program koji ispisuje tablicu množenja 15x15 lijepo formatiranu
		for (int i = 1; i < 16; i++) {
			for (int j = 1; j < 16; j++) {
				if (j == 15) {
					System.out.println((i * j)+ "   ");	
				} else {
					System.out.print((i * j)+ "   ");
				}	
			}
			
		}

	}

}
