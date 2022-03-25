Algoritmo Relacion5_6
	n<-0
	c=1
	Para m<-0 Hasta 20 Con Paso 1 paso Hacer
		si m%2==0 Entonces
			n<-m+n
		SiNo
			c=m*c
		FinSi
	Fin Para
	Escribir "La suma de los numeros pares desde el 1 al 20 es " n
	
	Escribir "La multiplicacion de los numeros impares desde el 1 hasta el 20 es " c
	
FinAlgoritmo

