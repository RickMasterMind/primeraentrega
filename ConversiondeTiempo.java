import java.util.Scanner;

public class ConversiondeTiempo {
    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        long milisegundos = 0;
        milisegundos += dias * 24L * 60 * 60 * 1000;
        milisegundos += horas * 60L * 60 * 1000;
        milisegundos += minutos * 60L * 1000;
        milisegundos += segundos * 1000L;
        return milisegundos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar los días: ");
        int dias = scanner.nextInt();

        System.out.print("Ingresar las horas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingresar los minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingresar los segundos: ");
        int segundos = scanner.nextInt();

        scanner.close();

        long resultado = convertirAMilisegundos(dias, horas, minutos, segundos);
        System.out.println("Tiempo en milisegundos: " + resultado);
    }
}