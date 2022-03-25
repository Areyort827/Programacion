
public class Ejercicio9 {

	public static void main(String[] args) {
		for (int i=1;i<=20;i++) {
			int notas=(int)(Math.random()*11);
			
		if (notas<5) {
			System.out.println(notas+" INSUFICIENTE");
		}else {
			if(notas<6) {
				System.out.println(notas+" SUFICIENTE");
		}else {
			if(notas<7) {
				System.out.println(notas+" BIEN");
			}else {
				if(notas<9) {
					System.out.println(notas+" NOTABLE");
				}else {
					if(notas<11) {
						System.out.println(notas+" SOBRESALIENTE");
					}
				}
			}
		}
			
		}
			}
		}
	

	}


