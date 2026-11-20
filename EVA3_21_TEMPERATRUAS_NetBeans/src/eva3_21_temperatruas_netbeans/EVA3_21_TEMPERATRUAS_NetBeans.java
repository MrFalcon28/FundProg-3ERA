package eva3_21_temperatruas_netbeans;

import java.util.Scanner;

public class EVA3_21_TEMPERATRUAS_NetBeans {

    public static void main(String[] args) {
        
        Scanner Capt = new Scanner(System.in);
        
        double centi = capturarTemp("CAPTURA LOS GRADOS CENTIGRADOS: ");
        
        double fahrenheit = convertirCaF(centi);
        
        System.out.println(centi + " C = " + fahrenheit + " F ");
        System.out.println(fahrenheit + " F = " + convertirFaC(fahrenheit) + " C ");
        System.out.println(centi + " C = " + convertirCaK(centi) + " K ");

    }
    
    public static double convertirCaF(double centi){
        double resu = (centi * 1.8) + 32;
        return resu;
    }
    
    public static double convertirFaC(double fahrenheit){
        double resu = (fahrenheit - 32) * 5.0 / 9.0;
        return resu;
    }
    
    public static double convertirCaK(double cen){
        double resu = cen + 273.15;
        return resu;
    }
    
    public static double capturarTemp(String mensaje){
        Scanner Capt = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = Capt.nextDouble();
        return valor;
    }
}