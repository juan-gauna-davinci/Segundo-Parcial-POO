package Primer_problema;

import java.util.ArrayList;

public class Profesor extends Usuario{

    //ATRIBUTOS

     private ArrayList<String> comisiones = new ArrayList<String>();

    //CONSTRUCTORES

    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    //METODOS

    public void imprimirComisiones(){
        System.out.println("Comisiones");
        for (int i = 0; i < comisiones.size() ; i++) {
            System.out.println(this.comisiones.get(i));
        }
    }

    //GETTER AND SETTER

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }
}
