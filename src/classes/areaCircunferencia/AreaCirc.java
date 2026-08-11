package classes.areaCircunferencia;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double calcArea() {
		double area = PI * raio * raio;
		return area;
	}
}