package tp1_grupo_4;

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
    private Date diaYFecha;

    public Evento(String nombre, String TipoEvento, Date diaYFecha, int duracion) {
        cont++;
        this.numero = cont;
        this.nombre = nombre;
        this.TipoEvento = TipoEvento;
        this.diaYFecha = diaYFecha;
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

    public Date getDiaYFecha() {
        return diaYFecha;
    }

    public void setDiaYFecha(Date diaYFecha) {
        this.diaYFecha = diaYFecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", TipoEvento=" + TipoEvento + ", diaYFecha=" + diaYFecha + ", duracion=" + duracion + '}';
    }

}
