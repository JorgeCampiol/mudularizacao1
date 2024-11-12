import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = lerQuantidade(scanner);
        int soma = somarNumeros(scanner, quantidade);
        double media = calcularMedia(soma, quantidade);

        mostrarResultado(media);

        scanner.close();
    }

    private static int lerQuantidade(Scanner scanner) {
        System.out.print("Quantos números você quer inserir? ");
        return scanner.nextInt();
    }

    private static int somarNumeros(Scanner scanner, int quantidade) {
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            soma += scanner.nextInt();
        }
        return soma;
    }

    private static double calcularMedia(int soma, int quantidade) {
        return soma / (double) quantidade;
    }

    private static void mostrarResultado(double media) {
        System.out.println("A média é: " + media);
        if (media > 10) {
            System.out.println("A média é maior que 10.");
        } else {
            System.out.println("A média é 10 ou menor.");
        }
    }
}
