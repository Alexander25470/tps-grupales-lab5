/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class EventoRecital extends Evento{
    private CategoriaRecital categoria;
    private Banda banda;

    @Override
    public String toString() {
        return "EventoRecital{" + "categoria=" + categoria + ", banda=" + banda + '}';
    }
    
    public EventoRecital(CategoriaRecital categoria, Banda banda, String nombre, String TipoEvento, Date diaYFecha, int duracion) {
        
        super(nombre, TipoEvento, diaYFecha, categoria.getPrecio(), duracion);
        this.categoria = categoria;
        this.banda = banda;
    }

    public CategoriaRecital getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaRecital categoria) {
        this.categoria = categoria;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Evento.cont = cont;
    }
    
    @Override
    public String caracteristicaHyE() {
        return "Se realizan durante la tarde o noche, en su mayoria se trata de un publico mayor a 18 años";
    }
    
}
