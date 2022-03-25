import java.util.*;
public class Ejercicio2_16 {
	public static void main(String[] args) {
		int cont=0;
		Scanner sn= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n= sn.nextInt();
	    for (int j=1;j<=n;j++) {
	    	if (n%j<=0) {
	    		cont++;
	    	}
	    	
	    }
	    if (cont<=2) {
	    	System.out.println("Es primo");
	    	
	    }
	    if (cont>2) {
	    	System.out.println("No es primo");
	    	
	    }
	}
}
