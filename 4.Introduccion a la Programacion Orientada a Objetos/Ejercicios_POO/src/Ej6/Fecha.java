package Ej6;

public class Fecha {
   private int dia;
   private int mes;
   private int a�o;
   
   public Fecha() {}
  
	   public Fecha(int dia, int mes, int a�o) {
		   this.dia=dia;
		   this.mes=mes;
		   this.a�o=a�o;
	   }
	   
	   public Fecha(final Fecha f) {
		   dia=f.dia;
		   mes=f.mes;
		   a�o=f.a�o;
	   }
	   
	   public void setdia() {
		   this.dia=dia;
	   }
	   
	   public int getdia() {
		   return dia;
	   }
	   
	   public void setmes() {
		   this.mes=mes;
	   }
	   
	   public int getmes() {
		   return mes;
	   }
	   
	   public void seta�o() {
		   this.a�o=a�o;
	   }
   
	   public int geta�o() {
		   return a�o;
	   }
	   
	   public boolean fechaCorrecta() {
          boolean diac,mesc,a�oc;
         
          a�oc=a�o>0;
          mesc=mes>0 && mes<=12;
          switch(mes) {
          case 2:
        	  if (esBisiesto()) {
        		  diac=dia<=29;
        	  } else {
        		  diac=dia<=28;
        	  }
        	  
          case 4:
        	  diac = dia >= 1 && dia <= 30;
          case 6:
        	  diac = dia >= 1 && dia <= 30;  
          case 9:
        	  diac = dia >= 1 && dia <= 30;
          case 11:
        	  diac = dia >= 1 && dia <= 30;
          default:
        	  diac = dia >= 1 && dia <= 31;
          }
          return diac & mesc & a�oc;
	
	   }
	   
	   private boolean esBisiesto() {
		   return(a�o%4 == 0 && a�o%100 !=0 || a�o%400 == 0);
	   }
	   
	   public int diaSiguiente() {
		   dia++;
		   if (!fechaCorrecta()) {
			   dia=1;
			   mes++;
			   if (!fechaCorrecta()) {
				   mes=1;
				   a�o++;
			   }
		   }
		   return dia;
	   }
	   
	  public String toString() {
		String resultado = null;
		if(dia<10 && mes<10) {
			resultado="0"+dia+"-0"+mes+"-"+a�o;
		}else if(dia<10 && mes>=10) {
			resultado="0"+dia+"-"+mes+"-"+a�o;
		}else if(dia>=10 && mes<10) {
			resultado=dia+"-0"+mes+"-"+a�o;
		}
		return resultado;
		  
	  }
	  
}
