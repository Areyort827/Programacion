Algoritmo Ejercicio10_2
	Escribir "Introduce un numero"
	Leer n
	Escribir "La raiz cuadrada de " n " es " rc(n)
	Repetir
		si n<0 Entonces
			Escribir "Aviso,Solo introducir numeros positivos"
		FinSi
		Leer n
		Escribir "La raiz cuadrada de " n " es " rc(n)
	Hasta Que n=0
	
FinAlgoritmo
