
package eva3_18_metodos_netbeans;


public class EVA3_18_METODOS_NetBeans {

    public static void main(String[] args) {
        
        //LLAMAR O INVOCAR EL METODO
        mostrarMensaje("HOLA MUNDO!!!!!!");
        mostrarMensaje("DIEGO FALCON");
        mostrarMensaje("FUNDAMENTOS DE PROGRAMACION");
        mostrarMensaje("SISTEMAS COMPUTACIONALES");
        
        //QUE HACER COB METODOS QUE REGRESAN VALORES
        //1. RECUPERAR EL VALOR PARA USARLO VARIA VECES
        int resultado = sumar(10,20);
        System.out.println("Suma de 10 + 20 = " + resultado);
        
        //2. USARLO DIRECTAMENTE
        System.out.println("Suma de 10 + 20 = " + sumar(10,20));
        
        //3. NO IMPORTA EL VALOR DE RETORNO
        sumar(10,20);
        
        
    }
    
    //MODIFICADORES DE VALOR DE RETORNO
                        //DEBE SER UN VERBO INIFINITIVO
                        //VARIAS PALABRAS: INICIAR EN MINUSCULAS, DEMAS INICIAR EN MAYUS
    public static void mostrarMensaje(String mensaje) //CABECERA
    
    { //CUERPO DEL METODO O IMPLEMENTACION
        System.out.println(mensaje);
        
    }
    
    public static int sumar(int val1, int val2){
        
        int resu = val1 + val2;
        return resu;
        
    }
    
}
