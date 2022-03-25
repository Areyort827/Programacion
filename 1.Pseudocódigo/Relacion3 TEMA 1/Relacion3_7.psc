Algoritmo Relacion3_7
	definir n Como Real
	Escribir "Introduce su nota"
	leer n
	si n>=0 y n<5 Entonces
		Escribir "Su nota es insuficiente"
	SiNo
		si n>=5 y n<6 Entonces
			Escribir "Su nota es de suficiente"
		SiNo
			si n>=6 y n<7 Entonces
				Escribir "Su nota es de bien"
			SiNo
				si n>=7 y n<9 Entonces
					Escribir "Su nota es de notable"
				SiNo
					si n>=9 y n<=10 Entonces
						Escribir "Su nota es de sobresaliente"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
