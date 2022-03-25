Algoritmo Ejerciciosadicionales_1

	Escribir "Introduce un total de segundos"
	leer s
	
	h=trunc(s/3600)
	res=s%3600
    m= res/60
	res=res%60
    s=res
	
	
	Escribir  "El resultado es de " trunc(h) " horas, " trunc(m) " minutos y "  s  " segundos"

FinAlgoritmo
