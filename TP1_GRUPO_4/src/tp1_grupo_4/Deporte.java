/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

/**
 *
 * @author alexb
 */
public class Deporte {
    static int cont = 0;
    private int id;
    private String nombre;
    private Clasificacion clasificacion;

    public Deporte(int id, String nombre, Clasificacion clasificacion) {
        cont++;
        this.id = cont;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Deporte{" + "id=" + id + ", nombre=" + nombre + ", clasificacion=" + clasificacion + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
}
