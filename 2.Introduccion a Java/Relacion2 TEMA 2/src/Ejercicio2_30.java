import java.util.*;
public class Ejercicio2_30 {

	public static void main(String[] args) {
      Scanner sn= new Scanner(System.in);
      System.out.println("Por favor,introduzca la primera hora");
      System.out.println("Dia: "); 
      int d= sn.nextInt();
      System.out.println("Hora: ");
      int h= sn.nextInt();
      System.out.println("Por favor,introduzca la primera hora");
      System.out.println("Dia: "); 
      int p= sn.nextInt();
      System.out.println("Hora: ");
      int j= sn.nextInt();
      int hor=j-h;
      int di=(p-d)*24;
      int res=hor+di;
      System.out.println("Entre las "+h +"h del dia "+d+" y las "+j+"h del dia "+p+" hay "+res+" horas");
	}

}
