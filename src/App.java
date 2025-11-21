import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Write console tests");

        Scanner teclado = new Scanner(System.in);

        for (; true; ) {
            System.out.println("Choose an option:\n" + "  1. Square\n" + "  2. Title\n" + "  0. Quit\n");

            int numero = teclado.nextInt();

            if (numero == 1) {
                System.out.printf("Lado del cuadrado: ");
                int lado = teclado.nextInt();
                Figures.writeSquare(lado);
            } else if (numero == 2) {
                System.out.printf("Titulo: ");
                String titulo = teclado.nextLine();
                titulo = teclado.nextLine();
                Titles.writeTitle(titulo);
            } else if (numero == 0) {
                Console.close();
            }
        }
    }
}
