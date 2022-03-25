Algoritmo Ejercicio11_3
	Definir nombre como caracter
	Definir contador_vocales como numerico
	Escribir "Dime tu nombre"
	Leer nombre
	nombre<-minusculas(nombre) 
	contador_vocales <- 0
	
	para i <- 1 hasta (Longitud(nombre)) hacer
		
		si(subcadena(nombre,i,i)=="a" o subcadena(nombre,i,i)=="e" o subcadena(nombre,i,i)=="i" o subcadena(nombre,i,i)=="o" o subcadena(nombre,i,i)=="u") entonces
			
			contador_vocales <- contador_vocales + 1
		FinSi
	FinPara
	
	
	Escribir "Tu nombre tiene ", contador_vocales, " vocales"
FinAlgoritmo
