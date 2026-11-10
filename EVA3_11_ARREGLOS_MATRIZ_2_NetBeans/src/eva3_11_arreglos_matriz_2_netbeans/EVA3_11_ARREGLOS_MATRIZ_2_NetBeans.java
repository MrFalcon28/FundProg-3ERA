
package eva3_11_arreglos_matriz_2_netbeans;


public class EVA3_11_ARREGLOS_MATRIZ_2_NetBeans {
    
    public static void main(String[] args) {
        
        int cubo[][][] = new int[2][3][4]; 
        
        for (int i = 0; i < cubo.length; i++) { //1ERA DIMENSION
            for (int j = 0; j < cubo[i].length; j++) { //2DA DIMENSION
                for (int k = 0; k < cubo[i][j].length; k++) { //3ERA DIMENSION
                    cubo[i][j][k] = (int) (Math.random() * 100); // CORREGIDO: de [i][k][k] a [i][j][k]
                }
            }
        }
        
        //COMO MOSTRAMOS LOS VALORES?
        for (int i = 0; i < cubo.length; i++) { //1ERA DIMENSION
            for (int j = 0; j < cubo[i].length; j++) { //2DA DIMENSION
                for (int k = 0; k < cubo[i][j].length; k++) { //3ERA DIMENSION
                    
                    System.out.print("[" + cubo[i][j][k] + "]"); // CORREGIDO: de [i][j][k] (estaba bien aquí, pero faltaba arriba)
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    
}