import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados");
        int num = sc.nextInt();
        Empleados[] empleados = new Empleados[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = sc.next();
            System.out.println("Ingrese ls edad del empleado");
            int edad = sc.nextInt();
            System.out.println("Ingrese el edad del empleado");
            double salario = sc.nextDouble();

            empleados[i]= new Empleados(nombre,edad,salario);
        }

            }


        }



    }
}