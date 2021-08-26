package br.com.zup;

import java.util.Scanner;

public class SalarioEReajuste {
    public static void main(String[] args) {
        System.out.println("Este programa recebe o salário de um colaborador e determina em qual faixa de reajuste ele se enquadra.");
        System.out.println("Entre com o salário do colaborador em R$ :");

        Scanner teclado = new Scanner(System.in);

        double salarioColaborador = teclado.nextDouble();
        double salarioComReajuste = 0;

        if (salarioColaborador <= 0) {
            System.out.println("Valor inválido! Digite um valor em R$ maior que R$ 0,00");
            salarioColaborador = teclado.nextDouble();
        } else {
            if (salarioColaborador <= 280) {
                salarioComReajuste = (salarioColaborador + (salarioColaborador * 0.2));
                System.out.println("O salário do colaborador é R$ " + salarioColaborador);
                System.out.println("O percentual de ajuste foi de 20%.");
                System.out.println("O valor do aumento foi de R$ " + (salarioComReajuste - salarioColaborador));
                System.out.println("O novo valor do salário após aumento é R$ " + salarioComReajuste);
            } else {
                if (salarioColaborador > 280 & salarioColaborador <= 700) {
                    salarioComReajuste = (salarioColaborador + (salarioColaborador * 0.15));
                    System.out.println("O salário do colaborador é R$ " + salarioColaborador);
                    System.out.println("O percentual de ajuste foi de 15%.");
                    System.out.println("O valor do aumento foi de R$ " + (salarioComReajuste - salarioColaborador));
                    System.out.println("O novo valor do salário após aumento é R$ " + salarioComReajuste);
                } else {
                    if (salarioColaborador > 700 & salarioColaborador <= 1500) {
                        salarioComReajuste = (salarioColaborador + (salarioColaborador * 0.1));
                        System.out.println("O salário do colaborador é R$ " + salarioColaborador);
                        System.out.println("O percentual de ajuste foi de 10%.");
                        System.out.println("O valor do aumento foi de R$ " + (salarioComReajuste - salarioColaborador));
                        System.out.println("O novo valor do salário após aumento é R$ " + salarioComReajuste);
                    } else {
                        salarioComReajuste = (salarioColaborador + (salarioColaborador * 0.05));
                        System.out.println("O salário do colaborador é R$ " + salarioColaborador);
                        System.out.println("O percentual de ajuste foi de 5%.");
                        System.out.println("O valor do aumento foi de R$ " + (salarioComReajuste - salarioColaborador));
                        System.out.println("O novo valor do salário após aumento é R$ " + salarioComReajuste);
                    }
                }

            }
        }
    }
}
