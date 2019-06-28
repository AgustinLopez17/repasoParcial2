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
public class AvionComercial extends Avion {
    private int qAsafatas;
    private String listaDeServicios;
    
    public AvionComercial(){
    }

    public AvionComercial(int qAsafatas, String listaDeServicios, String modelo, String marca, int qCombustible, String tipoDeMotor, int qAsientos) {
        super(modelo, marca, qCombustible, tipoDeMotor, qAsientos);
        this.qAsafatas = qAsafatas;
        this.listaDeServicios = listaDeServicios;
    }
    
    public String toString(){
        return super.toString()+" "+qAsafatas+" "+listaDeServicios+"\n";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        JSONObject jo;
        jo = super.getJsonObject();
        jo.put("qAsafatas", qAsafatas);
        jo.put("listaDeServicios", listaDeServicios);
        return jo;
    }
    
}
