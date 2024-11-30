/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoale;
import java.util.Scanner;

public class ProyectoAle  {
    // Definir el máximo de asistentes para cada clase
    private static final int maximoCupos = 30;
    
    // Arreglos para llevar el control de los asistentes de cada clase
    private static String[] clase7pm = new String[maximoCupos];
    private static String[] clase8pm = new String[maximoCupos];
    
    // Contador para saber cuantos personas han resevado la clase 
    private static int asistentes7pm = 0;
    private static int asistentes8pm = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menú de opciones
        System.out.println("Bienvenido a la sala de reseva de clases de yoga");
        System.out.println("A que hora le gustaria resevar la clase?");
        System.out.println("1. Clase 7:00 pm");
        System.out.println("2. Clase 8:00 pm");
        System.out.print("Selecciona la opción (1 o 2): ");
        
        int opcion = scanner.nextInt();
        
        // Verificar la opción seleccionada
        if (opcion == 1) {
            reservarClase(7, scanner);
        } else if (opcion == 2) {
            reservarClase(8, scanner);
        } else {
            System.out.println("esta opcion no esta válida. Por favor selecciona 1 o 2.");
        }

        scanner.close();
    }

    // Método para manejar la reserva de una clase
    private static void reservarClase(int hora, Scanner scanner) {
        String[] clase = (hora == 7) ? clase7pm : clase8pm;
        int asistentes = (hora == 7) ? asistentes7pm : asistentes8pm;
        
        if (asistentes < maximoCupos) {
            // Solicitar el nombre y el numero del empleado
            scanner.nextLine();
            System.out.print("Introduce tu nombre para realizar la reservacion: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduce tu numero de telefono: ");
            String telefono = scanner.nextLine();
            System.out.print("Introduce tu correo electronico: ");
            String correo = scanner.nextLine();
            
            // Registrar al empleado en la clase seleccionada
            clase[asistentes] = nombre;
            asistentes++;
            
            // Actualizar el contador de asistentes
            if (hora == 7) {
                asistentes7pm++;
            } else {
                asistentes8pm++;
            }

            System.out.println("La reserva fue realizada con éxito para la clase de Yoga a las " + hora + ":00 pm!");
            System.out.println("recuerda estar 10 minutos antes, " + nombre + "!");
        } else {
            System.out.println("Lo siento, la clase de Yoga a las " + hora + ":00 pm ya está llena.");
            System.out.println("¿Te gustaría intentar reservar para la otra hora?");
        }
    }
}


