
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Write console tests");

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:\n" +
                    "  1. Square\n" +
                    "  2. Title\n" +
                    "  3. Cuadrado Personalizado \n" +
                    "  0. Quit\n");

            int numero = teclado.nextInt();

            if (numero == 1) {
                System.out.print("Lado del cuadrado: ");
                int lado = teclado.nextInt();

                System.out.println("Introduceme un caracter:");
                String caracter = teclado.next();

                Figures.writeSquare(lado, caracter);
            } else if (numero == 2) {
                System.out.print("Titulo: ");
                teclado.nextLine(); // limpiar buffer
                String titulo = teclado.nextLine();
                Titles.writeTitle(titulo);
            } else if (numero == 3) {
                System.out.print("Lado del cuadrado: ");
                int lado = teclado.nextInt();
                Figures.writeSquare(lado);
            }else if (numero == 0) {
                System.out.println("Bye!");
                teclado.close();
                System.exit(0);
            }
        }
    }
}
