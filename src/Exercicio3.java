import java.util.Scanner;

public class Exercicio3 {
    /*
    Crie um algoritmo que leia o valor do salário de um usuário,
    calcule a quantidade de salários mínimos que esse usuário ganha
    e imprima o resultado. (1SM=R$1.212,00).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu salario:");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1212;
        double calculoQuantidadeDeSalariosMinimos = salario/salarioMinimo;
        int quantidadeDeSalariosMinimos = (int) Math.floor(calculoQuantidadeDeSalariosMinimos);
        System.out.println(Math.floor(quantidadeDeSalariosMinimos));

    }

}
