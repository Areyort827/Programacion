import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sn=new Scanner(System.in);
		Vehiculos [] vehiculos= new Vehiculos [50];
         int opcion;
         String marca = null;
         String matricula = null;
         int num_km = 0;
         String fecha_matriculacion = null;
         String descripcion = null;
         double precio = 0;
         String nombre_prop = null;
         String dni_prop = null;
         int vh=0;
         
      
       System.out.println(vehiculos[1]);
         
 
         
   	
         do {
        	  System.out.println("\n1.Nuevo vehiculo");
        	  System.out.println("2.Listar vehiculos");
        	  System.out.println("3.Buscar vehiculos");
        	  System.out.println("4.Modificar kms de vehiculo");
        	  System.out.println("5.Salir");
        	 System.out.println("Eliga una opcion: ");
			  opcion=sn.nextInt();	
			  //Le mostramos el menu al usuario
			
			 
			  switch (opcion) {
			  case 1:
				  System.out.println("\nHas elegido: ¡Nuevo vehiculo!");
				  System.out.println("===========\n");
				  System.out.println("Por favor, introduzca los datos del vehiculo.");
				  System.out.println("Marca: ");
				  marca = sn.next();			
				  System.out.println("Matricula: ");
				  matricula=sn.next();
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
				  dni_prop=sn.next();
				 
				  Vehiculos v1= new Vehiculos(marca,matricula,num_km,fecha_matriculacion,descripcion,precio,nombre_prop,dni_prop);
				 vehiculos[vh]=v1;
				 vh++;
				  
				  break;
				  
			  case 2:
				  System.out.println("\nHas elegido: ¡Listar vehiculos!");
				  System.out.println("===========\n");  
				  int cont=0;
				  for(int i = 0; i < 50; i++) {
					if (vehiculos[i]!=null)    { 
						  System.out.println("Vehiculo numero: "+i+1);    //solo mostrara los vehiculos que estan registrados en el consecionario
			             System.out.println(vehiculos[i]);
			             System.out.println("");
					   cont++;
			           }
				  }
				  if (cont == 0) {
					  System.out.println("No existen vehiculos en el concesionario");
				  }
				  break;
				  
			  case 3:
				
				  String matricula2;
				  System.out.println("\nHas elegido: ¡Buscar vehiulos!");
				  System.out.println("===========\n");  
				  System.out.println("Introduce la matricula del vehiculo");
				  matricula2=sn.next();
				  if (matricula2 == null) {
					  System.out.println("No existen vehiculos en el concesionario");
				  }
				  for (int i=0;i < 50;i++) {
				  int resul = matricula.compareTo(matricula2);
				  
				  if (resul==0) {
					
					  System.out.println(vehiculos[i]);
					  
				  }
				 }
				  
				  
				  break;
				  
			  case 4:
				  System.out.println("\nHas elegido: ¡Modificar kms de vehiculo!");
				  System.out.println("===========\n");  
				  System.out.println("Introduce la matricula del vehiculo");
				  matricula2=sn.next();
				  System.out.println("Introduce los nuevos kilometros realizados del vehiculo");
				  int num_km2=sn.nextInt();
				  if (matricula2 == null) {
					  System.out.println("No existe este vehiculo en el concesionario");
				  }
				  for (int i=0;i < 50;i++) {
					  int resul = matricula.compareTo(matricula2);
					  
					  if (resul==0) {
						  num_km=num_km+num_km2;
					  }
				  
			  }
			  
			  }
				  
			  
         }while(opcion!=5);
         System.out.println("Has cerrado el programa");
	}

	

	 
	
}
