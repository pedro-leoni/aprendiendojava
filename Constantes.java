import java.util.Scanner;

public class Constantes {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese valor en cm");

        int x = sc.nextInt(); 
       
        final double apulgadas=2.54;
        
        String nombre = " pulgadas"; // fue una prueba y quedo, podria tranquilamente solo usar las comillas en la sentencia 
        System.out.println(x/apulgadas + nombre );


    }
}
//el calculo esta mal, solo esta hecho a fin de demostrar un ejemplo de uso de
// contstantes.. Aprovecho para empezar a practicar el metodo scanner que sirve
// para que el codigo lea nuestro teclado 