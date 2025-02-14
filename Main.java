import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        interface Poligono {
            double sacarArea();
        }
        static class Triangulo implements Poligono {
            double base, altura;

            Triangulo(double base, double altura) {
                this.base = base;
                this.altura = altura;
            }

            @Override
            public double sacarArea() {

                return (base * altura) /2 ;
            }
        }
        static class Cuadrado implements Poligono {
            double lado;

            Cuadrado(double lado) {
                this.lado = lado;
            }
            @Override
            public  double sacarArea() {
                 return lado * lado;
            }
        }
        static class Rectangulo implements Poligono{
            double largo, ancho;
            Rectangulo(double largo, double ancho){
                this.largo = largo;
                this.ancho = ancho;
            }

            @Override
            public double sacarArea() {
                return largo * ancho;
            }
        }
        public static void main(String[]args) {
            Poligono triangulo = new Triangulo(2,7);
            Poligono cuadrado = new Cuadrado(8);
            Poligono rectanculo = new Rectangulo(3,5);


            System.out.println("el area del triangulo es : " + triangulo.sacarArea());

            System.out.println("el area del rectangulo es : " + rectanculo.sacarArea());

            System.out.println("el area del cuadrado es : " + cuadrado.sacarArea());
        }


  }






