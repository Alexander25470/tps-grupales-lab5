/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo_4;

/**
 *
 * @author Usuario
 */
public class CategoriaRecital {
    private static int cont = 0;
    private int id;
    private String nombre;

    public CategoriaRecital(String nombre) {
        cont++;
        this.id = cont;
        this.nombre = nombre;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        CategoriaRecital.cont = cont;
    }

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
    public double getPrecio(){
        return nombre.compareToIgnoreCase("VIP")==0?800:500;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
