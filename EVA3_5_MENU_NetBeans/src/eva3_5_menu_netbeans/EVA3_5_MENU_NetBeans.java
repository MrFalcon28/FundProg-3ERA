
package eva3_5_menu_netbeans;

import java.util.Scanner;


public class EVA3_5_MENU_NetBeans {

    
    public static void main(String[] args) {
        
        String[] menu = {"VENTAS", "CLIENTES", "PROVEEDORES", "SALIR"};
        System.out.println("CANTIDAD DE ELEMETNOS DEL ARREGLO: " + menu.length);
        
        for(int i = 0; i < menu.length; i++){
            System.out.println(i + " - ");
        }
        Scanner Capt = new Scanner(System.in);
        System.out.println("-----------MENU-----------");
        System.out.println("SELECCIONA UNA OPCION");
        
        int sel = Capt.nextInt();
        switch(sel){
           case 0:
               System.out.println("MODULO DE VENTAS");
               break;
           case 1:
               System.out.println("MODULO DE CLIENTES");
               break;
           case 2:
               System.out.println("MODULO DE PROVEEDORES");
               break;
           case 3:
               System.out.println("SALIR");
               break;
           default:
               System.out.println("OPCIONES INCORRECTO");
        }
   
    }
}
