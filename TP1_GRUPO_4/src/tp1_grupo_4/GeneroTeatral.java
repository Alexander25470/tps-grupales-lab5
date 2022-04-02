/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

/**
 *
 * @author alexb
 */
public class GeneroTeatral {
    private static int cont = 0;
    private int id;
    private String nombre;

    public GeneroTeatral(String nombre) {
        cont++;
        this.id = cont;
        this.nombre = nombre;
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
    
    @Override
    public String toString() {
        return "GeneroTeatral{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
