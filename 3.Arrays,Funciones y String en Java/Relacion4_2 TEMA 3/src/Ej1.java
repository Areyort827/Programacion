
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int j=1;
		int [][] arr = new int [3][6];
		for (int c=0;c<=5;c++) {
		    for (int f=0;f<=2;f++) {
    			arr [f][c]= j;
    			j++;
    		}
    	}
		System.out.println("Array num  Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5");
		 for (int f=0;f<=2;f++) {
		for (int c=0;c<=5;c++) {
    	     
              System.out.print("   " +arr[f][c]+"    |   ");
    		}
    	     System.out.println(" ");
    			
    	}
    }
	}


