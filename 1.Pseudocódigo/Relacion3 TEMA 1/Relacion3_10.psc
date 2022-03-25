Algoritmo Relacion3_10
	Definir jugador1 Como Caracter
	Escribir "Jugador1: Elige su jugada,PIEDRA,PAPEL O TIJERA"
	leer n
	Definir jugador2 Como Caracter
	Escribir "Jugador2: Elige su jugada,PIEDRA,PAPEL O TIJERA"
	leer m
	si n="piedra" y m="piedra" Entonces
		Escribir "EMPATE"
	SiNo
		si n="piedra" y m="papel" Entonces
			Escribir "Gana el segundo jugador"
		SiNo
			si n="piedra" y m="tijera" Entonces
				Escribir "Gana el primer jugador"
			SiNo
				si n="papel" y m="piedra" Entonces
					Escribir "Gana el primer jugador"
				SiNo
					si n="papel" y m="papel" Entonces
						Escribir "EMPATE"
					SiNo
						si n="papel" y m="tijera" Entonces
							Escribir "Gana el segundo jugador"
						SiNo
							si n="tijera" y m="piedra" Entonces
								Escribir "Gana el segundo jugador"
							SiNo
								si n="tijera" y m="papel" Entonces
									Escribir "Gana el primer jugador"
								SiNo
									si n="tijera" y m="tijera" Entonces
										Escribir "EMPATE"
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi

	
FinAlgoritmo
