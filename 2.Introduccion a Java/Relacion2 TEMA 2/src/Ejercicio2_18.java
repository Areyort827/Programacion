import java.util.*;
public class Ejercicio2_18 {

	public static void main(String[] args) {
		Scanner sn= new Scanner (System.in);
		int num=0;
		System.out.println("Introduce un numero entero positivo");
		int n= sn.nextInt();
		System.out.println("Introduce otro numero entero positivo");
		int m= sn.nextInt();
		for (int j=n; j<=m;j++) {
			num=n+7;
			n=num;
			if(num<m) {
			System.out.println(num);
		}
		}
		
	}

}
