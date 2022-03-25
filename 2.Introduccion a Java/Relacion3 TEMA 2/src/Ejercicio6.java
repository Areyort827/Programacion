import java.util.*;
public class Ejercicio6 {
	public static void main(String[] args) {
		  Scanner sn=new Scanner(System.in);
		int opr=5;
		int numero=(int)Math.floor(Math.random()*(0-(100+1))+(100));
		System.out.println("Adivine el numero comprendido entre el 0 y el 100: ");
		for (int j=1;j<=5;j++) {
		  opr=opr-1;
		  int n=sn.nextInt();
			if (n>numero) {
				System.out.println("El numero es menor");
				System.out.println("Intento fallido, quedan "+opr+" oportunidades");
		}         else if(n<numero){
					System.out.println("El numero es mayor");
					System.out.println("Intento fallido, quedan "+opr+" oportunidades");
		        } else {
		    	   System.out.println("Has acertado el numero,ENHORABUENA");
		    	   j=5;
		       
		  }
		}
	}
}
