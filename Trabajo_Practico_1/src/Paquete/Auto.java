package Paquete;


import java.util.Scanner;

public class Auto extends Vehiculo{
	
	private int CantidadPuertas;
	private String TipoCombustible;
	
	Scanner console = new Scanner(System.in);
	
	public Auto(String Marca, String Modelo, float VelocidadMaxima, int CantidadPuertas, String TipoCombustible) {
		super(Marca, Modelo, VelocidadMaxima);
		this.CantidadPuertas = CantidadPuertas;
		this.TipoCombustible = TipoCombustible;
		
	}
	
	public void AutonomiaKM() {
		System.out.print("Ingrese la cantidad de combustible del Auto: ");
		int Combustible = console.nextInt();
		
		System.out.print("Ingrese la cantidad que consume por 100 KM: ");
		float Consumo = console.nextFloat();
		
		float Autonomia =  (Combustible * 100/Consumo);
		
		System.out.println("Su Autonomia es aproximadamente: " + Autonomia + "/KM");
		
	}
	
	
	

	@Override
	public void Mover() {
		System.out.println("Se mueve un Auto");
		
	}

	

}
