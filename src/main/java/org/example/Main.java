package org.example;
import java.util.Scanner;

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
//                double valorDouble = 123.456;
//                int valorConvertido = (int) valorDouble;
//
//                System.out.println("Valor original (double): " + valorDouble);
//                System.out.println("Valor convertido (int): " + valorConvertido);
//
//                long valorLong = 150L;
//                byte valorByte = (byte) valorLong;
//                System.out.println("Valor long: " + valorLong);
//                System.out.println("Valor convertido para byte: " + valorByte);

        // Atividade 3: Cuidado com a Promoção
//                int num1 = 55555;
//                int num2 = 66666;
//
//                // Operação que causa estouro
//                long resultadoCorreto = (long) num1 * num2;
//                System.out.println("Resultado correto usando long: " + resultadoCorreto);

        // Atividade 4: Parsing de Strings
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Digite um número inteiro: ");
//                String inputInt = scanner.nextLine();
//
//                try {
//                    int numeroInt = Integer.parseInt(inputInt);
//                    System.out.println("Número inteiro convertido: " + numeroInt);
//                } catch (NumberFormatException e) {
//                    System.out.println("Erro ao converter para inteiro: " + e.getMessage());
//                }
//
//                System.out.print("Digite um número decimal: ");
//                String inputDouble = scanner.nextLine();
//
//                try {
//                    double numeroDouble = Double.parseDouble(inputDouble);
//                    System.out.println("Número decimal convertido: " + numeroDouble);
//                } catch (NumberFormatException e) {
//                    System.out.println("Erro ao converter para decimal: " + e.getMessage());
//                }

        // Atividade 5: Calculadora Simples
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Digite o primeiro número: ");
//                double numero1 = Double.parseDouble(scanner.nextLine());
//
//                System.out.print("Digite o segundo número: ");
//                double numero2 = Double.parseDouble(scanner.nextLine());
//
//                System.out.println("Soma: " + (numero1 + numero2));
//                System.out.println("Subtração: " + (numero1 - numero2));
//                System.out.println("Multiplicação: " + (numero1 * numero2));
//                System.out.println("Divisão: " + (numero1 / numero2));

        // Atividade 6: Detectando Estouro de Variável
//                byte valorByte = 127;
//
//                System.out.println("Valor inicial: " + valorByte);
//                valorByte++;
//                System.out.println("Após adicionar 1: " + valorByte);
//                valorByte++;
//                System.out.println("Após adicionar mais 1: " + valorByte);

        // Atividade 7: Trabalhando com Valores Flutuantes
                float valorFloat = 10.5F;
                double valorDouble = 20.5;

                System.out.println("Valor float: " + valorFloat);
                System.out.println("Valor double: " + valorDouble);

                // Operação
                double resultado = valorFloat + valorDouble;
                System.out.println("Resultado da soma: " + resultado);

    }
}