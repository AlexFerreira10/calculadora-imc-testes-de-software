# Visão Geral

Este repositório faz parte de um trabalho da disciplina de Teste de Software, lencionada pela professora Carolina de Sacramento. O intuito é desenvolver os primeiros passos com testes unitários.

## Calculadora de IMC

Esta é uma aplicação Java simples que calcula o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos pelo usuário. O IMC é utilizado para classificar a condição de saúde de uma pessoa em categorias como magreza, normal, sobrepeso e obesidade.

## Descrição

A aplicação consiste em duas classes principais:
1. **CalculadoraImcApplication**: Gerencia a entrada do usuário e exibe o resultado do IMC.
2. **CalculoIMC**: Calcula o IMC e determina a categoria de acordo com o valor calculado.

O projeto inclui também testes unitários para garantir que a lógica de cálculo e validação de entrada funcionem corretamente.

## Tecnologias Utilizadas

- Java 17
- JUnit 5 para testes

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/calculadora-imc-testes-de-software.git
2. Navegue até o diretório do projeto:
    ```bash
   cd calculadora-imc
3. Compile o projeto (certifique-se de ter o JDK instalado):
   ```bash
   javac -d out src/com/uerj/calculadora/imc/*.java
4. Execute o programa:
    ```bash
   java -cp out com.uerj.calculadora.imc.CalculadoraImcApplication

## Uso

1. Execute o programa.
2. Insira o peso em quilogramas (kg) quando solicitado.
3. Insira a altura em metros (m) quando solicitado.
4. O programa exibirá o resultado do IMC e a categoria correspondente.

## Testes

  Os testes são realizados com a ajuda do JUnit 5. Para rodar os testes:

1. Compile os testes:
   ```bash
   javac -d out -cp "out;lib/junit-5.7.0.jar" src/com/uerj/calculadora/imc/*Test.java
2. Execute os testes:
    ```bash
   java -cp "out;lib/junit-5.7.0.jar" org.junit.runner.JUnitCore com.uerj.calculadora.imc.CalculadoraImcApplicationTests com.uerj.calculadora.imc.CalculoIMCTest

  Os testes são definidos nas seguintes classes:

  1. **CalculadoraImcApplicationTests:** Testa a validação da entrada do usuário para garantir que os valores inseridos estejam no intervalo correto e sejam do tipo esperado.
  2. **CalculoIMCTest:** Testa a lógica de cálculo e categorização do IMC.

## Estrutura do Projeto

  O projeto está estruturado da seguinte forma:

  `CalculadoraImcApplication.java` : Gerencia a entrada do usuário, valida os dados e exibe o resultado do IMC.

  `CalculoIMC.java` : Realiza o cálculo do IMC e determina a categoria com base no valor calculado.

  `CalculadoraImcApplicationTests.java` : Contém testes para validar a função checkDouble que é responsável pela entrada de dados do usuário

  `CalculoIMCTest.java` : Contém testes para validar a função resultado que calcula e categoriza o IMC.

  ## Autor

- Douglas Alexsander Ferreira Corrêa
- www.linkedin.com/in/alexferreira92
