//6.1: Crea un programa que pida al usuario una contrase�a, 
//de forma repetitiva mientras que no introduzca "1234". 
//Cuando finalmente escriba la contrase�a correcta,
//se le dir� "Bienvenido" y terminar� el programa.
Algoritmo Ejercicio6_1
	Definir contra Como Entero
	
	Escribir "Introduce una contrase�a"
	Leer contra
	Mientras contra<>1234 Hacer
		Escribir "Contrase�a incorrecta, introduzca nueva contrase�a"
		leer contra
	Fin Mientras
	Escribir "Bienvenido "
	
FinAlgoritmo
