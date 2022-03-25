package poo;

import java.util.Scanner;

public class Metodos_cuenta {

	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		Cuenta cuenta1=new Cuenta();
		
		System.out.println("Introduce el nombre de la cuenta");
		String nombre=n.next();
		cuenta1.setNombre(nombre);
		System.out.println("Introduce el numero de la cuenta");
		String numero=n.next();
		cuenta1.setNumeroCuenta(numero);
		System.out.println("Introduce el tipo de interes de la cuenta");
		double interes=n.nextDouble();
		cuenta1.setInteres(interes);
		System.out.println("Introduce la cantidad de saldo de la cuenta");
		double saldo=n.nextDouble();
		cuenta1.setSaldo(saldo);
		
		System.out.println("El nombre de la cuenta es: "+cuenta1.getNombre());
		System.out.println("El numero de la cuenta es: "+cuenta1.getNumeroCuenta());
		System.out.println("El interes de la cuenta es: "+cuenta1.getInteres());
		System.out.println("El saldo de la cuenta es: "+cuenta1.getSaldo());
	}

}
