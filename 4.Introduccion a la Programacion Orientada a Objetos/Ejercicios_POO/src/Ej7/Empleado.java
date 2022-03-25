package Ej7;

public class Empleado {
    public static double importe_he;
	private double nif,sueldob,horasex,irpf,num_hijos;
	private String nombre,casado;
	
	
	public Empleado() {}

    public Empleado(int nif) {
    	this.nif=nif;
    }

    
    public void setsueldob(int sueldob) {
		this.sueldob=sueldob;
    }
    
    public double getsueldob(){
		return sueldob;
    }
    
    public void horasex(int horasex) {
    	this.horasex=horasex;
    }
    
    public double gethorasex() {
	     return horasex;
    }
    
    public void setirpf(int irpf) {
    	this.irpf=irpf;
    }
    
    public double getirpf() {
    	return irpf;
    }
    
    public void setnum_hijos(int num_hijos) {
    	this.num_hijos=num_hijos;
    }
    
    public double getnum_hijos() {
    	return num_hijos;
    }
    
    
    public void setnombre(String nombre) {
    	this.nombre=nombre;
    }
    
    public String getnombre() {
    	return nombre;
    }
    
    public void setcasado(String casado) {
    	this.casado=casado;
    }
    
    public String getcasado() {
    	return casado;
    }
    
    public static void setimporte_he(double importe_he) {
       Empleado.importe_he=importe_he;
    }
    
    public static double getimporte_he() {
        return importe_he;
    }
    
    public double calculohe() {
    	return horasex*importe_he;
    }
    
    public double sueldobruto() {
    	return sueldob*calculohe();
    }
    
    public double retencionirpf() {
		
    	if (casado == "s" ) {
    		irpf=irpf-2;
    	}
    	for (int i=0;i<=num_hijos;i++) {
    		irpf=irpf-1;
    	}
    	return (sueldob*irpf)/100;
    }
    
    public String toString() {
		String resultado = null;
	    resultado = nif+""+nombre+"\nSueldo Base: "+sueldob+"\nHoras Extras: "
		+horasex+"\ntipo IRPF: "+irpf+"\nCasado: "+casado+"Número de Hijos: "+num_hijos;
		
		return resultado;
		  
	  }

}

   
