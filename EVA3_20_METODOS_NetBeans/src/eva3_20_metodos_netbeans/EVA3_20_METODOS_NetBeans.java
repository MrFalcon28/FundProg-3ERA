
package eva3_20_metodos_netbeans;


public class EVA3_20_METODOS_NetBeans {

   
    public static void main(String[] args) {
        
        int datos [] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        imprimirArreglo(datos);
        
    }
    
    public static void imprimirArreglo(int [] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println();
    }
    
}
