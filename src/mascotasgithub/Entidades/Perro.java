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
public class Perro {
    private String nombre;
    private Integer edad;
    private String apodo;
    private String color;

    public Perro() {
    }

    public Perro(String nombre, Integer edad, String apodo, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", apodo=" + apodo + ", color=" + color + '}';
    }

    
    
    
}
