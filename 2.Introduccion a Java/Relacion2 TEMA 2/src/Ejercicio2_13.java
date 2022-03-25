import java.util.*;
public class Ejercicio2_13 {

	public static void main(String[] args) {
		int n, pos=0, neg;
		
		Scanner sn= new Scanner(System.in);
		System.out.println("Introduce 10 numeros");
		for (int  j=1;j<=10; j++) {
			n= sn.nextInt();
			if (n>0) {
				pos++;
				
			
			
			}
		}
		neg=10-pos;
		System.out.println("Hay "+pos +" numeros positivos"+ " y "+neg+" numeros negativos");
	}

}
