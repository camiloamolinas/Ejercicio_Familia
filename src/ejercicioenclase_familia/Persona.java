/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase_familia;

/**
 *
 * @author Camilo
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String rol;

    public Persona(String nombre, int edad, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public String getRol() {
        return rol;
    }
    
    
    
    
}
