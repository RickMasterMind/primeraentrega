import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();


        char[] caracteres = texto.toCharArray();


        int inicio = 0;
        int fin = caracteres.length - 1;
        while (inicio < fin) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fin];
            caracteres[fin] = temp;
            inicio++;
            fin--;
        }


        String textoInvertido = new String(caracteres);

        
        System.out.println("Texto invertido: " + textoInvertido);

        scanner.close();
    }
}
