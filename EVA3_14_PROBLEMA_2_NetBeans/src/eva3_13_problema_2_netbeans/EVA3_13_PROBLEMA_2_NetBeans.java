
package eva3_13_problema_2_netbeans;

public class EVA3_13_PROBLEMA_2_NetBeans {

    public static void main(String[] args) {
        
        
        //LLENAR UN ARREGLO DE 10 ELEMENTOS CON VALORES ALEATORIOS. 
        //IMPRIMIR EL MÁS PEQUEÑO Y EL MÁS GRANDE.
        
        
        int[] arreglo = new int[10];
        
        System.out.println("ARREGLO: ");
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
        
        int menor = arreglo[0];
        int mayor = arreglo[0];
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < menor) {
                menor = arreglo[i];
            }
            if(arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        
        System.out.println("EL VALOR MAS GRANDE ES: " + "["+ mayor + "]");
        System.out.println("EL VALOR MAS PEQUEÑO ES:" + "["+ menor + "]");
        
    }
    
}