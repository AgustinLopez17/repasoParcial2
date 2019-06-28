/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2.contenedoras;

import org.json.JSONArray;
import org.json.JSONException;
import static repasoparcial2.Constantes.Q_HANGARES;
import repasoparcial2.abstractas.Aeropuerto;
import repasoparcial2.abstractas.Avion;
import repasoparcial2.aviones.AvionComercial;
import repasoparcial2.aviones.AvionDeCarga;
import repasoparcial2.aviones.AvionMilitar;
import repasoparcial2.aviones.AvionPrivado;
/**
 *
 * @author Agus_
 */
public class ContenedoraDeHangares {
    private Hangar[] hangares;
    
    public ContenedoraDeHangares(){
        hangares = new Hangar[Q_HANGARES];
        for(int i=0;i<hangares.length;i++){
            hangares[i] = new Hangar();
        }
    }
    
    public String añadir(int clave,Avion avion){
        String message = "No se ha podido agregar";
        if(avion instanceof AvionComercial){
            message = hangares[0].agregar(clave, avion);
        }else if(avion instanceof AvionDeCarga){
            message = hangares[1].agregar(clave, avion);
        }else if(avion instanceof AvionMilitar){
            message = hangares[2].agregar(clave, avion);
        }else if(avion instanceof AvionPrivado){
            message = hangares[3].agregar(clave, avion);
        }
        return message;
    }
    
    public StringBuilder listar(int i){
        StringBuilder aux = new StringBuilder();
        if(i != 0){
            aux = hangares[i-1].listar();
        }else{
            while(i<hangares.length){
                if(hangares[i]!=null){
                    aux.append(hangares[i].listar()); 
                    i++;        
                }
            }
        }
        return aux;
    }
    
    public Avion buscar(int clave){
        int i = 0;
        Avion aux = null;
        while(i<hangares.length && aux==null){
            aux = (Avion)hangares[i].buscar(clave);
            i++;
        }
        return aux;
    }
    
    public JSONArray jsonArrayHangares(){
        JSONArray ja = new JSONArray();
        try{
            for(int i=0;i<hangares.length;i++){
                ja.put(i,hangares[i].jsonArrayAvion());
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return ja;
    }
    
}
