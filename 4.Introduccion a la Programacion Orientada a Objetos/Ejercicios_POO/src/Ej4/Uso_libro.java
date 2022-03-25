package Ej4;

import java.util.Scanner;

public class Uso_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo, autor;
		int numero_ejemplares, numero_ejemplares_prestados;
		
		Scanner sn=new Scanner(System.in);
      Libro libro1=new Libro("El quijote","Cervantes",1,0);
    	Libro libro2=new Libro(); 
    	System.out.println("Introduce los datos del libro 2");
    	System.out.println("Introduce el titulo del libro");
         titulo = sn.nextLine();
     	System.out.println("Introduce el autor del libro");
     	 autor = sn.nextLine();
     	System.out.println("Introduce el numero de ejemplares del libro");
     	 numero_ejemplares= sn.nextInt();
    	System.out.println("Introduce el numero de ejemplares prestados del libro");
     	numero_ejemplares_prestados= sn.nextInt();
     	libro2.setTitulo(titulo);
     	libro2.setAutor(autor);
     	libro2.setNumeroEjemplares(numero_ejemplares);
     	libro2.setNumeroEjemplaresPrestados(numero_ejemplares_prestados);
     	System.out.println(libro2);
     	System.out.println("Los datos del libro 1 son :");
     	System.out.println(libro1);
     	
     	if(libro1.prestamo()) {
			System.out.println("El libro 1 ha sido prestado con éxito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el préstamo");
		}
     	if(libro1.devolucion()) {
			System.out.println("El libro 1 ha sido devuelto con éxito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar la devolucion");
		}
     	libro1.prestamo();
     	if(libro1.prestamo()) {
     		System.out.println("El libro 1 ha sido prestado con éxito");
     	}else{
		System.out.println("No se ha podido realizar el préstamo");
	}
	}
}


