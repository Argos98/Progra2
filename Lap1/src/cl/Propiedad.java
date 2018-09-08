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
public class Propiedad {

    private String codigo;
    private String nombre;
    private String valor;
    private String direccion;
    private String residencial;
    private String numeroCasa;
    private String patio;
    private String numeroHabitaciones;

    public Propiedad() {
    }

    public Propiedad(String codigo, String nombre, String valor, String direccion, String residencial, String numeroCasa, String patio, String numeroHabitaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        this.direccion = direccion;
        this.residencial = residencial;
        this.numeroCasa = numeroCasa;
        this.patio = patio;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getResidencial() {
        return residencial;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public String getPatio() {
        return patio;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    @Override
    public String toString() {
        return "Propiedad" + "codigo=" + codigo + ", nombre=" + nombre + ", valor=" + valor + ", direccion=" + direccion + ", residencial=" + residencial + ", numeroCasa=" + numeroCasa + 
                ", patio=" + patio + ", numeroHabitaciones=" + numeroHabitaciones ;
    }
    
    
}
