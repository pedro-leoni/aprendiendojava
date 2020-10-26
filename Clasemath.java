public class Clasemath {
    public static void main (String[] args){
    
    //double raiz=Math.sqrt(9);
    
    double num1=5.85F;
    int resultado=(int) Math.round(num1); //refundicion del redondeo
    
    System.out.println(resultado);    
    
    double base=5;
    double exponente=3;
    int resultado1=(int)Math.pow(base, exponente);

    System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + resultado1);

    }

}