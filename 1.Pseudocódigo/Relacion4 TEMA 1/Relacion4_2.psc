Algoritmo Relacion4_2
	Escribir "Introduce un numero"
	leer n
	Escribir "Introduce otro numero"
	leer m
	Escribir "Elige una opcion"
	Definir op como cadena
	Escribir "A.Sumar los números"
	Escribir "B.Restar los números"
	Escribir "C.Multiplicar los numeros"
	Escribir "D.Dividir los números"
	leer op
	Segun op Hacer
		"A":
			Escribir n+m
		"B":
			Escribir n-m
		"C":
			Escribir N*M
			
		"D":
			Escribir N/M
	Fin Segun
FinAlgoritmo
