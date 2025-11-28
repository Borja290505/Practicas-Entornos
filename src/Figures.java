public class Figures {

    public static char Asterisk = '*';

    public static void writeSquare(int a) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.printf("*");
            }

            System.out.println("");
        }
    }
    public static void writeSquare(int a, String caracter) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.printf(caracter);
            }

            System.out.println("");
        }
    }


    public static void writeInvertedPyramid(int altura) {

        if (altura <= 0) {
            System.out.println("La altura debe ser mayor que cero.");
            return;
        }


        for (int i = altura; i > 0; i -= 2) {
            int spaces = (altura - i) / 2; // Calcula los espacios a la izquierda
            // Imprime espacios
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // Imprime asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void writeRectangle(int base, int altura, String caracter) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }


}