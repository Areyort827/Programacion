package poo;


public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double interes;
	private double saldo;
	
	
	public Cuenta(){
		
	}
	
	public Cuenta(String nombre,String numero_cuenta,double interes, double saldo) {
		this.nombre=nombre;
		this.numeroCuenta=numero_cuenta;
		this.interes=interes;
		this.saldo=saldo;
		
	}

	public Cuenta(final Cuenta c) {
		nombre=c.nombre;
		numeroCuenta=c.numeroCuenta;
		interes=c.interes;
		saldo=c.saldo;
	}

	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setInteres(double interes) {
		this.interes=interes;
		
	}
	public double getInteres() {
		return interes;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	public boolean ingreso(double cantidad) {
		if (cantidad>0) {
		saldo=saldo+cantidad;
		return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean reintegro(double cantidad) {
		if(saldo>=cantidad) {
		 saldo=saldo-cantidad;
		 return true;
		}
		else {
		return false;
			
		}
	}
	

	public boolean transferencia(Cuenta c,double cantidad) {
		boolean correcto=true;
		if(cantidad <0 || saldo< cantidad) {
			correcto=false;	
		}else {
			reintegro(cantidad);
			c.ingreso(cantidad);
			
			}
		return correcto;
		
	}
		

}
