public class Empleados {

        private int salario;
        private int edad;
        private String nombre;

        public Empleados(int salario, int edad, String nombre) {
            this.salario = salario;
            this.edad = edad;
            this.nombre = nombre;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: " + salario);
        }
    }







