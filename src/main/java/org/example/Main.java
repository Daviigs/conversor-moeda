package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String apiKey = "225f6765677741d87e0b8841";
        Conversor conversor = new Conversor(apiKey);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Moedas ===");
        System.out.println("1. Dólar (USD) → Real (BRL)");
        System.out.println("2. Real (BRL) → Dólar (USD)");
        System.out.println("3. Euro (EUR) → Real (BRL)");
        System.out.println("4. Real (BRL) → Euro (EUR)");
        System.out.println("5. Libra (GBP) → Real (BRL)");
        System.out.println("6. Real (BRL) → Libra (GBP)");
        System.out.println("7. Peso Argentino (ARS) → Real (BRL)");
        System.out.println("8. Real (BRL) → Peso Argentino (ARS)");
        System.out.println("9. Dólar (USD) → Euro (EUR)");
        System.out.println("10. Euro (EUR) → Dólar (USD)");
        System.out.print("Escolha uma opção (1-10): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor a converter: ");
        double valor = scanner.nextDouble();

        String base = "", target = "";

        switch (opcao) {
            case 1: base = "USD"; target = "BRL"; break;
            case 2: base = "BRL"; target = "USD"; break;
            case 3: base = "EUR"; target = "BRL"; break;
            case 4: base = "BRL"; target = "EUR"; break;
            case 5: base = "GBP"; target = "BRL"; break;
            case 6: base = "BRL"; target = "GBP"; break;
            case 7: base = "ARS"; target = "BRL"; break;
            case 8: base = "BRL"; target = "ARS"; break;
            case 9: base = "USD"; target = "EUR"; break;
            case 10: base = "EUR"; target = "USD"; break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        try {
            double convertido = conversor.converter(base, target, valor);
            System.out.printf("Valor convertido: %.2f %s%n", convertido, target);
        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
        }

        scanner.close();
    }
}