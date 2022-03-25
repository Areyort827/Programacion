import java.util.*;
public class bingo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
		 String seguir;
		 int linea=0;
		 int bingo=1;
		int u=0;
		 int s=1;
		 int dine1=0;
		 int dine2=0;
		int[][] c1= new int [3][5];
		int[][] c2= new int [3][5];
		
System.out.println("******BINGO IES MARTINEZ MONTAÑES******");
System.out.println("            PREMIOS");
System.out.println("        Línea: 100$ ");
System.out.println("        Bingo: 500$ ");
System.out.println("Pulse cualquier tecla para continuar");
 seguir = teclado.nextLine();
   for (int pr=1;pr<=3;pr++) {
	   int cart1=(int)(Math.random()*9+1);
		   c1[u][0]=cart1;
		   u++;
		 } 
   u=0;                        //Carton 1
   for (int pr=1;pr<=3;pr++) {
	   int cart1=(int)(Math.random()*9+10);
		   c1[u][1]=cart1;
		   u++;
		 }
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart1=(int)(Math.random()*9+20);
		   c1[u][2]=cart1;
		   u++;
		 }
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart1=(int)(Math.random()*9+30);
		   c1[u][3]=cart1;
		   u++;
		 }
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart1=(int)(Math.random()*9+40);
		   c1[u][4]=cart1;
		   u++;
		 }
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart2=(int)(Math.random()*9+1);
		   c2[u][0]=cart2;
		   u++;
		 } 
   u=0;                       
   for (int pr=1;pr<=3;pr++) {
	   int cart2=(int)(Math.random()*9+10);
		   c2[u][1]=cart2;
		   u++;
		 }
   u=0;                              //Carton 2
   for (int pr=1;pr<=3;pr++) {
	   int cart2=(int)(Math.random()*9+20);
		   c2[u][2]=cart2;
		   u++;
		 }                 
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart2=(int)(Math.random()*9+30);
		   c2[u][3]=cart2;
		   u++;
		 }
   u=0;
   for (int pr=1;pr<=3;pr++) {
	   int cart2=(int)(Math.random()*9+40);
		   c2[u][4]=cart2;
		   u++;
		 }




do {
	 int m=0;
	 int n=0;
	 int a=0;
	 int q=0;
	 int w=0;
	 int e=0;
Scanner sn= new Scanner(System.in);
System.out.println("--------------------------");
System.out.println("      Jugador 1");
System.out.println("--------------------------");
for (int i=1;i<=5;i++) {
	 System.out.print("  "+c1[0][n]+" | ");
	 n++;
	 
}


System.out.println("");


for (int i=1;i<=5;i++) {
	  
	 System.out.print("  "+c1[1][m]+" | ");
	 m++;
	 
}

System.out.println("");
for (int i=1;i<=5;i++) {
	  
	 System.out.print("  "+c1[2][a]+" | ");
	 a++;
	 
}







System.out.println("");
System.out.println("--------------------------");
System.out.println("      Jugador 2");
System.out.println("--------------------------");
for (int i=1;i<=5;i++) {
	
	 System.out.print("  "+c2[0][q]+" | ");
	 q++; 
	 
}

System.out.println("");


for (int i=1;i<=5;i++) {
	  
	 System.out.print("  "+c2[1][w]+" | ");
	 w++;
	 
}

System.out.println("");
for (int i=1;i<=5;i++) {
	  
	 System.out.print("  "+c2[2][e]+" | ");
	 e++;
	 
}
System.out.println("");
if (c1[0][0]+c1[1][0]+c1[2][0]<=0) {
	 	 dine1=100;
	System.out.println("LINEA PARA EL JUGADOR 1");
	System.out.println("Dinero acumulado: ");
	System.out.println("JUGADOR 1: "+dine1+"$");
	System.out.println("JUGADOR 2: "+dine2+"$");
	}
	if(c1[0][0]+c1[1][0]+c1[2][0]+c1[0][1]+c1[1][1]+c1[2][1]<=0) {
			dine1=200;
			System.out.println("LINEA PARA EL JUGADOR 1");
		System.out.println("Dinero acumulado: ");
		System.out.println("JUGADOR 1: "+dine1+"$");
		System.out.println("JUGADOR 2: "+dine2+"$");
	}
System.out.println("");
System.out.println("Pulse cualquier tecla para sacar bola");
seguir = teclado.nextLine();
int bola= (int) (Math.random()*49+1);
for (int i=0;i<=4;i++) {//Comprobación del número en el carton 1
	  
	if (bola<c1[0][i]) {
		c1[0][i]=c1[0][i];
	}else if(bola>c1[0][i]) {
		c1[0][i]=c1[0][i];
	}else {
		c1[0][i]=0;
	}
}

for (int in=0;in<=4;in++) {
	if (bola<c1[1][in]) {
		c1[1][in]=c1[1][in];
	}else if(bola>c1[1][in]) {
		c1[1][in]=c1[1][in];
	}else {
		c1[1][in]=0;
	}
}
for (int rt=0;rt<=4;rt++) {
	if (bola<c1[2][rt]) {
		c1[2][rt]=c1[2][rt];
	}else if(bola>c1[2][rt]) {
		c1[2][rt]=c1[2][rt];
	}else {
		c1[2][rt]=0;
	}	
	}
for (int i=0;i<=4;i++) {//Comprobación del número en el carton 2
	  
	if (bola<c2[0][i]) {
		c2[0][i]=c2[0][i];
	}else if(bola>c2[0][i]) {
		c2[0][i]=c2[0][i];
	}else {
		c2[0][i]=0;
	}
}

for (int in=0;in<=4;in++) {
	if (bola<c2[1][in]) {
		c2[1][in]=c2[1][in];
	}else if(bola>c2[1][in]) {
		c2[1][in]=c2[1][in];
	}else {
		c2[1][in]=0;
	}
}
for (int rt=0;rt<=4;rt++) {
	if (bola<c2[2][rt]) {
		c2[2][rt]=c2[2][rt];
	}else if(bola>c2[2][rt]) {
		c2[2][rt]=c2[2][rt];
	}else {
		c2[2][rt]=0;
	}	
	}




System.out.println("Ha salido el numero "+ bola);
System.out.println("");
}while (bingo>=1);
	}

}
