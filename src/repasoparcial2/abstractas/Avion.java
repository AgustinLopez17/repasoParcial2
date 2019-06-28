/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2.abstractas;

import org.json.JSONException;
import org.json.JSONObject;
import repasoparcial2.interfaces.IAvion;

/**
 *
 * @author Agus_
 */
public abstract class Avion implements IAvion {
    private String modelo;
    private String marca;
    private int qCombustible;
    private String tipoDeMotor;
    private int qAsientos;
    
    public Avion(){    
    
    }
    
    public Avion(String modelo,String marca,int qCombustible,String tipoDeMotor,int qAsientos){
        this.modelo = modelo;
        this.marca = marca;
        this.qCombustible = qCombustible;
        this.tipoDeMotor = tipoDeMotor;
        this.qAsientos = qAsientos;
    }
    
    public String toString(){
        return modelo+" "+marca+" "+qCombustible+" "+tipoDeMotor+" "+qAsientos+" ";
    }
    
    @Override
    public String despegar(){
        return "Despegando";
    }
    
    @Override
    public String aterrizar(){
        return "Aterrizando";
    }
    
    @Override
    public String volar(){
        return "Volando";
    }
    
    public JSONObject getJsonObject() throws JSONException{
        JSONObject jo = new JSONObject();
        jo.put("modelo", modelo);
        jo.put("marca",marca);
        jo.put("qCombustible", qCombustible);
        jo.put("tipoDeMotor", tipoDeMotor);
        jo.put("qAsientos", qAsientos);
        return jo;
    }
    
}
