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
public class EntradaTeatro extends Evento{
    private GeneroTeatral generoTeatral;
    private List<Actor> actores;

    @Override
    public String toString() {
        return "EventoTeatro{" + "generoTeatral=" + generoTeatral + ", actores=" + actores + '}';
    }

    public EntradaTeatro(GeneroTeatral generoTeatral, List<Actor> actores, String nombre, String TipoEvento, Date diaYFecha, int duracion) {
        super(nombre, TipoEvento, diaYFecha, duracion);
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
    
    @Override
    public String infoHorarioYEdad() {
        return "Con tendendia a realizarce durante la noche, en su mayoria se trata de un publico mayor a 18 años";
    }

    @Override
    public double getPrecio() {
        return 1350.50;
    }
    
}
