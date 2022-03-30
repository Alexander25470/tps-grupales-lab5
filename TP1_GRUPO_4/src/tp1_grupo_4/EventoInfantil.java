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
public class EventoInfantil extends Evento{
    private boolean souvenir;

    @Override
    public String toString() {
        return "EventoInfantil{" + "souvenir=" + souvenir + '}';
    }

    public EventoInfantil(boolean souvenir, String nombre, String TipoEvento, Date diaYFecha, float precio, int duracion) {
        super(nombre, TipoEvento, diaYFecha, precio, duracion);
        this.souvenir = souvenir;
    }
    
    public boolean isSouvenir() {
        return souvenir;
    }

    public void setSouvenir(boolean souvenir) {
        this.souvenir = souvenir;
    }
}
