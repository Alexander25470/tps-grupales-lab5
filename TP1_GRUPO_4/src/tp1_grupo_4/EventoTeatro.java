/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class EventoTeatro extends Evento{
    private GeneroTeatral generoTeatral;
    private List<Actor> actores;

    @Override
    public String toString() {
        return "EventoTeatro{" + "generoTeatral=" + generoTeatral + ", actores=" + actores + '}';
    }

    public EventoTeatro(GeneroTeatral generoTeatral, List<Actor> actores, String nombre, String TipoEvento, Date diaYFecha, float precio, int duracion) {
        super(nombre, TipoEvento, diaYFecha, precio, duracion);
        this.generoTeatral = generoTeatral;
        this.actores = actores;
    }

    public GeneroTeatral getGenero() {
        return generoTeatral;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public void setGenero(GeneroTeatral generoTeatral) {
        this.generoTeatral = generoTeatral;
    }
}
