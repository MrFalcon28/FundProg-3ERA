
package eva3_4_menu_netbeans;


public class EVA3_4_MENU_NetBeans {


    public static void main(String[] args) {
        
        String[] menu = {"TACOS", "TORTAS", "TAMALES", "TLACOYOS", "TLAYUDAS", "PIZZA"};
                          //0         1         2           3           4          5
        System.out.println("CANTIDAD DE ELEMETNOS DEL ARREGLO: " + menu.length);
        
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
        }
    }
    
}
