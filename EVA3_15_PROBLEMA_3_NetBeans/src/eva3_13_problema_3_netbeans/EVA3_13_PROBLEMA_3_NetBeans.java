
package eva3_13_problema_3_netbeans;

public class EVA3_13_PROBLEMA_3_NetBeans {

    public static void main(String[] args) {
        
        
        //CREAR UNA MATRIZ DE 5 X 5, LLENARLA CON VALORES ALEATORIOS.
        //IMPRIMIRLA DE MAMERA NORMAL Y LUEGO EN ORDEN INVERSO.
        
        
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("MATRIZ INVERSIVA");
        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        
    }
    
}