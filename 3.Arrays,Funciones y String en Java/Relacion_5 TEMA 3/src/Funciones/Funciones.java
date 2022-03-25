package Funciones;

public class Funciones {
	  public static long voltea(long x) {
		    if (x < 0) {
		      return -voltea(-x);
		    }

		    long volteado = 0;

		    while(x > 0) {
		      volteado = (volteado * 10) + (x % 10);
		      x = x / 10;
		    }

		    return volteado;
		  }
	

	  //Lo mismo pero para enteros
	  
		  public static int voltea(int x) {
		    return (int)voltea((long)x);
		  }
	 public static boolean esCapicua(long x) {
		    return x == voltea(x);
		  }
	 public static boolean esCapicua(int x) {
		    return esCapicua((long)x);
		  }
		  public static boolean esPrimo(int x) {
			    
			    for (int i = 2; i < x; i++) {
			      if ((x % i) == 0) {
			        return false;
			      }
			    }
			    
			    return true;
			  }
		  public static int siguientePrimo(int x) {
			    while (!esPrimo(++x)) {};
			    return x;
			  }
		  public static int potencia(int b,int e) {
				int r=1;
				if(b > 0 && e==0) {
				return r;
				}
				else if(b==0 && e>=1){
		            return 0;
		        }
		        else{
		            for(int i = 1; i<= e; i++){
		                r = r*b;
		            }
		            return r;
		        }
		    }
		
				
				
		  public static int digitos(int x) {
			    
			    if (x == 0) {
			      return 1;
			    } else {
			      int n = 0;
			      while (x > 0) {
			        x = x / 10;
			        n++;
			      }
			      return n;
			    }
			  }
		  public static int digitoN(long x, int n) {
			 
			    while (n-- > 0) {
			      x = x / 10;
			    }

			    return (int)x % 10;
			  }
		  public static int posiciondedigito(long x, int n) {
		
            int i;
            for (i=0;i<= digitos(x) && (digitoN(x,i)!=n);i++){
            if (i==digitos(x)) {
            	return -1;
            } else {
            	return i;
            }
           }
			return i;
			    
			  }
		  public static int digitos(long x) {
			    if (x < 0) {
			      x = -x;
			    }

			    if (x == 0) {
			      return 1;
			    } else {
			      int n = 0;
			      while (x > 0) {
			        x = x / 10; // se le quita un dígito a x
			        n++; // incrementa la cuenta de dígitos
			      }
			      return n;
			    }
			  }
}

