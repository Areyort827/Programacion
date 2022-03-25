
public class Ejercicio2 {

	public static void main(String[] args) {
		
		String[] palo= {"Picas", "Corazones","Diamantes","Treboles"};
		String[] carta= {"As", "2","3","4","5","6","7","8","9","10","J","Q","K"};
		int ipalo=(int)(Math.random()*4+1);
		int icarta=(int)(Math.random()*13+1);
		System.out.println("La carta aleatoria es " + carta[icarta] + " de " + palo[ipalo]);
		

	}

}
