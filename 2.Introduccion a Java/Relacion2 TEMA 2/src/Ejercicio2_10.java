import java.util.*;
public class Ejercicio2_10 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		 int n;
		double  suma, numeros;
		 suma=0;
		numeros=0;
		 System.out.println("Introduce un número positivo: ");
	        do { 
	        	n = sn.nextInt();
	            suma=suma+n;
	            numeros++;
	        }while (n>0);
	        
		    suma=suma-n;
		    numeros=numeros-1;
             System.out.println("La media de los numeros es " + suma/numeros);
	}

}
