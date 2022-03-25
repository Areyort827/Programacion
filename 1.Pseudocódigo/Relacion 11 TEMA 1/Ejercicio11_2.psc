Algoritmo Ejercicio11_2
	Definir nombre como cadena
	Escribir "Introduce tu nombre"
	leer nombre
	x=Longitud(nombre)
	para i=1 Hasta x con paso 1 Hacer
	    p=Subcadena(nombre,i,i)
	si i%2=0 Entonces
		Escribir Sin Saltar Mayusculas(p)
	FinSi
	si i%2<>0 Entonces
		Escribir Sin Saltar Minusculas(p)
	FinSi
FinPara

	
FinAlgoritmo
