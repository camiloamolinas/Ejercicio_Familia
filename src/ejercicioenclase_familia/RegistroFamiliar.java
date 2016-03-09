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
public class RegistroFamiliar {
        
    private Familia[] familias;

    public RegistroFamiliar(Familia[] familias) {
        this.familias = new Familia[5];
    }

    public Familia[] getFamilias() {
        return familias;
    }
    
    
    public void verFamilia(String key){
        HashMap<String, Familia> apellidos = new HashMap<String, Familia>();
        
        for(int j=0; j<familias.length; j++){
            apellidos.put(familias[j].getApellidoFamilia(), familias[j]);
            
        }
        System.out.println("Familia : " + key);
        Familia Aux = apellidos.get(key);
        
        if(Aux != null){
            System.out.println(Aux);
          
        }else{
            System.out.println("Familia : " + Aux + "Don`t exist");
        }
        
    }
}
