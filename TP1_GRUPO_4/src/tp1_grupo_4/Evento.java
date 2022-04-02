package tp1_grupo_4;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public abstract class Evento implements IEvento{

    static int cont = 0;
    private int numero;
    private String nombre;
    private String TipoEvento;
    private LocalDateTime fechaYHora;

    public Evento(String nombre, String TipoEvento, LocalDateTime fechaYHora, int duracion) {
        cont++;
        this.numero = cont;
        this.nombre = nombre;
        this.TipoEvento = TipoEvento;
        this.fechaYHora = fechaYHora;
        this.duracion = duracion;
    }

    private int duracion;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String TipoEvento) {
        this.TipoEvento = TipoEvento;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nro Entrada: " + numero +", Nombre: " + nombre + ", Tipo de evento: " + TipoEvento + 
                ", Dia y Hora: " + fechaYHora + ", Duracion: " + duracion +" HS, ";
    }

}