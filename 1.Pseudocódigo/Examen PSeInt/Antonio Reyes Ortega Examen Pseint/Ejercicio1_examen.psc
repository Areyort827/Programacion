Algoritmo Ejercicio1
	Escribir "MENU DE OPCIONES"
	Escribir "1. Sumar dos numeros"
	Escribir "2. Restar dos numeros"
	Escribir "3. Multiplicar dos numeros"
	Escribir "4. Dividir dos numeros"
	Escribir "0. SALIR"
	
	Mientras final<>1 Hacer
		
		Escribir "Introduce una opcion:"
		leer opc
	Segun opc Hacer
		1:  
			Escribir "Introduce el primer numero:"
			leer n
			Escribir "Introduce el segundo numero:"
			leer m
			Escribir "Resultado:" n+m
		2:
			Escribir "Introduce el primer numero:"
			leer n
			Escribir "Introduce el segundo numero:"
			leer m
			Escribir "Resultado:" n-m
		3:
			Escribir "Introduce el primer numero:"
			leer n
			Escribir "Introduce el segundo numero:"
			leer m
			Escribir "Resultado:" n*m
		4:
			Escribir "Introduce el primer numero:"
			leer n
			Escribir "Introduce el segundo numero:"
			leer m
			Escribir "Resultado:" n/m
		0:
			final=1
			Escribir "Has cerrado el programa"
			
	FinSegun
FinMientras
FinAlgoritmo

