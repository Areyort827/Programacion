import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sn=new Scanner(System.in);
 System.out.println("Introduce un numero entero");
    int n=sn.nextInt();
    int di=Funciones.Funciones.digitos(n);
    System.out.println("El numero "+n+" tiene "+di+" digitos");
	}

}
