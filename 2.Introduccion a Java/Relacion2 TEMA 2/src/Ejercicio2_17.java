import java.util.*;
public class Ejercicio2_17 {
	public static void main(String[] args) {
		int suma=0;
    Scanner sn=new Scanner(System.in);
    System.out.println("Introduce un numero entero positivo");
    int n=sn.nextInt();
    for (int j=1;j<=100;j++) {
    	 suma=suma+n;
    	n++;
    }
    System.out.println("La suma de los 100 primeros numeros siguiente es "+suma);

	}

}
