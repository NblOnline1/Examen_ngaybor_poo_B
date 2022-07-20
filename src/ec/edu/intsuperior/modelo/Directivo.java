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
public class Directivo extends Empleado{
    
    private String Categorias;

    public Directivo() {
    }

    public Directivo(String Categorias, String ci, String nombre1, String nombre2, String Apellido1, String Apellido2, String Puesto, double sueldoBruto) {
        super(ci, nombre1, nombre2, Apellido1, Apellido2, Puesto, sueldoBruto);
        this.Categorias = Categorias;
    }
    public void setCategorias(String Categorias) {
        this.Categorias = Categorias;
    }

    public String getCategorias() {
        return Categorias;
    }

    @Override
    public String toString() {
        return "Los datos del directivo son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + getApellido2() + getNombre2() + getNombre1() +"\n"
                + "Categoria: "+ getCategorias();
    }
    
}
