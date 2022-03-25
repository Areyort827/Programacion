import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		 System.out.println("Introduce un numero entero");
		    int n=sn.nextInt();
		    int sol=Funciones.Funciones.voltea(n);
		    System.out.println(sol);
	}

}
