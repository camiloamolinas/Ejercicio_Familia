/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase_familia;
import java.util.*;
import java.util.HashMap;
/**
 *
 * @author Camilo
 */
public class EjercicioEnClase_Familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Familia[] familiasT = new Familia[5]; 
        
        //Famila Nº 1---------------------------------------------
        //Persona j = new Persona("Juan Perez", 40, "Padre");
        //Persona m = new Persona("Maria de Perez", 38, "Madre"); 
        //Persona l = new Persona("Laura Perez", 15, "Hija");
        //Persona p = new Persona("Pablo Perez", 13, "Hijo");
        //Familia perez = new Familia("Perez", integrantes_1);
        
        Persona[] integrantes_1 = new Persona[4];
        integrantes_1[0] = new Persona("Juan Perez", 40, "Padre");
        integrantes_1[1] = new Persona("Maria de Perez", 38, "Madre"); 
        integrantes_1[2] = new Persona("Laura Perez", 15, "Hija");
        integrantes_1[3] = new Persona("Pablo Perez", 13, "Hijo");
        
        familiasT[0] = new Familia("Perez", integrantes_1);
        
        //Famila Nº 2---------------------------------------------
        Persona[] integrantes_2 = new Persona[4];
        integrantes_2[0] = new Persona("Pedro Torrez", 45, "Padre");
        integrantes_2[1] = new Persona("Marcella de Torrez", 35, "Madre"); 
        integrantes_2[2] = new Persona("Diana Torrez", 16, "Hija");
        integrantes_2[3] = new Persona("Pedro J. Perez", 23, "Hijo");
        
        familiasT[1] = new Familia("Torrez", integrantes_2);
        
        //Famila Nº 3---------------------------------------------
        Persona[] integrantes_3 = new Persona[4];
        integrantes_3[0] = new Persona("Carlos Mendez", 60, "Padre");
        integrantes_3[1] = new Persona("Claudia de Mendez", 35, "Madre"); 
        integrantes_3[2] = new Persona("Dajana Mendez" , 26, "Hija");
        integrantes_3[3] = new Persona("Danilo Mendez", 18, "Hijo");
        
        familiasT[2] = new Familia("Mendez", integrantes_3);
        
        //Famila Nº 4---------------------------------------------
        Persona[] integrantes_4 = new Persona[4];
        integrantes_4[0] = new Persona("Eduardo Montaña", 42, "Padre");
        integrantes_4[1] = new Persona("Carmen de Montaña", 45, "Madre"); 
        integrantes_4[2] = new Persona("Daniel Montaña" , 10, "Hijo");
        integrantes_4[3] = new Persona("Duvan Montaña", 20, "Hijo");
        
        familiasT[2] = new Familia("Montaña", integrantes_4);
        
        //Famila Nº 5---------------------------------------------
        Persona[] integrantes_5 = new Persona[4];
        integrantes_5[0] = new Persona("Esteban Rodriguez", 50, "Padre");
        integrantes_5[1] = new Persona("Caren de Rodriguez", 49, "Madre"); 
        integrantes_5[2] = new Persona("Daniel Rodriguez" , 10, "Hijo");
        integrantes_5[3] = new Persona("dennis Rodriguez", 20, "Hijo");
        
        familiasT[3] = new Familia("Rodriguez", integrantes_5);
        
        //-----------------------------------------------------------
        RegistroFamiliar DatosFamilia = new RegistroFamiliar(familiasT);
        
    }
    
    
}
