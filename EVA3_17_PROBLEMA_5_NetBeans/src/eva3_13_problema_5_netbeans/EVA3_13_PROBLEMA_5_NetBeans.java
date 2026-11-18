
package eva3_13_problema_5_netbeans;

import java.util.Scanner;

public class EVA3_13_PROBLEMA_5_NetBeans {

    public static void main(String[] args) {
        
        // REGISTRAR LAS TEMPERATURAS DE DIFERENTES CIUDADES DURANTE 
        // UNA SEMANA E IDENTIFICAR EL PROMEDIO DE CADA UNA.
        
        Scanner Captu = new Scanner(System.in);
        
        int tCiudades = 3;
        int tDias = 5;
        
        double[][] registrosTemp = new double[tCiudades][tDias];
        String[] listaCiudades = {"CHIHUAHUA", "GUADALAJARA", "MONTERREY"};
        String[] semana = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES"};
        
        for (int i = 0; i < tCiudades; i++) {
            System.out.println(" [ CIUDAD: " + listaCiudades[i] + " ] ");
            for (int j = 0; j < tDias; j++) {
                System.out.print("TEMPERATURA DEL " + semana[j] + ": ");
                registrosTemp[i][j] = Captu.nextDouble();
            }
            System.out.println();
        }

        System.out.println(" REPORTE DE TEMPERATURAS ");
        
        for (int i = 0; i < tCiudades; i++) {
            System.out.print(listaCiudades[i] + ": ");
            for (int j = 0; j < tDias; j++) {
                System.out.print("[" + registrosTemp[i][j] + " C " + "]");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println(" PROMEDIOS FINALES ");
        
        for (int i = 0; i < tCiudades; i++) {
            double acumulador = 0;
            for (int j = 0; j < tDias; j++) {
                acumulador += registrosTemp[i][j];
            }
            double Prom = acumulador / tDias;
            
            System.out.println("[" + listaCiudades[i] + "] MEDIA: " + Prom + " C");
        }
        
    }
    
}