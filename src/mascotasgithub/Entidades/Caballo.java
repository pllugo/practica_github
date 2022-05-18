/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotasgithub.Entidades;

/**
 *
 * @author Usuario
 */
public class Caballo {
    private String nombre;
    private String color;

    public Caballo() {
    }

    public Caballo(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    
    
}
