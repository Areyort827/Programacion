import java.util.*;
public class Ejercicio2_11 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int n;
		System.out.println("Introduce un número positivo: ");
		n = sn.nextInt();
		for (int j=1 ; j<=5; j++) {
			System.out.println(n+" "+n*n+" "+n*n*n );
			n++;
		}
	}

}
