
package eva3_22_areas_netbeans;

import java.util.Scanner;

public class EVA3_22_AREAS_NetBeans {

    public static void main(String[] args) {

        Scanner Capt = new Scanner(System.in);

        String[] arreglo = {"Circulo", "Rectangulo", "Triangulo"};

        System.out.println("********CALCULADORA DE AREAS********");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". " + arreglo[i]);
        }

        int opcion = capturarEntero("SELECCIONA UNA FIGURA A CALCULAR (1-" + arreglo.length + "): ");

        if (opcion >= 1 && opcion <= arreglo.length) {
            switch (opcion) {
                case 1:
                    System.out.println("********SECCION CIRCULO********");
                    double radio = capturarDato("CAPTRUA EL RADIO DEL CIRCULO: ");
                    double circulo = areaCirculo(radio);
                    System.out.println("AREA DEL CIRCULO = " + circulo);
                    break;

                case 2:
                    System.out.println("********SECCION RECTANGULO********");
                    double baseRec = capturarDato("CAPTURA LA BASE DEL RECTANGULO: ");
                    double alturaRec = capturarDato("CAPTURA LA ALTURA DEL TRIANGULO: ");
                    double rectangulo = areaRectangulo(baseRec, alturaRec);
                    System.out.println("AREA DEL RECTANGULO = " + rectangulo);
                    break;

                case 3:
                    System.out.println("********SECCION TRIANGULO********");
                    double baseTri = capturarDato("CAPTURA LA BASE TRIANGULO: ");
                    double alturaTri = capturarDato("CAPTURA LA ALTURA DEL TRIANGULO: ");
                    double triangulo = areaTriangulo(baseTri, alturaTri);
                    System.out.println("AREA DEL TRIANGULO = " + triangulo);
                    break;
            }
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    public static double areaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        return area;
    }

    public static double areaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2.0;
        return area;
    }

    public static double capturarDato(String mensaje) {
        Scanner Capt = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = Capt.nextDouble();
        return valor;
    }

    public static int capturarEntero(String mensaje) {
        Scanner Capt = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = Capt.nextInt();
        return valor;
    }
}