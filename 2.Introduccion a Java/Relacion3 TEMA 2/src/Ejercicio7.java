
public class Ejercicio7 {
	public static void main(String[] args) {
	    int num = 0;
	    int cont=0;
		while (num!=24) {
			int num1=(int)Math.floor(Math.random()*(0-(100+1))+(100));
			System.out.print(num1+" ");
			num=num1;
			cont=cont+1;
		}
		
		System.out.println("\n"+"Se han generado "+cont+" numeros");
			
		}
	}

