
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tirada=1;
				while (tirada<=1) {
					int dado1= (int)(Math.random()*6+1);
					System.out.println("Primer dado: "+dado1);
					int dado2= (int)(Math.random()*6+1);
					System.out.println("Segundo dado: " +dado2);
					 if (dado1!=dado2) {
						 tirada=1;
					 }else {
						 System.out.println("Los dados han coincidido");
						 tirada=2;
					 }
		}
		
		

	}

	}
