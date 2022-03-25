import java.util.*;
public class Ejercicio2_12 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n, j, f;
		f=0;
		int m=1, suma=0;
		n = sn.nextInt();
		System.out.println(f);
		for (j=1; j<=n; j++) {
			System.out.println(suma);
			suma=f+m;
			f=m;
			m=suma;
			
			
			
			
			
		}
	}

}
