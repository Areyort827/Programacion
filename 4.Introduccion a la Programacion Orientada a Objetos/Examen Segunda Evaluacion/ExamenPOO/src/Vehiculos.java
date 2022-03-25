
public class Vehiculos {

	
	
	private String marca;
	private String matricula;
	private int num_km;
	private String fecha_matriculacion;
	private String descripcion;
	private double precio;
	private String nombre_prop;
	private String dni_prop;

	
	//Constructor sin parametros
	public Vehiculos() {}
	
	//Constructor con parametros
	public Vehiculos(String marca,String matricula,int num_km,String fecha_matriculacion,String descripcion,double precio,String nombre_prop,String dni_prop) {
		this.marca=marca;
		this.matricula=matricula;
		this.num_km=num_km;
		this.fecha_matriculacion=fecha_matriculacion;
		this.descripcion=descripcion;
		this.precio=precio;
		this.nombre_prop=nombre_prop;
		this.dni_prop=dni_prop;
	}
	
	
	//Constructor copia
	public Vehiculos(final Vehiculos v) {
		marca=v.marca;
		matricula=v.matricula;
	    num_km=v.num_km;
		fecha_matriculacion=v.fecha_matriculacion;
		descripcion=v.descripcion;
		precio=v.precio;
		nombre_prop=v.nombre_prop;
		dni_prop=v.dni_prop;
	}
	
	//Metodos getters
	
	public String getMarca() {
		return marca;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getNum_km() {
		return num_km;
	}
	
	public String getFecha_matriculacion() {
		return fecha_matriculacion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getNombre_prop() {
		return nombre_prop;
	}
	
	public String getDni_prop() {
		return dni_prop;
	}
	
	//Metodos setters
	
	public void setMarca (String marca ) {
		this.marca=marca;
	}
	
	public void setMatricula (String matricula ) {
		this.matricula=matricula;
	}
	
	public void setNum_km (int num_km ) {
		this.num_km=num_km;
	}
	
	public void setFecha_matriculacion(String fecha_matriculacion) {
		this.fecha_matriculacion=fecha_matriculacion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public void setNombre_prop(String nombre_prop) {
		this.nombre_prop=nombre_prop;
	}
	
	public void setDni_prop(String dni_prop) {
		this.dni_prop=dni_prop;
	}
	
	public static int getAnios() {
		int anios=0;
		return anios;
	}
	
	public String toString() {
		 String datos="Marca: "+marca+"\nMatricula: "+matricula+"\nNumero de kilometros: "+num_km+"\nFecha de matriculacion: "+fecha_matriculacion+"\nDescripcion: "+descripcion+"\nPrecio: "+precio+"\nNombre del propietario: "+nombre_prop+"\nDni del propietario: "+dni_prop;
		 return datos;
			 
	 }
}
