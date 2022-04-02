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
public class EntradaRecital extends Evento implements IEvento{
    private CategoriaRecital categoria;
    private Banda banda;

    public EntradaRecital(CategoriaRecital categoria, Banda banda, String nombre,LocalDateTime fechaYHora, int duracion) {
        super(nombre, "Recital", fechaYHora, duracion);
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
    public String infoHorarioYEdad() {
        return "Se realizan durante la tarde o noche, en su mayoria se trata de un publico mayor a 18 años";
    }

    @Override
    public double getPrecio() {
        return categoria.getPrecio();
    }

    @Override
    public String toString() {
        return "EntradaRecital{" + "categoria=" + categoria + ", banda=" + banda + ", precio="+categoria.getPrecio()+'}';
    }
    
    
}
