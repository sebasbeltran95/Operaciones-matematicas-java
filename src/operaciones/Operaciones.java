package operaciones;

/**
 *
 * @author sebas
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1 = 2;
        int numero2 = 8;
        int resultado = 0;
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
        
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
        
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
        
        resultado = numero1 / numero2;
        System.out.println("El resultado de la division es: " + resultado);
    }
}
