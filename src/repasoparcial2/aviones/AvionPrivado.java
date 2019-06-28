/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2.aviones;

import org.json.JSONException;
import org.json.JSONObject;
import repasoparcial2.abstractas.Avion;

/**
 *
 * @author Agus_
 */
public class AvionPrivado extends Avion {
    private boolean jacuzzi;
    private String claveWifi;

    public AvionPrivado() {
    }

    public AvionPrivado(boolean jacuzzi, String claveWifi, String modelo, String marca, int qCombustible, String tipoDeMotor, int qAsientos) {
        super(modelo, marca, qCombustible, tipoDeMotor, qAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }
    
    public String toString(){
        return super.toString() + " " + jacuzzi + " " + claveWifi+"\n";
    }
    
    @Override
    public String sirvenComida() {
        return "Sirviendo comida";
    }

    @Override
    public String darManta() {
        return "Dando manta";
    }

    @Override
    public String verMundial() {
        return "Mirando mundial";
    }

    @Override
    public String registro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String descargarContenido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public JSONObject getJsonObject() throws JSONException{
        JSONObject jo = super.getJsonObject();
        jo.put("jacuzzi", jacuzzi);
        jo.put("claveWifi",claveWifi);
        return jo;
    }
    
}
