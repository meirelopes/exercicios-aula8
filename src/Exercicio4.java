import java.util.Scanner;

public class Exercicio4 {
    /*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
    e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deverá informar sua idade em anos, dias e meses. \nInforme os anos:");
        int anos = scanner.nextInt();
        System.out.println("Informe os meses:");
        int meses = scanner.nextInt();
        System.out.println("Informe os meses:");
        int dias = scanner.nextInt();

        int calculoAnos = anos*365;
        int calculoMeses = meses*30;
        int totalDeDias = calculoAnos+calculoMeses+dias;
        System.out.println("A sua idade é de "+totalDeDias+" dias");



    }
}
