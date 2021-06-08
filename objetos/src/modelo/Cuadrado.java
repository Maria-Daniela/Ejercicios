package modelo;

public class Cuadrado {
	private float lado;
	
	public Cuadrado(float lado) {
		this.lado=lado;
	}
	
	public float area() {
		return lado*lado;
	}
	
	public float perimetro() {
		return lado*4;
	}
	
	
}
