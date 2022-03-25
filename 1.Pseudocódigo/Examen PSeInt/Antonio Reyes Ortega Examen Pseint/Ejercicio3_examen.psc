Algoritmo Ejercicio3
	Escribir "Introduce una frase"
	leer f
	f=Minusculas(f)   //pasamos a Minusculas la frase 
	para i=1 Hasta Longitud(f) Hacer
		si Subcadena(f,i,i)=" " Entonces
			fra=fra
		SiNo
			fra = fra + Subcadena(f,i,i)    //borramos los espacios de la frase ya que no se tienen en cuenta
		FinSi
	FinPara
	para i=Longitud(f) Hasta 1 Hacer  //Escribimos la frase al reves sin tener en cuenta los espacios
		si Subcadena(f,i,i)=" " Entonces
			rev=rev
		SiNo
			rev = rev + Subcadena(f,i,i)
		FinSi
		
		
	FinPara
	si fra = rev Entonces
		Escribir "La frase es palindroma"
	SiNo
		Escribir "La frase no es palindroma" 
	FinSi
	
	
FinAlgoritmo
