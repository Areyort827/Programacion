import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		 System.out.println("Introduce un numero entero");
		    int a=sn.nextInt();
		 System.out.println("Elige la posicion del numero");
		    int n=sn.nextInt();
		    int re=Funciones.Funciones.digitoN(a, n);
		    System.out.println("En la posicion "+n+" se encuentra el numero "+re );
	}

}
