/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

/**
 *
 * @author oscar
 */
public class Inquilino {

    private String nombre;

    private String apellidos;

    private String correo;

    private String direcciopn;

    private String telefono;

   protected String identificacion;

    private String genero;

    public Inquilino(String nombre, String apellidos, String correo, String direcciopn, String telefono, String identificacion, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direcciopn = direcciopn;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.genero = genero;
    }

    public Inquilino() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDirecciopn() {
        return direcciopn;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDirecciopn(String direcciopn) {
        this.direcciopn = direcciopn;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "inquilino" + "nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", direcciopn=" + direcciopn +
                ", telefono=" + telefono + ", identificacion=" + identificacion + ", genero=" + genero ;
    }
    
    
    
}
