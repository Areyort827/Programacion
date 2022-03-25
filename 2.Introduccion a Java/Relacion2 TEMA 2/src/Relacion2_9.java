import java.util.*;
public class Relacion2_9
{
	public static void main(String[] ARGS) {
		  Scanner sc = new Scanner(System.in);
	        int n, cifras;
	        System.out.print("Introduce un número entero: ");
	        n = sc.nextInt();
	        cifras= 0; 
	        do{
	        	 n = n/10; 
	           
	            cifras++;   
	                   
               
	        }while(n!=0);                    
	            System.out.println(" El numero tiene " +cifras+" cifras");
	}
	           
	          
	             
	    }
	
