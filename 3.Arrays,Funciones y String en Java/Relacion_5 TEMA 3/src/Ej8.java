import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		 System.out.println("Introduce un numero entero");
		    int a=sn.nextInt();
		 System.out.println("Elige un numero");
		    int n=sn.nextInt();
		    int re=Funciones.Funciones.posiciondedigito(a, n);
		    System.out.println("El numero "+n+" se encuentra en la posicion "+re );
	}

}
