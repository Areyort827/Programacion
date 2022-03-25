package Ej3;

public class Uso_contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Contador Contador1=new Contador();
     
     Contador1.setContador(25);
     Contador1.incrementar();
     System.out.println("El valor del contador es "+Contador1.getContador());
     Contador1.incrementar();
     Contador1.incrementar();
     System.out.println("El valor del contador es "+Contador1.getContador());
     Contador1.decrementar();
     System.out.println("El valor del contador es "+Contador1.getContador()); 
     
     Contador Contador2=new Contador();
     
     Contador2.setContador(10);
     Contador2.incrementar();
     System.out.println("El valor del contador es "+Contador2.getContador()); 
     Contador2.decrementar();
     System.out.println("El valor del contador es "+Contador2.getContador()); 
     
    Contador Contador3=new Contador(Contador2);
    System.out.println("El valor del contador es "+Contador3.getContador()); 
	}

}
