
package eva3_13_problema_4_netbeans;

import java.util.Scanner;

public class EVA3_13_PROBLEMA_4_NetBeans {

    public static void main(String[] args) {
        
        // CAPTURAR LA ASISTENCIA DIARIA DE 3 ESTUDIANTES DURANTE UNA SEMANA 
        // (LUNES A VIERNES). 
        //LA ASISTENCIA SE INDICA CON UN 1 (UNO), LA INASISTENCIA 
        // CON 0 (CERO). PARA CADA ESTUDIANTE INDICAR LA CANTIDAD DE ASISTENCIAS 
        //E INASISTENCIAS.
        
        Scanner Captu = new Scanner(System.in);
       
        int[][] registro = new int[3][5];
        String[] semana = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES"};
        
        for (int i = 0; i < 3; i++) {
            System.out.println(" [ALUMNO " + (i+ 1) + "] ");
            for (int j = 0; j < 5; j++) {
                System.out.print("ASISTENCIO EL " + semana[j] + "?" + " (1 = Si, 0 = No): ");
                registro[i][j] = Captu.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("REPORTE DE ASISTENCIAS");
        
        for (int i = 0; i < 3; i++) {
            int contAsist = 0;
            int contFaltas = 0;
            
            for (int j = 0; j < 5; j++) {
                if (registro[i][j] == 1) {
                    contAsist++;
                } else {
                    contFaltas++;
                }
            }
            
            System.out.println(" [ALUMNO " + (i + 1) + "] " + " ASISTENCIAS: " + 
                    contAsist + " / INASISTENCIAS: " + contFaltas);
        }
        
    }
    
}