import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Los numeros primos del 1 al 1000 son: ");
		    for (int i=1;i<=1000;i++) {
		    if(Funciones.Funciones.esPrimo(i)==true) {
		    	
		    	System.out.println(i);
		    }
		  }
	}

}
