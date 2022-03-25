package Ej6;

public class Fecha {
   private int dia;
   private int mes;
   private int año;
   
   public Fecha() {}
  
	   public Fecha(int dia, int mes, int año) {
		   this.dia=dia;
		   this.mes=mes;
		   this.año=año;
	   }
	   
	   public Fecha(final Fecha f) {
		   dia=f.dia;
		   mes=f.mes;
		   año=f.año;
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
	   
	   public void setaño() {
		   this.año=año;
	   }
   
	   public int getaño() {
		   return año;
	   }
	   
	   public boolean fechaCorrecta() {
          boolean diac,mesc,añoc;
         
          añoc=año>0;
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
          return diac & mesc & añoc;
	
	   }
	   
	   private boolean esBisiesto() {
		   return(año%4 == 0 && año%100 !=0 || año%400 == 0);
	   }
	   
	   public int diaSiguiente() {
		   dia++;
		   if (!fechaCorrecta()) {
			   dia=1;
			   mes++;
			   if (!fechaCorrecta()) {
				   mes=1;
				   año++;
			   }
		   }
		   return dia;
	   }
	   
	  public String toString() {
		String resultado = null;
		if(dia<10 && mes<10) {
			resultado="0"+dia+"-0"+mes+"-"+año;
		}else if(dia<10 && mes>=10) {
			resultado="0"+dia+"-"+mes+"-"+año;
		}else if(dia>=10 && mes<10) {
			resultado=dia+"-0"+mes+"-"+año;
		}
		return resultado;
		  
	  }
	  
}
