package Paquete;

public class Moto extends Vehiculo {

	public Moto(String Marca, String Modelo, float VelocidadMaxima) {
		super(Marca, Modelo, VelocidadMaxima);
	}

	@Override
	public void Mover() {
		System.out.println("Se mueve una moto");
	}

}
