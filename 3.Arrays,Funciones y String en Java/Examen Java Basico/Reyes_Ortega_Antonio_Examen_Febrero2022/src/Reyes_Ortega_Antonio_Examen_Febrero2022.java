import Metodos.Metodos;
import java.util.*;

public class Reyes_Ortega_Antonio_Examen_Febrero2022 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
int x1,x2,x3,o1,o2,o3;
int juego=1;
int partida=1;
String [] tablero = new String[9];  
System.out.println("¡Juguemos al tres en raya!");
for(int i=0;i<=8;i++) {
	tablero[i]="-";
}
boolean salida;
while(partida<=1) {
	juego=1;
while(juego<=3) {
for(int i=0;i<=8;i++) {
System.out.println("     "+tablero[i]+ "      "+tablero[i+1]+ "      "+tablero[i+2]);
	i=i+2; 
}
System.out.println("¡Tu turno!");
System.out.println(" ");
System.out.println("Elige donde quieres colocar tu ficha");
String n=sn.next();
System.out.println("MOVIMIENTO VALIDO");
boolean a0 = n.equalsIgnoreCase("ARRIBAIZQUIERDA");
boolean a1 = n.equalsIgnoreCase("ARRIBACENTRO");
boolean a2 = n.equalsIgnoreCase("ARRIBADERECHA");
boolean a3 = n.equalsIgnoreCase("CENTROIZQUIERDA");
boolean a4 = n.equalsIgnoreCase("CENTROCENTRO");
boolean a5 = n.equalsIgnoreCase("CENTRODERECHA");
boolean a6 = n.equalsIgnoreCase("ABAJOIZQUIERDA");
boolean a7 = n.equalsIgnoreCase("ABAJOCENTRO");
boolean a8 = n.equalsIgnoreCase("ABAJODERECHA");
if(a0==true) {
	tablero[0]="o";
}
if(a1==true) {
	tablero[1]="o";
}
if(a2==true) {
	tablero[2]="o";
}
if(a3==true) {
	tablero[3]="o";
}
if(a4==true) {
	tablero[4]="o";
}
if(a5==true) {
	tablero[5]="o";
}
if(a6==true) {
	tablero[6]="o";
}
if(a7==true) {
	tablero[7]="o";
}
if(a8==true) {
	tablero[8]="o";
}
for(int i=0;i<=8;i++) {
System.out.println("     "+tablero[i]+ "      "+tablero[i+1]+ "      "+tablero[i+2]);
	i=i+2; 
}
System.out.println("¡Turno de la maquina!");
int fichamaquina=(int)(Math.random()*9);
tablero[fichamaquina]="x";
System.out.println(" ");
System.out.println("MOVIMIENTRO VALIDO");
tablero[fichamaquina]="x";

juego=juego+1;
String linea1 = tablero[0].concat(tablero[1]).concat(tablero[2]);
String linea2 = tablero[3].concat(tablero[4]).concat(tablero[5]);
String linea3 = tablero[6].concat(tablero[7]).concat(tablero[8]);
String linea4 = tablero[0].concat(tablero[3]).concat(tablero[6]);
String linea5 = tablero[1].concat(tablero[4]).concat(tablero[7]);
String linea6 = tablero[2].concat(tablero[5]).concat(tablero[8]);
String linea7 = tablero[0].concat(tablero[4]).concat(tablero[8]);
String linea8 = tablero[2].concat(tablero[4]).concat(tablero[6]);
if(linea1=="o"+"o"+"o") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea2=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea3=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea4=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea5=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea6=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea7=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
if(linea8=="ooo") {
	System.out.println("Ganaste!");
	juego=3;
}
partida=5;
}
for(int i=0;i<=8;i++) {
System.out.println("     "+tablero[i]+ "      "+tablero[i+1]+ "      "+tablero[i+2]);
	i=i+2; 
}
System.out.println("¿Desea jugar de nuevo?(s/n)");
String s=sn.next();
if("s"==s) {
	partida=0;
	juego=1;
}else {
	partida=0;
}
}


}
}
