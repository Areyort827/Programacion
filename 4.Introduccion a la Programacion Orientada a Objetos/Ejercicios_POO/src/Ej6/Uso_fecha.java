package Ej6;

import java.util.Scanner;

public class Uso_fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,a�o;
		
          Scanner sn= new Scanner(System.in);
          
         System.out.print("Introduce una fecha");
         System.out.println("\nIntroduce un dia: ");
           dia=sn.nextInt();
         System.out.println("\nIntroduce un mes: ");
           mes=sn.nextInt();
         System.out.println("\nIntroduce un a�o");
           a�o=sn.nextInt();
	
           Fecha fecha =new Fecha(dia, mes, a�o);
	if(fecha.fechaCorrecta()) {
		System.out.println(fecha.toString());
	}
	System.out.println("Los 10 dias siguientes son: ");
	for (int i=0;i<=9;i++) {
		fecha.diaSiguiente();
		System.out.print("\n"+fecha.toString());
	}
	}
}
