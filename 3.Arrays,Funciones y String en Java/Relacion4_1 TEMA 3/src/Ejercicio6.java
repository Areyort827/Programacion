import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn= new Scanner(System.in);
    int [] arr =new int[15];
   for (int i=0;i<=13;i++) {
    System.out.print("Introduce un numero para el array: ");
      int n=sn.nextInt();
      arr[i+1]=n;
   }
   System.out.print("Introduce un numero para el array: ");
   int n=sn.nextInt();
   arr[0]=n;
 
   for (int j=0;j<=14;j++) {
	   System.out.print(arr[j]+" ");
   }
	}
	

}
