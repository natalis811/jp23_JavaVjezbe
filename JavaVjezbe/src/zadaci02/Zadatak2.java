package zadaci02;

public class Zadatak2 {

	public static void main(String[] args) {
        int i=2,j=1,t;
		
		i+=j; // i=3 
		//i=i+j;
		t=j+i++; //t=4, i=4
		// t=j+i;
		// i++;
		j+=1; // j=2
		//j=j+1;
		System.out.println(i+j+t);
		// bez izvođenja dobiti rezultat koji se provjeri izvođenjem
		
		// rezultat=10

	}

}
