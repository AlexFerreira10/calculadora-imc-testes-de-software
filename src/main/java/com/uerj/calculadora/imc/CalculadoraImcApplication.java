package com.uerj.calculadora.imc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraImcApplication {

	private static final double ALTURA_MAX = 2.2;
	private static final double ALTURA_MIN = 0.5;
	private static final double PESO_MAX = 300.0;
	private static final double PESO_MIN = 2.5;

	public static void main(String[] args) {


		double peso = obterDouble("Digite o peso (kg): ", PESO_MIN, PESO_MAX);
		double altura = obterDouble("Digite a altura (m): ", ALTURA_MIN, ALTURA_MAX);

		String imc = CalculoIMC.resultado(peso, altura);
		System.out.println("Seu IMC é: " + imc);

	}

	private static double obterDouble(String mensagem, double min, double max) {
		Scanner sc = new Scanner(System.in);

		double valor = 0.0;
		boolean inputValido = false;

		while (!inputValido) {
			System.out.print(mensagem);
			try {
				if (sc.hasNextDouble()) {
					valor = sc.nextDouble();
					if (valor >= min && valor <= max) {
						inputValido = true;
					} else {
						System.out.println("Valor fora do intervalo. Digite um número entre " + min + " e " + max + ".");
					}
				} else {
					System.out.println("Entrada inválida. Digite um número válido.");
					sc.next();
				}
			} catch (InputMismatchException e) {
				System.out.println("Erro de entrada: " + e.getMessage());
				sc.next();
			} finally {
				sc.close();
			}
		}
		return valor;
	}
}
