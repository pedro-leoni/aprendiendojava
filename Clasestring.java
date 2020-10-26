import java.util.Scanner;

public class Clasestring {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String usuario1, contrasena1;
        String mi_nombre="pedro leoni";
        String error="PELEA DE CROMOSOMAS ";
        String error_resumen=error.substring(9, 19); //estoy recortando la cadena en el caracter 0 al 5
        System.out.println("ingrese usuario");
        String usuario = sc.next();
        System.out.println("ingrese contrasena");
        String contrasena = sc.next();

    do{ 
         System.out.println("ingrese usuario");
        usuario1 = sc.next();
        System.out.println("ingrese contrasena");
        contrasena1 = sc.next();
        if (!(usuario.equals(usuario1) && contrasena.equals(contrasena1))){ //(!(texto)) niega lo que esta por escribirse, invierte
            System.out.print(error);
        }
        
    
    } while(!(usuario.equals(usuario1) && contrasena.equals(contrasena1)));

        
        System.out.println("bienvenido " + mi_nombre + " bolsa de " + error_resumen);
        
        
}
}    



//  
        // String contrasena="123456";
           // System.out.println("ingrese nombre de usuario");
        // String usuario= sc.next();
        // System.out.println( "ingrese contrasena");
        // String contrasena1= sc.next();
        // System.out.println(contrasena1.equals(contrasena));
        
        
    //     System.out.println(mi_nombre);
    //     System.out.println(mi_nombre.length());
    //     System.out.println(mi_nombre.charAt(0));
        


    // } 