package Ej4;

public class Libro {
private String titulo;
private String autor;
private int numero_ejemplares;
private int numero_ejemplares_prestados;


     public Libro() {}
     
     public Libro(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados) {
    	 this.titulo=titulo;
    	 this.autor=autor;
    	 this.numero_ejemplares=numero_ejemplares;
    	 this.numero_ejemplares_prestados=numero_ejemplares_prestados;
     }
     
     public Libro(final Libro c) {
    	titulo=c.titulo;
    	autor=c.autor;
    	numero_ejemplares=c.numero_ejemplares;
    	numero_ejemplares_prestados=c.numero_ejemplares_prestados;
     }
     
     public void setTitulo(String titulo){
    	 this.titulo=titulo;
     }
     public String getTitulo() {
    	 return titulo;
     }
     
     public void setAutor(String autor){
    	 this.autor=autor;
     }
     public String getAutor() {
    	 return autor;
     }
     
    public void setNumeroEjemplares(int numero_ejemplares) {
    	this.numero_ejemplares=numero_ejemplares;
    }
    
    public int getNumeroEjemplares() {
    	return numero_ejemplares;
    }
    
    public void setNumeroEjemplaresPrestados(int numero_ejemplares_prestados) {
    	this.numero_ejemplares_prestados=numero_ejemplares_prestados;
    }
    
    public int getNumeroEjemplaresPrestados() {
    	return numero_ejemplares_prestados;
    }
    
    public boolean prestamo() {
    	boolean prestamo=true;
    	if (numero_ejemplares>numero_ejemplares_prestados) {
    		numero_ejemplares_prestados++;
    	}else {
		prestamo=false;
    	}
		return prestamo;
    }
    
    public boolean devolucion() {
        boolean devolucion=true;
    	if (numero_ejemplares_prestados>0) {
    		numero_ejemplares_prestados--;
    	}else {
		devolucion=false;
    	}
		return devolucion;
    }
    
    public String toString() {
    	String m="El titulo del libro es "+titulo +"\nEl autor del libro es "+autor+"\nLa cantidad de ejemplares es de "+numero_ejemplares+"\nLa cantidad de ejemplares prestados es de "+numero_ejemplares_prestados;
    	return m;
    }
    
    
}
