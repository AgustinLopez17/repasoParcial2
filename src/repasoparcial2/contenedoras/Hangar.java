/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2.contenedoras;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import static repasoparcial2.Constantes.Q_AVIONES;
import repasoparcial2.abstractas.Aeropuerto;
import repasoparcial2.abstractas.Avion;
import repasoparcial2.aeropuertoExceptions.ExAero;

/**
 *
 * @author Agus_
 * @param <K>
 * @param <E>
 */
public class Hangar<K,E extends Avion>{
    private HashMap<K,E> hangar;
    private Aeropuerto aeropuerto;
    
    
    public Hangar(){
        hangar = new HashMap<>();
        aeropuerto =new Aeropuerto("latam",0303456,1122,7);
    }
    
    public String agregar(K k,E e){
        String message;
        try{
            if(aeropuerto.getCapacidadDeOperacion()>Q_AVIONES){
                hangar.put(k,e);
                Q_AVIONES++;
                message = "Avion añadido";
            }else{
                throw new ExAero("No se pueden agregar más aviones");
            }
        }catch(ExAero ex){
            message = ex.getMessage();
        }
        return message;
    }
    
    public boolean eliminar(K k){
        boolean flag = false;
        if(hangar.containsKey(k)){
            hangar.remove(k);
            flag = true;
        }
        return flag;
    }
    
    public StringBuilder listar(){
        StringBuilder builder= new StringBuilder();
        Set <Entry<K,E>> entries = hangar.entrySet();
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            Entry<K,E> entryOfSet = (Entry<K,E>) it.next();
            builder.append(entryOfSet.getKey() + "-" + entryOfSet.getValue().toString());
        }
        return builder;
    }
    
    public E buscar(K k){
        return hangar.get(k);
    }
    
    public int getSize(){
        return hangar.size();
    }
    
    public JSONArray jsonArrayAvion() throws JSONException{
        JSONArray ja = new JSONArray();
        Set <Entry<K,E>> entries = hangar.entrySet();
        Iterator it = entries.iterator();
        int i = 0;
        while(it.hasNext()){
            Entry<K,E> entryOfSet = (Entry<K,E>) it.next();
            ja.put(i,entryOfSet.getValue().getJsonObject());
            i++;
        }
        return ja;
    }
    
}
