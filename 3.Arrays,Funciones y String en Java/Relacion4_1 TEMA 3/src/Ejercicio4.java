
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numero= new int[20];
int [] cuadrado= new int[20];
int [] cubo= new int[20];
for (int i=0;i<=19;i++) {
	numero[i]=(int)(Math.random()*100+1);
	System.out.print(numero[i]+" ");
	
	
		}
System.out.println(" ");
for (int i=0;i<=19;i++) {
	cuadrado[i]=numero[i]*numero[i];
	System.out.print(cuadrado[i]+" ");
	}
System.out.println(" ");
for (int i=0;i<=19;i++) {
	cubo[i]=cuadrado[i]*numero[i];	
	System.out.print(cubo[i]+" ");
	}
}
}
