
package menu;


public class Menu {

    
    public static void main(String[] args) 
    throws java.io.IOException{
        char choice;
        
        do{
            System.out.println("Ajuda sobre: ");
            System.out.println("1. if: ");
            System.out.println("2. switch: ");
            System.out.println("3.while: ");
            System.out.println("4. ddo-while: ");
            System.out.println("5. for\n ");
            System.out.println("Escolha um: ");
            choice = (char) System.in.read();
        }while(choice < '1' || choice > '5');
        System.out.println("\n");
        
        switch(choice) {
            case '1':
                System.out.println("O if: \n");
                System.out.println("if(condição) instrução; ");
                System.out.println("instrução else; ");
                break;
            
            case '2':
                System.out.println("A switch:\n");
                System.out.println("switch(expressão){");
                System.out.println("Constante case: ");
                System.out.println("Sequencia de instruções");
                System.out.println("break; ");
                System.out.println("// ... ");
                System.out.println("}");
                break;
                
            case '3':
                System.out.println("O while:\n ");
                System.out.println("while(condição) instrução");
                break;
            
            case '4':
                System.out.println("O do-while:\n ");
                System.out.println("do {");
                System.out.println("instrução;  ");
                System.out.println("} while(condição)");
                break;
                
            case '5':
                System.out.println("O for:\n ");
                System.out.println("for (init;condição;iteração)");
                System.out.println("intrução;");
                break;
        }
    }
    
}
