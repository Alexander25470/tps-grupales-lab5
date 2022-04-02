/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class EntradaTeatro extends Evento{
    private GeneroTeatral generoTeatral;
    private List<Actor> actoresPrincipales;

    public EntradaTeatro(GeneroTeatral generoTeatral, List<Actor> actoresPrincipales, String nombre, LocalDateTime fechaYHora, int duracion) {
        super(nombre, "Teatro", fechaYHora, duracion);
        this.generoTeatral = generoTeatral;
        this.actoresPrincipales = actoresPrincipales;
    }

    public GeneroTeatral getGenero() {
        return generoTeatral;
    }

    public GeneroTeatral getGeneroTeatral() {
        return generoTeatral;
    }

    public void setGeneroTeatral(GeneroTeatral generoTeatral) {
        this.generoTeatral = generoTeatral;
    }

    public List<Actor> getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(List<Actor> actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
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
    
    @Override
    public String toString() {
        return super.toString()+ "genero teatral: " + generoTeatral.getNombre() + ", actores:" + actoresPrincipales + ", Precio: $" + getPrecio();
    }
    
}
