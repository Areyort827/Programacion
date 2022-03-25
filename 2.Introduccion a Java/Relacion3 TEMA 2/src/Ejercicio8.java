
public class Ejercicio8 {
	public static void main(String[] args) {
		int lon=(int)(Math.random()*40+1);
		for (int j=1;j<=lon;j++) {
			String[] caracter= {"*","-","=",".","|","@"};
			int icaracter=(int)(Math.random()*6);
			System.out.print(caracter[icaracter]);
		}
	}
}
