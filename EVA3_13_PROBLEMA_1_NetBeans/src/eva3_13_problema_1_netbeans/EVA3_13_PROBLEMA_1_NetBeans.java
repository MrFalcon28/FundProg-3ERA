
package eva3_13_problema_1_netbeans;

import java.util.Scanner;

public class EVA3_13_PROBLEMA_1_NetBeans {

    public static void main(String[] args) {
        
        
        //LLENAR UN ARREGLO DE 10 ELEMENTOS CON VALORES ALEATORIOS (ENTRE 0 Y 9).
        //SOLICITAR UN VALOR AL USUARIO Y MOSTRARLE CUANTAS VECES EL VALOR SE REPITE 
        //DENTRO DEL ARREGLO.
        
        
        Scanner Captu = new Scanner(System.in);
        
        int Valor;
        int Cont = 0;
        int[] repeti = new int[10];
        
        System.out.print("AREGLO:");
        for (int i = 0; i < repeti.length; i++) {
            repeti[i] = (int) (Math.random() * 10);
            System.out.print("[" + repeti[i] + "]"); 
        }
        System.out.println();
        
        System.out.println("INGRESA UN VALOR A BUSCAR (0 a 9): ");
        Valor = Captu.nextInt();
        
        for (int i = 0; i < repeti.length; i++) {
            if(repeti[i] == Valor){
                Cont++;
            }
        }
        System.out.println(" EL VALOR: " + Valor + " SE REPITE " + Cont + " VECES EN EL ARREGLO ");
        
    }
    
}
