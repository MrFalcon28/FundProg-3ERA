
package eva3_6_captura_netbeans;

import java.util.Scanner;


public class EVA3_6_CAPTURA_NetBeans {

   
    public static void main(String[] args) {
       
        Scanner Capt = new Scanner(System.in);
        
        String nombres[];
        int edad[];
        int cant;
        
        System.out.println("CANTIDAD DE CLIENTES A CAPTURAR");
        cant = Capt.nextInt();
        Capt.nextLine();
        
        nombres = new String[cant];
        edad = new int[cant];
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println("INTRODUCE EL NOMBRE DEL CLIENTE: ");
            nombres[i] = Capt.nextLine();
            System.out.println("INTRODUCE LA EDAD DEL CLIENTE: ");
            edad[i] = Capt.nextInt();
        }
        System.out.println("DATOS CAPTURADOAS: ");
        for(int i = 0; i < nombres.length; i++){
            System.out.println("NOMBRES: " + nombres[i] + "EDAD: " + edad[i]);
        }
        
    }
    
}
