
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][]arr= new int[6][10];
     int columna = 0;
     int minimo = 0;
     int maximo = 0;
     int fila;
     int filam=0;
     int colm=0;
     int filamax=0;
     int colmax=0;
     int max=arr[0][0];
     System.out.print("\n      ");
     for(int columna1 = 0; columna1 < 10; columna1++) {
       System.out.print("   " + columna1 + "  ");
     }
     System.out.println();
     
     System.out.print("    ┌");
     for(int columna1 = 0; columna1 < 10; columna1++) {
       System.out.print("──────");
     }
     System.out.println("┐");
     for(int fila1 = 0; fila1 < 6; fila1++) {
         System.out.print("  " + fila1 + " │");
         for(int columna1 = 0; columna1 < 10; columna1++) {
           arr[fila1][columna1] = (int)(Math.random() * 1001);
           System.out.printf("%5d ", arr[fila1][columna1]);
           
         }  
         System.out.print("");
         if (arr[fila1][columna] < minimo) {
             minimo = arr[fila1][columna];
             filam = fila1;
             colm = columna;
           }
           
           // Calcula el máximo y guarda sus coordenadas
           if (arr[fila1][columna] > maximo) {
             maximo = arr[fila1][columna];
             filamax = fila1;
             colmax = columna;
           }
         }
         System.out.println("│");
       
     
       for(int columna1 = 0; columna1 < 10; columna1++) {
         System.out.print("──────");
       }

       System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filamax + ", columna " + colmax);
       System.out.println("El mínimo es " + minimo + " y está en la fila " + filam + ", columna " + colm);
     }
	}

	
