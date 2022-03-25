import java.util.*;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int [][] arr= new int[4][5];
		int col0=0;
		int col1=0;
		int col2=0;
		int col3=0;
		int col4=0;
		int fil0=0;
		int fil1=0;
		int fil2=0;
		int fil3=0;
		int total=0;
		int tfil=0;
	    int tcol=0;
		
		for (int f=0;f<=3;f++) {
			for (int c=0;c<=4;c++) {
		     arr[f][c]=(int)(Math.random()*899+100);
	     	}
		}
		 for (int f=0;f<=3;f++) {
				for (int c=0;c<=4;c++) {
		    	     
		              System.out.print(arr[f][c]);
		              if (arr[f][c]/10<1) {
		            	  System.out.print("    "+"|"+"   ");
		              }else {
		            	  System.out.print("   "+"|"+"   ");
		              }
		             
		    		}
		    	     System.out.println(" ");
		    			
		    	}
		for (int sf=0;sf<=3;sf++) {
		  for (int sc=0;sc<=4;sc++) {
			 tcol=tcol+arr[sf][sc];
		 }
		  
		}
		for (int sc=0;sc<=4;sc++) {
			  for (int sf=0;sf<=3;sf++) {
				 tfil=tcol+arr[sf][sc];
			 }
			  
			}
		total=tfil+tcol;
		 System.out.println("                                        "+total);
	}

}
