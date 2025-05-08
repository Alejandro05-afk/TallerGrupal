public class Empleados {
    private double salario;
    private int edad;
    private String nombre;
    public Empleados(double salario, int edad, String nombre) {
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


}
