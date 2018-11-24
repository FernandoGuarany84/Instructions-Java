
package calculohipotenusa;


public class CalculoHipotenusa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 3.0, b = 4.0;
        
        //C é inicializado dinamicamente
        double c = Math.sqrt(a * a + b * b);
        
        //resultado
        System.out.println("A hipotenusa é " + c);
    }
    
}
