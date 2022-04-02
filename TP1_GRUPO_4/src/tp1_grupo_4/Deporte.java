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
    private String tipo;
    private Clasificacion clasificacion;

    public Deporte(String tipo, Clasificacion clasificacion) {
        cont++;
        this.id = cont;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Tipo: "+ tipo + ", "+ clasificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
}
