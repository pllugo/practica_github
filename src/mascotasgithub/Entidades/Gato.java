

package mascotasgithub.Entidades;

/**
 * @author Israel Poveda
 */
public class Gato {
    
    private String nombre;
    private String nombreDueño;
    private int edadGato;
    private String sexo;
    private String raza;

    public Gato() {
    }

    public Gato(String nombre, String nombreDueño, int edadGato, String sexo, String raza) {
        this.nombre = nombre;
        this.nombreDueño = nombreDueño;
        this.edadGato = edadGato;
        this.sexo = sexo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getEdadGato() {
        return edadGato;
    }

    public void setEdadGato(int edadGato) {
        this.edadGato = edadGato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
