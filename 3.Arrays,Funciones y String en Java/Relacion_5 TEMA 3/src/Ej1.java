import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n= sn.nextInt();
       if (!Funciones.Funciones.esCapicua(n)) {
    	   System.out.println("No es capicua");
       } else {
    	   System.out.println("Es capicua");
       }
       
	}

	

}
