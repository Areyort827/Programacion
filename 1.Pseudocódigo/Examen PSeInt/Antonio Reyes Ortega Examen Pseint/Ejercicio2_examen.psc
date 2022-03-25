Algoritmo Ejercicio2
	Definir opc1, opc2, d Como Entero
	Definir n, m como real 
	final=1
	Mientras final=1 Hacer  //la variante final tiene como valor 1 y tendra como valor 0 y se cerrara el programa cuando se eliga la opcion 0
	Escribir "MENU PRINCIPAL"
	Escribir "- - - - - - - -"
    Escribir "1. Operaciones basicas"
	Escribir "2. Operaciones variadas"
	Escribir "0. SALIR"
	Escribir "Introduce una opcion:"
	leer opc1
	j=1
	   mientras j=1 Hacer
		

	segun opc1 Hacer
		
		1:
			Escribir "1. Sumar"
			Escribir "2. Restar"
			Escribir "3. Multiplicar"
			Escribir "4. Dividir"
			Escribir "0. REGRESAR"
			Escribir "Introduce una opcion"
			leer opc2
			Segun opc2 Hacer
				1:
					Escribir "Introduce primer numero"
					leer n
					Escribir "Introduce segundo numero"
					leer m
					Escribir "Resultado:" n+m
					
				2:
					Escribir "Introduce primer numero"
					leer n
					Escribir "Introduce segundo numero"
					leer m
					Escribir "Resultado:" n-m
				3:
					Escribir "Introduce primer numero"
					leer n
					Escribir "Introduce segundo numero"
					leer m
					Escribir "Resultado:" n*m
				4:
					Escribir "Introduce primer numero"
					leer n
					Escribir "Introduce segundo numero"
					leer m
					Escribir "Resultado:" n/m
				0:
					final=1
					j=0
			FinSegun
		2:
			Escribir "1. Numero y dia"
			Escribir "2. Suma de los primeros n numeros naturales"
			Escribir "3. Numero primo"
			Escribir "4. Invertir un numero de 4 cifras"
			Escribir "0. REGRESAR"
			Escribir "Introduce una opcion"
			leer opc2
			Segun opc2 Hacer
				1:
					Escribir "Convierte numero a dia"
					Escribir "Introduce el numero de dia"
					leer d
					segun d Hacer
						1:
							Escribir "Lunes"
						2:
							Escribir "Martes"
						3:
							Escribir "Miercoles"
						4:
							Escribir "Jueves"
						5:
							Escribir "Viernes"
						6:
							Escribir "Sabado"
						7:
							Escribir "Domingo"
					FinSegun
					
				2: 
					total=0
					Escribir "SUMA DE LOS PRIMEROS N NUMEROS"
					Escribir "Introduce numero n:"
					leer n
					para i=1 Hasta n
						total=total+i
					FinPara
					Escribir "La suma de los primeros n numeros es = " total					
				3:
					Escribir "NUMERO PRIMO"
					contador=0
					Escribir "Introduce un numero"
					leer n
					para i=1 Hasta n Hacer
						si n%i=0 Entonces
							contador=contador+1
						FinSi
					FinPara
					si contador=2 Entonces
						Escribir "El numero " n " es un numero primo"
					SiNo
						Escribir "El numero " n " no es un numero primo"
					FinSi
					
				4:
					Escribir " INVERTIR NUMERO DE 4 CIFRAS"
					Escribir "Introduce un numero de 4 cifras"
					leer n
					si n>9999 Entonces
						Escribir "Por favor, introduzca un numero de 4 cifras"
					FinSi
					si n<=9999 Entonces
					a=(n%10)     //El primer numero inverso es el resto de dividirlo entre 10
					b=trunc(n%100)  //El segundo numero inverso es el resto truncado de dividirlo entre 100
								  //y volver a dividirlo entre 10
					b=trunc(b/10)
					c=trunc(n%1000)    //El tercer numero inverso es el resto truncado de dividirlo entre 1000
					                    //y volver a dividirlo entre 100
					c=trunc(c/100)
					d=trunc(n/1000)   //El cuarto numero inverso es el resultado de truncar la division del numero entre 1000
					Escribir "El numero inverso es :" a b c d
					finsi
					
					
					
					
				0:
					final=1
					j=0
			FinSegun
		0:
			final=0
			j=0
	FinSegun

FinMientras
FinMientras
Escribir "Has cerrado el programa"

FinAlgoritmo
