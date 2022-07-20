/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intesuperior.vista;

/**
 *
 * @author Nbl
 */
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Empleado;

import java.util.Scanner;

public class Aplicacion {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empresa p1 = new Empresa();
        System.out.println("Informacion de la empresa ");
        System.out.println("");
        System.out.println("Ingrese nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese direccion: ");
        p1.setDireccion(leer.nextLine());
        System.out.println("Ingresa su telefono: ");
        p1.setTelefono(leer.nextLine());
        System.out.println("Ingrese el correo ");
        p1.setCorreo(leer.nextLine());
        System.out.println("\n\n\n");
        System.out.println(p1.toString());

        Cliente c1 = new Cliente();
        System.out.println("");
        System.out.println("Informacion del cliente ");
        System.out.println("");
        System.out.println("Ingrese la cedula: ");
        c1.setCi(leer.nextLine());
        System.out.println("Ingrese primer nombre: ");
        c1.setNombre1(leer.nextLine());
        System.out.println("Ingresa segundo nombre: ");
        c1.setNombre2(leer.nextLine());
        System.out.println("Ingrese primer apellido ");
        c1.setApellido1(leer.nextLine());
        System.out.println("Ingrese segundo apellido: ");
        c1.setApellido2(leer.nextLine());
        System.out.println("Ingrese direccion: ");
        c1.setDireccion(leer.nextLine());
        System.out.println("Ingresa su correo: ");
        c1.setCorreo(leer.nextLine());
        System.out.println("Ingrese la edad ");
        c1.setEdad(leer.nextInt());
        System.out.println("Ingrese un telefono de contacto");
        c1.setTelefonoContacto(leer.next());
        System.out.println("\n\n\n");
        System.out.println(c1.toString());

        Empleado e1 = new Empleado();
        System.out.println("");
        System.out.println("Informacion del Empleado");
        System.out.println("");
        System.out.println("Ingrese la cedula: ");
        e1.setCi(leer.nextLine());
        System.out.println("Ingrese primer nombre: ");
        e1.setNombre1(leer.nextLine());
        System.out.println("Ingresa segundo nombre: ");
        e1.setNombre2(leer.nextLine());
        System.out.println("Ingrese primer apellido ");
        e1.setApellido1(leer.nextLine());
        System.out.println("Ingrese segundo apellido: ");
        e1.setApellido2(leer.nextLine());
        System.out.println("Ingrese su el puesto: ");
        e1.setTrabajo(leer.nextLine());
        System.out.println("Ingrese los dias trabajados: ");
        int dp = leer.nextInt();
        System.out.println("Ingrese el pago por dia: ");
        double pd = leer.nextDouble();
        double sb = 0, aux;
        if (dp > 30) {
            double tn = 15 * pd;
            double sx = (pd * 15);
            sb = sx + tn;
        } else {
            sb = dp * pd;
        }
        System.out.println("\n\n\n");
        System.out.println(p1.toString() + "\n"
                + "Dias trabajados: " + dp + "\n"
                + "pago por dia: " + pd + "\n"
                + "Sueldo bruto: " + sb + "1"
                + "\n");

        Directivo d1 = new Directivo();
        System.out.println("Informacion del directivo");
        System.out.println("");
        System.out.println("Ingrese la cedula: ");
        d1.setCi(leer.nextLine());
        System.out.println("Ingrese primer nombre: ");
        d1.setNombre1(leer.nextLine());
        System.out.println("Ingresa segundo nombre: ");
        d1.setNombre2(leer.nextLine());
        System.out.println("Ingrese primer apellido ");
        d1.setApellido1(leer.nextLine());
        System.out.println("Ingrese segundo apellido: ");
        d1.setApellido2(leer.nextLine());
        System.out.println("Ingrese la categoria ");
        d1.setCategorias(leer.next());
        System.out.println("\n\n\n");
        System.out.println(d1.toString());
        
        System.out.println("Realizado Nabil Gaybor");
      

    }
}
