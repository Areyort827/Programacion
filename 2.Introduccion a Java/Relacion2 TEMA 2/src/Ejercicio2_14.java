import java.util.*;
public class Ejercicio2_14 {
	public static void main(String[] args) {
		int sol=0;
	Scanner sn= new Scanner(System.in);
	System.out.println("Introduce un numero base");
	 int n = sn.nextInt();
	System.out.println("Introduce un numero exponente");
	int e= sn.nextInt();
	for (int j=1; j<=e; j++) {
   sol= sol+n*n;
	    }
	System.out.println("La solucion es "+ sol);
	}
	
}
