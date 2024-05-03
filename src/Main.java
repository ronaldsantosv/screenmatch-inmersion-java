import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");

        // Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        // Impresiones básicas sobre la película
        System.out.println("Película: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);

        // Cálculo de la media de evaluación
        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        // Condición de popularidad
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        // Creación del objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // Recogida de notas del usuario
        /* for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota que le darías a Matrix:");
            try {
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionUsuario += notaMatrix;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                teclado.next();  // Limpia el buffer del escáner
            }
            */

        // Notas del usuario utilizando un bucle while
        int i = 0;
        while (i < 3) {
            System.out.println("Ingresa la nota que le darías a Matrix:");
            try {
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionUsuario += notaMatrix;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                teclado.next();  // Limpia el buffer del escáner
            }
        }


        // Cierre del Scanner
        teclado.close();

        // Cálculo y muestra de la media de las evaluaciones de usuario
        System.out.println("La media de la película Matrix calculada por el usuario es: " + (mediaEvaluacionUsuario / 3));
    }
}


