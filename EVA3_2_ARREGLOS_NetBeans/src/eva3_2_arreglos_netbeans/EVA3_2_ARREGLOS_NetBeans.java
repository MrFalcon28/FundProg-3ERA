
package eva3_2_arreglos_netbeans;


public class EVA3_2_ARREGLOS_NetBeans {


    public static void main(String[] args) {
        
        int arreglo[], x, y; //SOLO ARREGLO ES UN ARREGLO
        //int[] arreglo, x, y; //TODOS SON ARREGLOS
        
        arreglo = new int[10];
        
        //arreglo[10] = 100; EL INDICE ES INCORRECGTO, 10 NO ES UNA POSICION VALIDA 
        
        //EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS
        //ES PARTICULAR EL CICLO FOR
        for(int i = 0; i < 10; i++){
            arreglo[1] = (int)(Math.random() * 100); //CASTING --> COMPATIBLES
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print(arreglo[1] + " - ");
        }
        
    }
    
}
