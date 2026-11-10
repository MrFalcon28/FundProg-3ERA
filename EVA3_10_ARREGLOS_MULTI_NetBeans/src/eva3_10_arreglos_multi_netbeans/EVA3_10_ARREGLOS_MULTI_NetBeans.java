
package eva3_10_arreglos_multi_netbeans;


public class EVA3_10_ARREGLOS_MULTI_NetBeans {
    
    public static void main(String[] args) {
        
        //UN ARREGLO PUEDE TENER MULTIPLES DIMENSIONES
        //ARREGLO DE UNA DIMENSION:
        int datos[] = new int[10];//[][][][][]....
        
        //ARREGLO DE DOS DIMENSIONES (MATRIZ)
                                      //FILAS, COLUMNAS
        int matriz[][] = new int[3][5];
        /*
        [][][]
        [][][]
        [][][]
        */
        
        for (int i = 0; i < matriz.length; i++) { //FILAS
             for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                matriz[i][j] = (int)(Math.random() * 100);
            }
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
}
