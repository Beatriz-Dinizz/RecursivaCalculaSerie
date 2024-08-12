package view;

import controller.SomaSerieController;

public class Principal {

	public static void main(String[] args) {
		SomaSerieController somaSerieController = new SomaSerieController();
		int n = 4;
		double resultado = somaSerieController.calcularSerie(n);
		
		 System.out.println("O resultado da série para N = " + n + " é: " + resultado);
	}
}
