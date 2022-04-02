/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

import java.time.LocalDateTime;
/**
 *
 * @author Usuario
 */
public class EntradaDeporte extends Evento{
    private Deporte deporte;

    public EntradaDeporte(Deporte deporte, String nombre, LocalDateTime fechaYHora, int duracion) {
        super(nombre, "Deporte", fechaYHora, duracion);
        this.deporte = deporte;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    
    @Override
    public String infoHorarioYEdad() {
        return "No tiene una tendencia hacia algun horario, publico de todas las edades";
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        switch(deporte.getTipo())
        {
            case "futbol":
                precio = 300;
                break;
            case "rugby":
                precio = 450;
                break;
            case "hockey":
                precio = 380;
                break;
        }
        if(deporte.getClasificacion().getNombre().compareToIgnoreCase("internacional")==0)
        {
            precio *=1.3;
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + deporte + ", Precio: $"+ getPrecio();
    }
    
    
    
}
