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
public class AvionDeCarga extends Avion{
    private int qKg;
    private String listaProductos;

    public AvionDeCarga() {
    }

    public AvionDeCarga(int qKg, String listaProductos, String modelo, String marca, int qCombustible, String tipoDeMotor) {
        super(modelo, marca, qCombustible, tipoDeMotor, 0);
        this.qKg = qKg;
        this.listaProductos = listaProductos;
    }
    
    public String toString(){
        return super.toString()+" "+qKg+" "+listaProductos+"\n";
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
        return "Descargando contenido";
    }
    
    @Override
    public JSONObject getJsonObject() throws JSONException{
        JSONObject jo = super.getJsonObject();
        jo.put("qKg",qKg);
        jo.put("listaProductos", listaProductos);
        return jo;
    }
    
}
