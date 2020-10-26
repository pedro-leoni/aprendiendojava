import java.util.Scanner;


public class Condicionales {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad=sc.nextInt();
        
        if (edad>=18){
            System.out.println("usted es mayor de edad");

        } else {
            System.out.println("usted es menor de edad");
        }
        System.out.println("gracias por pasar"); // excede a cualquier condicion porque esta por fuera del if

    }// puedo agregar ELSE IF segun cuantas condiciones quiera
    
    
}
