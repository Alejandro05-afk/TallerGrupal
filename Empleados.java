public class Empleados {
    private int salario;
    private int edad;
    private String nombre;

    public Empleados(int salario, int edad, String nombre) {
        this.salario = salario;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    // Metodo para validar que el salario del empleado sea positivo
    public double validarSalarioEmpleado() {
        if (salario >= 0) {
            System.out.println("El salario es correcto puede seguir regidtrando al empleado");
        } else
            System.out.println("El salario es incorrecto");
        return 0;
    }

}






