package zadaci03;

public class Zadatak01 {

	public static void main(String[] args) {
		// Program unosi brojeve sve dok ne dođe broj -1
		//Program ispisuje sumu svih unesenih bojeva
		int i=10;
		int sum=0;
		while(i>-1) {
			sum=sum+i;
			System.out.println(i);
			i--;
		}
		System.out.println("sum:" + sum);
	}
}
