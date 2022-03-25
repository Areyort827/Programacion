Algoritmo Relacion3_8
	Escribir "Introduce la base del triangulo"
	leer n
	Escribir "Introduce la altura del triangulo"
	leer m
	Escribir "el area del triangulo es " n*m/2
	Escribir "Introduce el radio del circulo"
	leer r
	Escribir "El area del circulo es " r^2*pi
	si n*m/2> r^2*pi Entonces
		Escribir "El area del triangulo es mayor que el del circulo"
	SiNo
		Escribir "El area del circulo es mayor que el del triangulo"
	FinSi
FinAlgoritmo
