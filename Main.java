import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad,salario;
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad del empleado");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el salario del empleado");
        salario = sc.nextInt();
        Empleados empleados = new Empleados ();
        empleados.nombre(salario,edad,nombre);

    }
}