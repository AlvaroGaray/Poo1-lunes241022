package poo1;

public class Computadora {
//Campos / Atributos
	
	private String marca;
	private int vidautil;
	private double precio;
	private int cantidadRAM;
	private int espacioDisco;
	private double frecuenciaTrabajo;
	//Metodos/Comportamiento
	
	
	//Setters- Modificar el valor de una variable
	
	public void ponerMarca(String marca){
		
		this.marca=marca;
	}
	
	public void ponervidautil(int vidautil) {
		this.vidautil=vidautil;
	}
	
	public void ponerprecio(double precio) {
		this.precio=precio;
	}
	
	public void ponerRam(int cantidadRam) {
		this.cantidadRAM=cantidadRam;
	}
	
	public void ponerespacio(int espaciodisco) {
		this.espacioDisco=espaciodisco;
	}
	
	public void ponerfrecuenciatrabajo(double frecuenciatrabajo) {
		this.frecuenciaTrabajo=frecuenciatrabajo;
	}
	
	//Getters- Son para mostrar el  valor de una variable
	
	public String mostrarMarca() {
		return this.marca;
	}
	
	public int mostrarvidautil() {
		return this.vidautil;
	}
	public double precio() {
		return this.precio;
	}
	
	public int mostrarram() {
		return this.cantidadRAM;
	}
	
	public int mostrarespacio() {
		return this.espacioDisco;
	}
	
	public double mostrarfrecuenciatrabajo() {
		return this.frecuenciaTrabajo;
	}
	
}//Fin de la clase
