import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sn= new Scanner(System.in);
		 int j=1;
		 int [] med =new int [12];
		 for (int i=0;i<=11;i++) {
		 System.out.println("Escribe la temepatura media del mes "+j+" del año 2021: ");
		 int n=sn.nextInt();
		 med[i]=n;
		 j++;
		 }
		 System.out.println("DIAGRAMA TEMPERATURA MEDIA");
			for (int m=0;m<=11;m++) {
				do {
					 System.out.print("*");
					 med[m]--;
					
				} while(med[m]>0); System.out.println(" ");
			}
		 
	}

}
