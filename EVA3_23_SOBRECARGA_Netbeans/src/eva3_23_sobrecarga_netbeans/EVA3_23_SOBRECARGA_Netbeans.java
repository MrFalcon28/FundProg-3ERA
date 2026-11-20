
package eva3_23_sobrecarga_netbeans;


public class EVA3_23_SOBRECARGA_Netbeans {

    public static void main(String[] args) {
        
        imprimir("Hola mundo");
        imprimir("Hola","Diego");
        imprimir("28");
    }
    //SOBRECARGA DE METODOS
    
                       //FIRMA
    public static void imprimir(String mensaje){ //IMPRIMIR(String)
        System.out.println(mensaje);
    }
    
    public static void imprimir(String mensaje, String mensaje2){ //IMPRIMIR(String, String2)
        System.out.println(mensaje + " - " + mensaje2);
    }
    
    public static void imprimir(int mensaje){ //IMPRIMIR(int)
        System.out.println(mensaje);
    }
    
}
