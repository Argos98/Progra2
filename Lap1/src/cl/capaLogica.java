package cl;

import java.util.ArrayList;

public class capaLogica {

    private ArrayList<Inquilino> inquilinos;
    private ArrayList<Propiedad> propiedades;

    public capaLogica() {
        inquilinos = new ArrayList<>();
        propiedades = new ArrayList<>();
    }

    public void registrarInquilino(String nombre, String apellidos, String correo, String direcciopn, String telefono, String identificacion, String genero) {
        inquilinos.add(new Inquilino(nombre, apellidos, correo, direcciopn, telefono, identificacion, genero));

    }

    public String[] getInquilinos() {
        String[] infoInquilinos;
        int i = 0;

        infoInquilinos = new String[inquilinos.size()];

        for (Inquilino var : inquilinos) {
            infoInquilinos[i] = var.toString();
            i++;

        }
        return infoInquilinos;
    }

    public void registrarPropiedad(String codigo, String nombre, String valor, String direccion, String residencial, String numeroCasa, String patio, String numeroHabitaciones) {
        propiedades.add(new Propiedad(codigo, nombre, valor, direccion, residencial, numeroCasa, patio, numeroHabitaciones));
    }

    public String[] getPropiedades() {
        String[] infoPropiedades;
        int i = 0;

        infoPropiedades = new String[propiedades.size()];

        for (Propiedad var : propiedades) {
            infoPropiedades[i] = var.toString();
            i++;

        }
        return infoPropiedades;
    }
    
     public int validarInquilinos(String identificacion) {
        int condiencia = 1;

        for (int cont = 0; cont < inquilinos.size(); cont++) {
            Inquilino lista[] = new Inquilino[inquilinos.size()];
            inquilinos.toArray(lista);
            if (lista[cont].identificacion.equals(identificacion)) {
            condiencia= 2;
            } else {
            }
        }
      
        return condiencia;
    }

}
