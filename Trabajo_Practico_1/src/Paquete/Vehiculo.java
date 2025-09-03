package Paquete;

public abstract class Vehiculo {
	private String 	Marca, Modelo;
	private float VelocidadMaxima;
	
	public Vehiculo(String Marca, String Modelo, float VelocidadMaxima) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.VelocidadMaxima = VelocidadMaxima;
	}
	
	public void Info() {
		System.out.println("Marca: " + Marca + " || Modelo: " + Modelo);
		System.out.println("Velocidad Maxima: " + VelocidadMaxima + " KM/H");
	}
	
	
	public abstract void Mover();

}
