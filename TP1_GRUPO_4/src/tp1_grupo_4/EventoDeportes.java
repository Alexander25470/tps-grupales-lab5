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
public class EventoDeportes extends Evento{
    private Deporte deporte;

    @Override
    public String toString() {
        return "EventoDeportes{" + "deporte=" + deporte + '}';
    }

    public EventoDeportes(Deporte deporte, String nombre, String TipoEvento, Date diaYFecha, float precio, int duracion) {
        super(nombre, TipoEvento, diaYFecha, precio, duracion);
        this.deporte = deporte;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    
    @Override
    public String caracteristicaHyE() {
        return "No tiene una tendencia hacia algun horario, publico de todas las edades";
    }
    
    
}
