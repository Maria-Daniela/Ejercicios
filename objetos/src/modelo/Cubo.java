package modelo;

public class Cubo extends Cuadrado{
	private float lado;
	
	public Cubo(float lado) {
		super(lado);	
	}
	
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return lado*lado*6;
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 12*lado;
	}
	public float volumen() {
		return lado*lado*lado;
	}
	
	
}
