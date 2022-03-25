import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn=new Scanner(System.in);
    System.out.println("Introduce un numero");
    int n=sn.nextInt();
    if(Funciones.Funciones.esPrimo(n)) {
    	System.out.println(n+ " es un numero primo");
    }else {
    	System.out.println(n+ " no es un numero primo");
    }
	}
}


