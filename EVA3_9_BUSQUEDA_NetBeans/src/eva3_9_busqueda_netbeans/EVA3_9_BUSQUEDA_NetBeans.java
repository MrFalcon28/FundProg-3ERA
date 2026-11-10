
package eva3_9_busqueda_netbeans;

import java.util.Scanner;

public class EVA3_9_BUSQUEDA_NetBeans {

    public static void main(String[] args) {
        
        Scanner Capt = new Scanner(System.in);

        int valor;
        int[] valores = new int[10];
        boolean encontrado; 
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100); 
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("[" + valores[i] + "]"); 
        }

        do {
            encontrado = false;
            
            // PEDIR VALOR
            System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO");
            valor = Capt.nextInt();
            Capt.nextLine();
            
            // BUSCAR
            for (int i = 0; i < valores.length; i++) {
                if (valor == valores[i]) { // EL VALOR ESTA EN EL ARREGLO
                    System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICION: " + i);
                    encontrado = true;
                    break; 
                }
            }
            
            // SI ESTA EN EL ARREGLO, SALIMOS DEL CICLO
            
        }while(!encontrado);
        
    }
    
}