import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		  Scanner sn=new Scanner(System.in);
          String marca;
          String matricula = null;
          int num_km = 0;
          String fecha_matriculacion = null;
          String descripcion = null;
          double precio = 0;
          String nombre_prop = null;
          String dni_prop = null;
          int anios=0;
          
		  int opcion;
		  
		 
		  
		  
		  do {
			  
			  //Le mostramos el menu al usuario
			  System.out.println("\n1.Nuevo Vehiculo");
			  System.out.println("2.Ver matricula");
			  System.out.println("3.Ver numero de kilometros");
			  System.out.println("4.Actualizar kilometros");
			  System.out.println("5.Ver años de antigüedad");
			  System.out.println("6.Mostrar propietario");
			  System.out.println("7.Mostrar descripcion");
			  System.out.println("8.Mostrar precio");
			  System.out.println("9.Salir");
			  
			  
			  System.out.println("Eliga una opcion: ");
			  opcion=sn.nextInt();		
			  
			  switch (opcion) {
			  case 1:
				  System.out.println("\nHas elegio: ¡Nuevo vehiculo!");
				  System.out.println("\n===========");
				  System.out.println("Por favor, introduzca los datos del vehiculo.");
				  System.out.println("Marca: ");
				  marca=sn.next();
				  System.out.println("Matricula: ");
				  do {
					  matricula=sn.next();
					  if (matriculaCorrecta(matricula)==false) {
						  System.out.println("Por favor, introduzca una matricula correcta");
					  }
				  } while (matriculaCorrecta(matricula) == false);
				  
				  System.out.println("Numero de kilometros: ");
				  num_km=sn.nextInt();
				  System.out.println("Fecha de matriculacion: ");
				  fecha_matriculacion=sn.next();  
				  System.out.println("Descripcion: ");
				  descripcion=sn.next();
				  System.out.println("Precio: ");
				  precio=sn.nextDouble();
				  System.out.println("Nombre del propietario: ");
				  nombre_prop=sn.next();
				  System.out.println("Dni del propietario: ");
				 
				  do {
					  dni_prop=sn.next();
					  if (dniCorrecto(dni_prop)==false) {
						  System.out.println("Por favor, introduzca un dni correcto");
					  }
				  } while (dniCorrecto(dni_prop) == false);

				  System.out.println("Años del vehiculo: ");
				  anios=sn.nextInt();
				  
	 Vehiculos v1= new Vehiculos(marca,matricula,num_km,fecha_matriculacion,descripcion,precio,nombre_prop,dni_prop);
			     break;
			  
			  
			  case 2:
				  System.out.println("\nHas elegido: ¡Ver matricula!");
				  System.out.println("===========\n");
				  if(matricula==null) {
					  System.out.println("No hay datos guardados");
				  } else {
				  System.out.println("La matricula es: "+ matricula);
				  }
				  
				  break;
				  
			  case 3:
				  System.out.println("\nHas elegido: ¡Ver numero de kilometros!");
				  System.out.println("===========\n");
				  if(num_km==0) {
					  System.out.println("No hay datos guardados");
				  } else {
				  System.out.println("El numero total de kilometros del vehiculo es: "+ num_km);
				  }
				  
				  break;
				  
			  case 4:
				  int kmplus;
				  System.out.println("\nHas elegido: ¡Actualizar kilometros!");
				  System.out.println("===========\n");
				  System.out.println("Añade la cantidad de kilometros realizados: ");
				  kmplus=sn.nextInt();
				  num_km=num_km+kmplus;
				  System.out.println("El numero total de kilometros del vehiculo es: "+ num_km);
			 
				  break;
				  
			  case 5:
				  System.out.println("\nHas elegido: ¡Ver años de antigüedad!");
				  System.out.println("===========\n");
				  if (anios==0) {
					  System.out.println("No hay datos guardados" );
				  }else {
				  System.out.println("El numero total de años del vehiculo es: "+ anios );
				  }
			      break;
			      
			  case 6:
				  System.out.println("\nHas elegido: ¡Mostrar propietario!");
				  System.out.println("===========\n");
				  if (nombre_prop==null) {
					  System.out.println("No hay datos guardados" );
				  }else {
				  System.out.println("El propietario del vehiculo es: "+ nombre_prop+"\nCon dni: "+dni_prop );
				  }
				  
				  break;
				  
			  case 7:
				  System.out.println("\nHas elegido: ¡Mostrar descripcion!");
				  System.out.println("===========\n");
				  if (descripcion==null) {
					  System.out.println("No hay datos guardados" );
				  }else {
				  System.out.println("La descripcion del vehiculo cuya matricula es: "+matricula+" con "+num_km+" kilometros realizados"+  " es: \n"+descripcion );
				  }
				  break;
				  
			  case 8:
				  System.out.println("\nHas elegido: ¡Mostrar precio!");
				  System.out.println("===========\n");
				  if (precio==0) {
					  System.out.println("No hay datos guardados" );
				  }else {
				  System.out.println("El precio del vehiculo es: "+precio );
				  }
				  
			  }
		  }while (opcion!=9);
		  System.out.println("Has cerrado el programa");
	}
	


	public static boolean dniCorrecto(String dni_prop) {
      if ( dni_prop.length() == 9) {
	      return true;
      }else {
	      return false;
}

	}
	
	public static boolean matriculaCorrecta(String matricula) {
		if (matricula.length()== 8) {
			return true;
		} else {
		return false;
		}
			
	}


}