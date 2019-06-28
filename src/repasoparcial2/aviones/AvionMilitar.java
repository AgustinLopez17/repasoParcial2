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
public class AvionMilitar extends Avion{
    private String sistDeArmas;
    private int qBalas;
    
    public AvionMilitar() {
    }
    
    public AvionMilitar(String sistDeArmas, int qBalas, String modelo, String marca, int qCombustible, String tipoDeMotor, int qAsientos) {
        super(modelo, marca, qCombustible, tipoDeMotor, qAsientos);
        this.sistDeArmas = sistDeArmas;
        this.qBalas = qBalas;
    }
    
    public String toString(){
        return super.toString()+" "+sistDeArmas+" "+qBalas+"\n";
    }
    
    @Override
    public String sirvenComida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String darManta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verMundial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String registro() {
        return "Registrando";
    }

    @Override
    public String descargarContenido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public JSONObject getJsonObject() throws JSONException{
        JSONObject jo = super.getJsonObject();
        jo.put("sistDeArmas", sistDeArmas);
        return jo;
    }
    
}
