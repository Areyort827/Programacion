Algoritmo Relacion4_3
	Definir t1 Como Caracter
	Definir dado1 Como Entero
	Definir t2 Como Caracter
	Definir dado2 Como entero
	Escribir "Introduce el numero de tu primera tirada"
	leer t1
	Segun t1 Hacer
		"uno":
			dado1=1
		"dos":
			dado1=2
		"tres":
			dado1=3
		"cuatro":
			dado1=4
		"cinco":
			dado1=5
		"seis":
			dado1=6
		De Otro Modo:
			Escribir "ERROR"
	Fin Segun
	Escribir "Introduce el numero de tu segunda tirada"
	leer t2
	segun t2 hacer
		"uno":
			dado2=1
		"dos":
			dado2=2
		"tres":
			dado2=3
		"cuatro":
			dado2=4
		"cinco":
			dado2=5
		"seis":
			dado2=6
		De Otro Modo:
			Escribir "ERROR"
			
		
	FinSegun
	Escribir "El total de su tirada es " dado1+dado2
	
FinAlgoritmo
