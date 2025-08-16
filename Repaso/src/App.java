import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Array (Arreglo) - Estrucutra indexada de tamaño fijo
        //Ejercicio de calificaciones

        //Declaramos un arreglo de 5 calificaciones
        double[]  calificaciones = new double[5];
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        //Pedimos al usuario  calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble(); // Guardamos la calificación en el arreglo
            suma += calificaciones[i]; // Suma para calcular promedio despues
        }

        //Calculamos el promedio
        double promedio = suma / calificaciones.length;

        //Mostramos el resultado
        System.out.printf("El promedio de las calificaciones es: " + promedio);

        
    }
    
}
