Algoritmo EjerciciosAdicionales_6
	Definir n,c,p,d,r Como Entero
	Escribir "Introduce un numero de tres cifras"
	leer n
	c=(n-(n%100))/100
	p=n%100
	d=(p-(p%10))/10
	u=p%10
	Escribir "El numero tiene " c " centenas," d " decenas y " u " unidades"
FinAlgoritmo
