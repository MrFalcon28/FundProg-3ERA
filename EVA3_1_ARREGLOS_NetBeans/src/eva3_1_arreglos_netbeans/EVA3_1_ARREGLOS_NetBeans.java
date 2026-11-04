
package eva3_1_arreglos_netbeans;


public class EVA3_1_ARREGLOS_NetBeans {

    public static void main(String[] args) {
        
        //ARREGLO ES UNA ESTRUCTURA DE DATOS
        //ES UNA SECUENCIA DE VALORES
        //TODOS LOS DATOS SON DEL MISMO TIPO
        //NO CAMBIA DE TAMAÑO (INMUTABLE)
        //EL ACCESO ES POR INDICES (ACCESO ALEATORIO)
        
        int[] arreglo; //SOLO DECLARE EL ARREGLO, TODAVIA NO EXISTE
        
        //ESPECIFICAR TAMAÑO
        arreglo = new int[10]; //APARTIR  DE AQUI, IMPORTA MUCHO CONOCER EL TAMAÑO DE LOS DATOS
       //int[] arreglo = new [10];
       //ACCESO POR INDICES
       //EN JAVA EL PRIMER ELEMENTO ESTA EN LA POSICION 0
       //EL ULTIMO EN LA POSICION N = 1, DONDE N EN LA CANTIDAD DE ELEMENTOS
       //0 1 2 3 4 5 6 7 8 9
       
       arreglo[0] = 100;
       arreglo[1] = 200;
       arreglo[2] = 300;
       arreglo[3] = 400;
       arreglo[4] = 500;
       arreglo[5] = 600;
       arreglo[6] = 700;
       arreglo[7] = 800;
       arreglo[8] = 900;
       arreglo[9] = 1000;
       
       System.out.println("arreglo[0] = " + arreglo[0]);
       System.out.println("arreglo[1] = " + arreglo[1]);
       System.out.println("arreglo[2] = " + arreglo[2]);
       System.out.println("arreglo[3] = " + arreglo[3]);
       System.out.println("arreglo[4] = " + arreglo[4]);
       System.out.println("arreglo[5] = " + arreglo[5]);
       System.out.println("arreglo[6] = " + arreglo[6]);
       System.out.println("arreglo[7] = " + arreglo[7]);
       System.out.println("arreglo[8] = " + arreglo[8]);
       System.out.println("arreglo[9] = " + arreglo[9]);

       
    }
    
}
