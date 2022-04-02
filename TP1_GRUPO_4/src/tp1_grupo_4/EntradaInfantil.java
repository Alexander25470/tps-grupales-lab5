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
public class EntradaInfantil extends Evento{
    private boolean souvenir;
    private int edad;
    private static final int edadInfantil = 8;
    
    @Override
    public String toString() {
        return "EventoInfantil{" + "souvenir=" + souvenir + '}';
    }

    public EntradaInfantil(boolean souvenir, String nombre, String TipoEvento, Date diaYFecha, int duracion, int edad) {
        super(nombre, TipoEvento, diaYFecha, duracion);
        this.souvenir = souvenir;
        this.edad = edad;
    }
    
    public boolean isSouvenir() {
        return souvenir;
    }

    public void setSouvenir(boolean souvenir) {
        this.souvenir = souvenir;
    }
    
    @Override
    public String infoHorarioYEdad() {
        return "Se realizan durante la mañana o tarde, en su mayoria se trata de un publico con una edad entre los 6 y 10 años";
    }

    @Override
    public double getPrecio() {
        return edad<=edadInfantil?250:500;
    }
    
    
}
