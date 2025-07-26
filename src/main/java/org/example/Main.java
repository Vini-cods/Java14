package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int numeroInt = 10;
//        double numeroDouble = numeroInt; // Promoção automática
//        System.out.println(numeroDouble); // Saída: 10.0

//        double numeroDouble = 123.456;
//        int numeroInt = (int) numeroDouble; // Casting explícito
//        System.out.println(numeroInt); // Saída: 123 (perda da parte decimal)

//        String numeroTexto = "42";
//        int numeroInt = Integer.parseInt(numeroTexto);
//        System.out.println(numeroInt); // Saída: 42

        //Exemplo de Problema com Estouro:
//        byte valor = 127;
//        valor++;
//        System.out.println(valor); // Saída: -128 (overflow)

        // Atividade 1: Testando a Promoção Automática
//                int valorInt = 10;
//                long valorLong = 20L;
//                double valorDouble = 30.5;
//
//                // Operações com promoção automática
//                double resultado = valorInt * valorDouble;
//                System.out.println("Resultado da multiplicação de int e double: " + resultado);
//
//                long resultadoLong = valorInt + valorLong;
//                System.out.println("Resultado da soma de int e long: " + resultadoLong);


        // Atividade 2: Conversão de Tipos
                double valorDouble = 123.456;
                int valorConvertido = (int) valorDouble;

                System.out.println("Valor original (double): " + valorDouble);
                System.out.println("Valor convertido (int): " + valorConvertido);

                long valorLong = 150L;
                byte valorByte = (byte) valorLong;
                System.out.println("Valor long: " + valorLong);
                System.out.println("Valor convertido para byte: " + valorByte);
                
    }
}