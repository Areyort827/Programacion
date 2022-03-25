import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sn= new Scanner(System.in);
System.out.print("Introduce una base para la potencia");
int b=sn.nextInt();
System.out.print("Introduce un exponente para la potencia");
int e=sn.nextInt();
int re=Funciones.Funciones.potencia(b, e);
System.out.println(b+"^"+e+"="+re);

	
}
	}



