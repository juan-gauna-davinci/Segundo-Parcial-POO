package Primer_problema;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor(100,"jhon","doe");
        Estudiante juan = new Estudiante(43817276,"juan","gauna","Analista");

        juan.getMateriasAprobadas().add(0,"Progamacion Web");
        juan.getMateriasAprobadas().add(1,"Diseño Ux");
        juan.getMateriasAprobadas().add(2,"Sistemas Empresariales");

        juan.getMateriasInscriptas().add(0,"Programacion orientada a objetos");
        juan.getMateriasInscriptas().add(1,"Sistemas Organizacionales");

        System.out.println(juan.getMateriasAprobadas());
        System.out.println("---------------------------");
        System.out.println(juan.getMateriasInscriptas());
        System.out.println("---------------------------");
        juan.imprimirMateriasAprobadas();
        System.out.println("---------------------------");
        juan.imprimirMateriasInscriptas();
        System.out.println("---------------------------");

    }
}
