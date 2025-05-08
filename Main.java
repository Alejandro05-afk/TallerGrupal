import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de empleados:");
        int num = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea pendiente

        Empleados[] empleados = new Empleados[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad del empleado:");
            int edad = sc.nextInt();

            System.out.println("Ingrese el salario del empleado:");
            int salario = sc.nextInt();
            sc.nextLine();

            if (salario >= 0) {
                System.out.println("El salario es correcto, puede seguir registrando al empleado.");
            } else {
                System.out.println("El salario es incorrecto, ingrese un valor válido.");
                continue; // Evita la creación del objeto con un salario inválido
            }

            empleados[i] = new Empleados(salario, edad, nombre);
        }

        // Mostrar información de los empleados
        System.out.println("\nInformación de los empleados:");
        for (Empleados empleado : empleados) {
            if (empleado != null) {
                empleado.mostrarInformacion();
            }
        }

        sc.close();
    }
}