import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Write console tests");

        Scanner teclado = new Scanner(System.in);

        for (; true; ) {
            System.out.println("Choose an option:\n" +
                    "  1. Square\n" +
                    "  2. Title\n" +
                    "  3. Cuadrado Personalizado\n" +
                    "  4. Piramide Invertida\n" +
                    "  5. Mostrar simbolo\n" +
                    "  0. Quit\n");

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
            }else if (numero == 3) {
                System.out.printf("Lado del cuadrado: ");
                int lado = teclado.nextInt();
                System.out.printf("Introduceme un caracter");
                String caracter = teclado.next();
                Figures.writeSquare(lado, caracter);
            } else if (numero == 4) {
                System.out.printf("Introduce la altura: ");
                int altura = teclado.nextInt();
                Figures.writeInvertedPyramid(altura);
            } else if (numero == 5) {
                writeHeader();
            }else if (numero == 0) {
                Console.close();
            }
        }
    }

    public static void writeHeader(){
        for(int i = 0; i<80;i++){
            System.out.print("<");
        }
        System.out.println("");

    }
}
