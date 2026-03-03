package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o valor do ingresso da entrada inteira: ");
        String leituraInteira = teclado.nextLine();
        double valor_inteira = Double.parseDouble(leituraInteira.replace(",", "."));

        System.out.println("Entre com a quantidade de ingressos entrada inteira: ");
        int qtd_inteira = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Entre com o valor do ingresso meia-entrada: ");
        String leituraMeiaEntrada = teclado.nextLine();
        double valor_meiaEntrada = Double.parseDouble(leituraMeiaEntrada.replace(",","."));

        System.out.println("Entre com a quantidade de ingressos meia-entrada: ");
        int qtd_meiaEntrada = teclado.nextInt();

        double valorTotal_inteira = qtd_inteira * valor_inteira;
        double valorTotal_meiaEntrada = qtd_meiaEntrada * valor_meiaEntrada;
        double qtdTotalIngresso = qtd_inteira + qtd_meiaEntrada;

        double valorTotalArrecadado = valorTotal_inteira + valorTotal_meiaEntrada;

        double valorMedioIngresso = valorTotalArrecadado / qtdTotalIngresso;

        System.out.println("O total arrecadado com ingressos inteiros foi R$:" + valorTotal_inteira);
        System.out.println("O total arrecadado com ingressos meia-entrada foi R$:" + valorTotal_meiaEntrada);
        System.out.println("O total arrecadado na seção foi R$:" + valorTotalArrecadado);
        System.out.printf("O valor médio pago por ingresso foi R$:%.2f", valorMedioIngresso);

        teclado.close();
    }
}
