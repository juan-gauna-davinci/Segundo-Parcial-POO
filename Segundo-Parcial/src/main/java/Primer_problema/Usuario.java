package Primer_problema;

public abstract class Usuario {

    //ATRIBUTOS

    int dni;
    String nombre;
    String apellido;

    //CONSTRUCTORES

    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //METODOS

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "̈El dni del " + Usuario.this +  " es "  + this.dni;
    }
}
