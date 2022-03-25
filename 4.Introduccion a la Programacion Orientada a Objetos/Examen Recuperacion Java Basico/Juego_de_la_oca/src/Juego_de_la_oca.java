import java.util.Scanner;

public class Juego_de_la_oca {

	public static void main(String[] args) {
		
		int TAMCIRCUITO=11;
		int fichaJ1 = 0;
		int fichaJ2 = 0;
		int minDado,maxDado;
		int tirada1 = 0;
		int tirada2 = 0;
		String seguir;
		double tirada=tirada1+tirada2;
		String nomJ1,nomJ2;
	  Scanner sn = new Scanner(System.in);
		
	 
		//Realizamos el menu del juego
		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cual es el número mínimo del dado?");
		   minDado = sn.nextInt();
		System.out.println("¿Cual es el número máximo del dado?");
		    maxDado = sn.nextInt();
		System.out.println("¿Cual es el nombre del jugador 1?");
		    nomJ1 = sn.next();
		System.out.println("¿Cual es el nombre del jugador 2?");
		    nomJ2 = sn.next();		
		System.out.println("\n¡COMENCEMOS A JUGAR!");
		pintaPista(fichaJ1, fichaJ2);
		
		System.out.println("Pulsa cualquier tecla para la siguiente ronda");
		
		seguir = sn.nextLine();
	    
		do {
		System.out.println("\nTurno para el jugador 1 "+nomJ1);
		tirada1= tiraDados(tirada1,tirada2);
		tirada2= tiraDados(tirada1,tirada2);
		System.out.println("Ha sacado un "+tirada1+" en la primera tirada");
		System.out.println("Ha sacado un "+tirada2+" en la primera tirada");
		if(sumaDeNumerosEsPrimo(tirada1,tirada2)) {
			System.out.println("     ¡TIRADA VÁLIDA!");
			fichaJ1 = fichaJ1+tirada1+tirada2;
			
		} else {
			System.out.println("     ¡TIRADA NO VÁLIDA!");
			System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
		}
		
		pintaPista(fichaJ1, fichaJ2);
		System.out.println("");
		imprimeComoVaLaCarrera(nomJ1,nomJ2,fichaJ1,fichaJ2);
	
		
		System.out.println("\n\nTurno para el jugador 2 "+nomJ2);
		tirada1= tiraDados(tirada1,tirada2);
		tirada2= tiraDados(tirada1,tirada2);
		System.out.println("Ha sacado un "+tirada1+" en la primera tirada");
		System.out.println("Ha sacado un "+tirada2+" en la primera tirada");   //analisamos si es primo
		if(sumaDeNumerosEsPrimo(tirada1,tirada2)) {
			System.out.println("     ¡TIRADA VÁLIDA!");
			fichaJ2 = fichaJ2+tirada1+tirada2;
		} else {
			System.out.println("     ¡TIRADA NO VÁLIDA!");
			System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
		}
		pintaPista(fichaJ1, fichaJ2);
		System.out.println("");
		imprimeComoVaLaCarrera(nomJ1,nomJ2,fichaJ1,fichaJ2);
		System.out.println("Pulse cualquier tecla para la siguiente ronda");
		seguir = sn.nextLine();
		}while(fichaJ1<11 && fichaJ2<11);
		
	    
	    	if (fichaJ1 >=11 ) {
	    		System.out.println("Jugador Ganador: "+nomJ1);
	    	} else {
	    		System.out.println("Jugador Ganador: "+nomJ2);
	    	}

	}
	
	
	public static int tiraDados(int minDado,int maxDado) {
		 int tirada=(int)(Math.random()*((5-1)+2));                     //No he podido insertar el minimo y el maximo del dado por lo que le he dado un valor por defecto comprendido entre 2 y 5
		return tirada;
		
		
	}
	
	public static void pintaPista(int fichaJ1,int fichaJ2) {
		String j1 = "J1";
		String j2 = "J2";
		for (int i=1;i<=11;i++) {
			System.out.print("   "+i);
		}
	     System.out.println("\n"+j1);
	     System.out.println(j2); 
	     System.out.println("Puntuacion del jugador 1: "+fichaJ1);       //no he podido hacer mover las fichas por lo que he decidido poner la puntuacion de cada jugador bajo el tablero
	     System.out.println("Puntuacion del jugador 2: "+fichaJ2);
	     
		} 

	
	public static boolean sumaDeNumerosEsPrimo(int tirada1,int tirada2) {
        boolean primo=false;
		int cont=0;
		double tirada=tirada1+tirada2;
		for (int i=1; i<= tirada; i++) {
			  if((tirada%i) == 0) {
	           cont++;
		  } else if (tirada == 2) {
			  primo=false;
		  }
		 }
		if (cont == 2) {
			primo=true;
		} else {
			primo=false;
		}
		return primo;
}
	
	public static void imprimeComoVaLaCarrera(String nomJ1,String nomJ2,int fichaJ1,int fichaJ2) {
		if(fichaJ1<fichaJ2) {
			System.out.println("Va ganando el jugador "+nomJ2);
		}else if(fichaJ1>fichaJ2) {
			System.out.println("Va ganando el jugador "+nomJ1);
		}else {
			System.out.println("¡Van empatados!");
		}
	}
	
	public static void EsGanador(String nomJ1,String nomJ2,int fichaJ1,int fichaJ2) {
		if (fichaJ1 >= 11) {
			System.out.println(nomJ1);
			String ganador=nomJ1;
		}else if (fichaJ2 >= 11) {
			System.out.println(nomJ2);
			String ganador=nomJ2;
		}else {
			System.out.println("");
		}
	}
}
