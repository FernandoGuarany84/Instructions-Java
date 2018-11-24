
package velocidadeluz;


public class VelocidadeLuz {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int velocidadeDaLuz;
        long dias;
        long segundos;
        long distancia;
        
        //Velocidade aproximada da luz em quilometros quadrados.
        velocidadeDaLuz = 18000000;
        
        //dizendo em quantos dias
        dias = 1000;
        
        //transformando em segundos
        segundos = dias * 24 * 60 * 60;
        
        //Vamos a distancia
        distancia = velocidadeDaLuz * segundos;
        
        System.out.print("Em " + dias + " Dias");
        System.out.print(" a luz viajará a uma velociodade de ");
        System.out.println(distancia + " quilometros por segundo.");
        
        
    }
    
}
