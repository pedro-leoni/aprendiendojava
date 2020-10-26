//import java.util.Scanner; el scanner esta aplicado en otros archivos
import javax.swing.JOptionPane;

public class Entradaysalidadatos {
    public static void main(String[] args){
        // System.out.println("ingrese su nombre");
        // Scanner sc=new Scanner(System.in); //constructor keyboard in 
        // String nombre = sc.nextLine();
        // System.out.println("ingrese edad");
        // int edad = sc.nextInt();
        // System.out.println ("hola " + nombre + "  tenes " + edad + " anios");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        String edad = JOptionPane.showInputDialog("ingrese su edad");
        int edad2 = Integer.parseInt(edad);
        System.out.println ("hola " + nombre + "  tenes " + edad2 + " anios" + "y el anio que viene vas a tener " + (edad2+1));

    }    
}
