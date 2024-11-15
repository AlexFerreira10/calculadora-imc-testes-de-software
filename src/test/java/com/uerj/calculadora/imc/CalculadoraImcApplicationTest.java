package com.uerj.calculadora.imc;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraImcApplicationTests {

	// Basicamente fazemos esse malabarisismo com o System.in para simular a entrada de dados de um teclado
	// Criamos um ByteArrayInputStream com a string de entrada desejada, que simula o que o usuário digitaria
	// O Scanner então lê essa entrada como se fosse a entrada padrão do usuário
	// Precisamos fazer isso tudo porque o Mockito, que é usado para simular comportamentos em testes no Java, não pode
	// simular a entrada de métodos em classes finais como Scanner
	// O mockito até tem uma extensão chamada PowerMock, que resolveria essa questão caso
	// a senhora queria explorar, porém queria focar nessa abordagem diferente

	@Test // Testa se a entrada é um double
	void testCheckDoubleValido() {

		String input = "1.75\n";
		InputStream originalSystemIn = System.in;
		// Colocamos input na entrada padrão
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Scanner sc = new Scanner(System.in);

		double valor = CalculadoraImcApplication.checkDouble(sc, "Digite um valor: ", 0.5, 2.2);
		assertEquals(1.75, valor, "O valor obtido deve ser 1.75");

		// Voltamos ao normal por boas práticas
		System.setIn(originalSystemIn);
	}

	@Test // Testa se a entrada não é um double
	void testCheckDoubleEntradaInvalida() {
		String input = "abc\n1.75\n";
		InputStream originalSystemIn = System.in;
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Scanner sc = new Scanner(System.in);

		double valor = CalculadoraImcApplication.checkDouble(sc, "Digite um valor: ", 0.5, 2.2);
		assertEquals(1.75, valor, "O valor obtido deve ser 1.75");

		System.setIn(originalSystemIn);
	}

	@Test // Testa se um número veio fora do intervalo
	void testCheckDoubleValorForaDoIntervalo() {
		String input = "3.0\n1.75\n";
		InputStream originalSystemIn = System.in;
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Scanner sc = new Scanner(System.in);

		double valor = CalculadoraImcApplication.checkDouble(sc, "Digite um valor: ", 0.5, 2.2);
		assertEquals(1.75, valor, "O valor obtido deve ser 1.75");

		System.setIn(originalSystemIn);
	}
}