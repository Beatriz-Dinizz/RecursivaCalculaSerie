package controller;

public class SomaSerieController {

	public SomaSerieController() {
		super();
	}
	
	public double calcularSerie(int n) {
		// Condição de parada: quando o número for igual a 1, retorna 1, pois 1/1 é 1
		if(n == 1) {
			return 1.0; 	
		} else {
			// Relação de chamada dos passos: o cálculo para qualquer n é 1/n somado à somatória de n - 1.  
			// A função chama a si mesma até que n seja igual a 1.
			return 1.0 / n + calcularSerie(n - 1);
		}		
	}
}
