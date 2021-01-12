package zimski_zadaci;

public class Zadatak04 {

	public static void main(String[] args) {
		//Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		int sum =0;
		int sum1=0;
		int sumtotal=0;
		{
			int x=4;
			int y=4;
			
			int[][] m = new int[x][y];
			
			for (int i=0; i<x; i++) {
				for (int j=0; j<y; j++) {
					m[i][j]= i*j;
					sum = sum + i*j;
					System.out.print(m[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(sum);
		}
	
		{
			int a=4;
			int b=4;
			
			int [][]n = new int [a][b];
			for (int k=0; k<a; k++) {
				for (int l=0; l<b; l++) {
					n[k][l]= k*l;
					sum1 = sum1 + k*l;
					System.out.print(n[k][l]+" ");
			
		         }
				System.out.println();
	         }
			System.out.println(sum1);
		}
		sumtotal = sum + sum1;
		System.out.println(sumtotal);
		
	}
}
