import java.util.*;
public class Ejercicio2_15 {

	public static void main(String[] args) {
		int cont=1;
		Scanner sn= new Scanner(System.in);
		System.out.println("Introduce un numero de base");
		int n= sn.nextInt();
		System.out.println("Introduce un numero de exponente");
		int m= sn.nextInt();
		for (int j=1; j<=m; j++) {
			System.out.println(n+"^"+cont);
        cont++;
		}

	}

}
