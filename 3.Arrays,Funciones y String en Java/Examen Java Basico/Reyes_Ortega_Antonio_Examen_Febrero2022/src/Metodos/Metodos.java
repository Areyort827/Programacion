package Metodos;
import java.util.*;
public class Metodos {
	
	

	public static int imprimeTablero(int tablero) {
	int[] tablero1=new int[8];
		int x1=1;
		int x2=1;
		int x3=1;
		int o1=2;
		int o2=2;
		int o3=2;
		int c=1;
		int c2=2;
		String tableroString=Integer.toString(0);
	for(int i=0;i==8;i++) {
		tablero1[i]=0;
		tablero1[i]=tablero;
		if(tablero1[i]==0) {
		tableroString="-";
		System.out.println("     "+tablero1[i]+ "      "+tablero1[i+c]+ "      "+tablero1[i+c2]);
		c=c+2;
		c2=c2+2;
		}
	}
	return tablero;
		
	}
	public static String conviertePosicionMovimiento(String x) {
	     int i=Integer.parseInt(null);
	     if (x=="ARRIBA IZQUIERDA") {
			String[] tablero = null;
			tablero[0]="x";
	     }
		return x;
		
	}

}

