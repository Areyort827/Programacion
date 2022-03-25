Algoritmo Busca_el_tesoro
	definir n,m como entero
	definir mina Como caracter
	Definir tesoro Como caracter
	dimension fan[5,4]
	minax=azar(5)+1
	minay=azar(4)+1
	tesorox=azar(5)+1
	tesoroy=azar(4)+1
	mina=fan[minax,minay]
	tesoro=fan[tesorox,tesoroy]
	Escribir "¡BUSCA EL TESORO!"
	Escribir "4|" fan[1,4],"  | ",fan[2,4]," | ",fan[3,4]," | ",fan[4,4]," | ",fan[5,4]," | "
	Escribir "3|" fan[1,3],"  | ",fan[2,3]," | ",fan[3,3]," | ",fan[4,3]," | ",fan[5,3]," | "
	Escribir "2|" fan[1,2],"  | ",fan[2,2]," | ",fan[3,2]," | ",fan[4,2]," | ",fan[5,2]," | "
	Escribir "1|" fan[1,1],"  | ",fan[2,1]," | ",fan[3,1]," | ",fan[4,1]," | ",fan[5,1]," | "
	Escribir "   1   2   3   4   5       "
	final=100
	para i=1 Hasta final  con paso 1 Hacer
		Escribir "¡BUSCA EL TESORO!"
		Escribir "4|" fan[1,4],"  | ",fan[2,4]," | ",fan[3,4]," | ",fan[4,4]," | ",fan[5,4]," | "
		Escribir "3|" fan[1,3],"  | ",fan[2,3]," | ",fan[3,3]," | ",fan[4,3]," | ",fan[5,3]," | "
		Escribir "2|" fan[1,2],"  | ",fan[2,2]," | ",fan[3,2]," | ",fan[4,2]," | ",fan[5,2]," | "
		Escribir "1|" fan[1,1],"  | ",fan[2,1]," | ",fan[3,1]," | ",fan[4,1]," | ",fan[5,1]," | "
		Escribir "   1   2   3   4   5       "
Escribir "Coordenada x: " 
leer n
Escribir "Coordenada y: "
leer m
Segun n Hacer
	minax:
		Segun m Hacer
			minay:
				fan[n,m]="*"
				Escribir "Lo siento, has pisado una mina"
				d=final-i
				i=i+d
				fan[tesorox,tesoroy]="$"
			De Otro Modo:
				fan[n,m]="X"
		Fin Segun
	tesorox:
		Segun m Hacer
			tesoroy:
				fan[n,m]="$" 
				Escribir "ENHORABUENA,HAS ENCONTRADO EL TESORO"
				v=final-i
				i=i+v
				fan[minax,minay]="*"
			De Otro Modo:
				fan[n,m]="X"
		Fin Segun
		
		
	De Otro Modo:
		fan[n,m]="X"
Fin Segun

Escribir "¡BUSCA EL TESORO!"
Escribir "4|" fan[1,4],"  | ",fan[2,4]," | ",fan[3,4]," | ",fan[4,4]," | ",fan[5,4]," | "
Escribir "3|" fan[1,3],"  | ",fan[2,3]," | ",fan[3,3]," | ",fan[4,3]," | ",fan[5,3]," | "
Escribir "2|" fan[1,2],"  | ",fan[2,2]," | ",fan[3,2]," | ",fan[4,2]," | ",fan[5,2]," | "
Escribir "1|" fan[1,1],"  | ",fan[2,1]," | ",fan[3,1]," | ",fan[4,1]," | ",fan[5,1]," | "
Escribir "   1   2   3   4   5       "




 fin para   
FinAlgoritmo
