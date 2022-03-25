package Ej5;

public class Uso_fracciones {

	public static void main(String[] args) {
		Fracciones f1=new Fracciones();
		Fracciones f2=new Fracciones();
		Fracciones f3=new Fracciones();
		Fracciones f4=new Fracciones();
		
		Fracciones suma = f1.sumar(f2);
		Fracciones resta = f1.restar(f3);
		Fracciones producto = f1.multiplicar(f4);
		Fracciones cociente = f1.dividir(f2);
		
		System.out.println(f1+ " + "+ f2+" = "+ suma);
		System.out.println(f1+ " - "+ f3+" = "+ resta);
		System.out.println(f1+ " + "+ f4+" = "+ producto);
		System.out.println(f1+ " / "+ f2+" = "+ cociente);
	}

}
