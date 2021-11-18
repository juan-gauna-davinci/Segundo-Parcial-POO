package Primer_problema;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    //ATRIBUTOS

    public Estudiante(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<String>();

    //CONSTRUCTORES

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //METODOS

    public void imprimirMateriasAprobadas(){
        System.out.println("Materias Aprobadas");
        for (int i = 0; i < materiasAprobadas.size(); i++) {
            System.out.println(this.materiasAprobadas.get(i));
        }
    }

    public void imprimirMateriasInscriptas(){
        System.out.println("Materias Inscriptas");
        for (int i = 0; i < materiasInscriptas.size(); i++) {
            System.out.println(this.materiasInscriptas.get(i));
        }
    }

    //GETTER AND SETTER

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
