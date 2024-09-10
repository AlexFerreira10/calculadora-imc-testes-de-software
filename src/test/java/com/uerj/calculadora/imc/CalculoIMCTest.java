package com.uerj.calculadora.imc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoIMCTest {

    @Test
    void testResultado_ObesidadeGrau3() {
        double peso = 150.0; // Ajustado para um IMC acima de 40
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Obsidade grau 3", resultado, "Deveria retornar 'Obsidade grau 3'");
    }

    @Test
    void testResultado_ObesidadeGrau2() {
        double peso = 110.00;
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Obsidade grau 2", resultado, "Deveria retornar 'Obsidade grau 2'");
    }

    @Test
    void testResultado_ObesidadeGrau1() {
        double peso = 90.0;
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Obsidade grau 1", resultado, "Deveria retornar 'Obsidade grau 1'");
    }

    @Test
    void testResultado_Sobrepeso() {
        double peso = 80.0;
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Sobrepeso", resultado, "Deveria retornar 'Sobrepeso'");
    }

    @Test
    void testResultado_Normal() {
        double peso = 70.0;
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Normal", resultado, "Deveria retornar 'Normal'");
    }

    @Test
    void testResultado_Magreza() {
        double peso = 50.0;
        double altura = 1.7;
        String resultado = CalculoIMC.resultado(peso, altura);
        assertEquals("Magreza", resultado, "Deveria retornar 'Magreza'");
    }
}