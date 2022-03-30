/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Banda {
    static int cont = 0;
    private int id;
    private String nombre;
    private List<Banda> bandasDeSoporte;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Banda> getBandasDeSoporte() {
        return bandasDeSoporte;
    }

    public void setBandasDeSoporte(List<Banda> bandasDeSoporte) {
        this.bandasDeSoporte = bandasDeSoporte;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nombre=" + nombre + ", bandasDeSoporte=" + bandasDeSoporte + '}';
    }

    public Banda(String nombre, List<Banda> bandasDeSoporte) {
        cont++;
        this.id = cont;
        this.nombre = nombre;
        this.bandasDeSoporte = bandasDeSoporte;
    }
    
}
