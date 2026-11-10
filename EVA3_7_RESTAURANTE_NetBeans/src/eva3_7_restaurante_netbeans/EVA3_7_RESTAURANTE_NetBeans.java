package eva3_7_restaurante_netbeans;

import java.util.Scanner;

public class EVA3_7_RESTAURANTE_NetBeans {

    public static void main(String[] args) {
        
//IMPRIMIR EL MENU DE UN RESTAURANTE, 10 PRODUCTOS, CADA UNO CON SU PRECIO (CON DECIMALES)
        //2 ARREGLOS (COMIDA Y PRECIO)
        //PEDIR CUANTA COMIDA Y CUANTO SE PAGARA
        
        Scanner Capt = new Scanner(System.in);
        
        String Comida[] = new String[10];
        double Precio[] = new double[10];
        
        
        Comida[0] = "Soda";       Precio[0] = 20.50;
        Comida[1] = "Koka";       Precio[1] = 22.00;
        Comida[2] = "Hamburguesa"; Precio[2] = 75.00;
        Comida[3] = "Tacos";      Precio[3] = 60.00;
        Comida[4] = "Pizza";      Precio[4] = 90.00;
        Comida[5] = "Hot Dog";    Precio[5] = 35.00;
        Comida[6] = "Agua";       Precio[6] = 15.00;
        Comida[7] = "Papas";      Precio[7] = 30.50;
        Comida[8] = "Helado";     Precio[8] = 25.00;
        Comida[9] = "Pastel";     Precio[9] = 40.00;
        
       
        System.out.println("---MENU DEL RESTAURANTE---");
        for (int i = 0; i < Comida.length; i++) {
            System.out.println((i + 1) + ". " + Comida[i] + " - $" + Precio[i]);
        }
        
       
        System.out.println("BIENVENIDO, SELECCIONA LO QUE DESEAS CONSUMIR: (1-10)");
        int opcion = Capt.nextInt();
        
        System.out.println("¿CUANTAS PIEZAS TE LLEVARAS?");
        int cantidad = Capt.nextInt();
        
       
        int indice = opcion - 1;
        double total = Precio[indice] * cantidad;
        
        
        System.out.println("---TICKET DE COMPRA---");
        System.out.println("PRODUCTO: " + Comida[indice]);
        System.out.println("CANTIDAD: " + cantidad);
        System.out.println("TOTAL: $" + total);
        
    }
    
}