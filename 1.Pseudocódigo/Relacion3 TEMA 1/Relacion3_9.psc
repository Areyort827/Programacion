Algoritmo Relacion3_9
	Escribir "Introduce un numero"
	leer n
	Escribir "Introduce otro numero"
	Leer m
	Escribir "Introduce otro numero"
	Leer c
	si n+m=c Entonces
		Escribir "La suma del primer numero con el segundo es igual al tercer numero"
	sino 
		si m+c=n Entonces
			Escribir "La suma del segundo numero con el tercero es igual al primer numero"
		SiNo
			si n+c=m Entonces
				Escribir "La suma del primer numero con el tercero es igual al segundo numero"
			SiNo
				Escribir "Ninguna suma da igual a uno de estos numeros"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
