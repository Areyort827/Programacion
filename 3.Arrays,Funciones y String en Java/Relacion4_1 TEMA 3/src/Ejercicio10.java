import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numero= new int[20];
		int [] numeropar= new int[20];
		int [] numeroimpar= new int[20];
		int par=0;
		int impar=0;
		int j=0;
		int f=19;
		
		Scanner sn= new Scanner(System.in);
     for (int i=0;i<=19;i++) {
    		numero[i]=(int)(Math.random()*100+1);
    		System.out.print(numero[i]+" ");
    		if (numero[i]%2==0) {
    			numeropar[j]=numero[i];
    			par++;
    			
    		}	else {
    			numeroimpar[f]=numero[i];
    			impar++;
    		       ;
    		}
    	
     }
     System.out.println(" ");
     for (int l=0;l<=19;l++) {
    	 System.out.print(numeropar[l]+" ");
     }
	}
	}


