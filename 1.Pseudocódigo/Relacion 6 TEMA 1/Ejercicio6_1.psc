//6.1: Crea un programa que pida al usuario una contraseña, 
//de forma repetitiva mientras que no introduzca "1234". 
//Cuando finalmente escriba la contraseña correcta,
//se le dirá "Bienvenido" y terminará el programa.
Algoritmo Ejercicio6_1
	Definir contra Como Entero
	
	Escribir "Introduce una contraseña"
	Leer contra
	Mientras contra<>1234 Hacer
		Escribir "Contraseña incorrecta, introduzca nueva contraseña"
		leer contra
	Fin Mientras
	Escribir "Bienvenido "
	
FinAlgoritmo
