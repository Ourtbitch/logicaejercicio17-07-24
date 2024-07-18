import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {


/*Ejercicio 1: Números Primos Gemelos
Los números primos gemelos son pares de números primos que tienen una diferencia de 2. Por ejemplo, (3, 5) y (11, 13)
 son pares de números primos gemelos. Escribe un programa en Java que encuentre y muestre todos los pares de números
  primos gemelos en un rango dado por el usuario.

Instrucciones:
Solicita al usuario que ingrese el rango (dos números enteros: inicio y fin).
Encuentra todos los pares de números primos gemelos dentro de ese rango.
Muestra los pares encontrados. 
Ejemplo de Salida:
plaintext
Copy code
Ingrese el inicio del rango: 1
Ingrese el fin del rango: 20
Los pares de números primos gemelos son:
(3, 5)
(5, 7)
(11, 13)
(17, 19)*/
        

       int j=0;
    //definimos las variables
       
       Vector<Integer> numerosprimos = new Vector<>();
       // deifnimos el scanner
       Scanner cb = new Scanner(System.in);
       // pedimos por consola los datos iniciales para n"
       System.out.println("Ingrese el valor de n para iniciar los primos gemelos: ");
       int ni = cb.nextInt();
       System.out.println("Ingrese el valor de n para finalizar la busqueda de primos gemelos: ");
       int nf = cb.nextInt();
       //usamos un for para recorrer el inicio y fin de n que nos piden"
       for (int i = ni; i <= nf; i++) {
            if (esPrimo(i)) {
                numerosprimos.add(i);
            }
        } 
        System.out.println("Los pares de números primos gemelos son:");

        for (int i = 0; i < numerosprimos.size()-1; i++) {
            int primo1 = numerosprimos.get(i);
            int primo2 = numerosprimos.get(i+1);
            if (primo2 - primo1 == 2) {
                System.out.println("(" + primo1 + ", " + primo2 + ")");
            }
        }
       }
       
    


    //creamos el metodo es PRIMO
    public static boolean esPrimo(int num) {
        // si el numero es menor o igual que 1 rtorna falso osea que noe s primo
        if(num<=1){
            return false;
        }
        //aqui hacemos un contador de 2 hasta la raiz cuadrada
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num %i ==0) {
                return false;
            }
        }
        return true;
    }

}
