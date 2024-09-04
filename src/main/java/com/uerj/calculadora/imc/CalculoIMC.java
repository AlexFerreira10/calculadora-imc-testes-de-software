package com.uerj.calculadora.imc;

public class CalculoIMC {

    private Double peso;
    private Double altura;

    public CalculoIMC(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public static String resultado(Double peso, Double altura) {
        var imc = calculoIMC(peso,altura);

        if(imc > 40) {
            return "Obsidade grau 3";
        } else if(imc >= 35) {
            return "Obsidade grau 2";
        } else if(imc >= 30) {
            return "Obsidade grau 1";
        } else if(imc >= 25){
            return "Sobrepeso";
        } else if (imc >= 18.5) {
            return "Normal";
        } else {
            return "Magreza";
        }
    }

    private static double calculoIMC(Double peso, Double altura) {
        return peso / (altura * altura);
    }
}