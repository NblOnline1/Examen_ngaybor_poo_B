/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Nbl
 */
public class Empresa {
    
    private String nombre;
    private String correo;
    private String telefono;
    private String Direccion;

    public Empresa() {
    }

    public Empresa(String nombre, String correo, String telefono, String Direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.Direccion = Direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        return "Los datos guardados de la empresa son: \n"
                + "Nombre: " + getNombre()+ " " + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "telefono: " + getTelefono()+ "\n"
                + "Direccion: " + getDireccion();
    }
    
}
