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
public class Familia {
    
    private String apellidoFamilia;
    private Persona[] integrantes;

    public Familia(String apellidoFamilia, Persona[] integrantes) {
        this.apellidoFamilia = apellidoFamilia;
        this.integrantes = new Persona[4];
    }

    public String getApellidoFamilia() {
        return apellidoFamilia;
    }

    public Persona[] getIntegrantes() {
        return integrantes;
    }

    
    
}
