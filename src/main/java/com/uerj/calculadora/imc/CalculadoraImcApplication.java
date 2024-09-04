package com.uerj.calculadora.imc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;

@SpringBootApplication
public class CalculadoraImcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraImcApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			Scanner sc = new Scanner(System.in);

			System.out.print("Digite o peso (kg): ");
			double peso = sc.nextDouble();

			System.out.print("Digite a altura (m): ");
			double altura = sc.nextDouble();

			String imc = CalculoIMC.resultado(peso, altura);
			System.out.println("Seu IMC é: " + imc);

			sc.close();
		};
	}
}