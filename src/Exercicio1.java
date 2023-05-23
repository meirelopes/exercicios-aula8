import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o peso de peixes:");
        int peso = scanner.nextInt();
        int excesso = peso - 50;
        double multa = 0;
        if(excesso>0){
            multa = 4*excesso;
            System.out.println("O excesso de peso é de "+excesso+" kg.");
            System.out.println("A multa a ser aplicada é de: "+multa);
        } else {
            System.out.println("O peso de peixes é de: "+peso);
            System.out.println("Sem aplicação de multa.");
        }

    }
}
