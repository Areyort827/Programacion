
public class Ejercicio3 {

	public static void main(String[] args) {
    String[] palo= {"Basto","Oro","Espada","Copa"};
    String[] carta= {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};
    int ipalo=(int)(Math.random()*4+1);
    int icarta=(int)(Math.random()*10+1);
    System.out.println("La carta es "+carta[icarta]+" de " +palo[ipalo]);
	}

}
