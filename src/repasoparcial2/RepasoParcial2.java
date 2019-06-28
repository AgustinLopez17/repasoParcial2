/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2;

import org.json.JSONArray;
import org.json.JSONObject;
import repasoparcial2.abstractas.Aeropuerto;
import repasoparcial2.abstractas.Avion;
import repasoparcial2.aviones.AvionComercial;
import repasoparcial2.aviones.AvionDeCarga;
import repasoparcial2.aviones.AvionMilitar;
import repasoparcial2.aviones.AvionPrivado;
import repasoparcial2.contenedoras.ContenedoraDeHangares;
import repasoparcial2.json.JSONUtiles;


/**
 *
 * @author Agus_
 */
public class RepasoParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Aeropuerto airPort = new Aeropuerto("latam",0303456,1122,3);
        ContenedoraDeHangares hangares = new ContenedoraDeHangares();
        Avion latam = new AvionComercial(1,"a","modelo","marca",200,"motor",50);
        Avion emirates = new AvionComercial(2,"b","modela","marco",300,"motora",90);
        Avion malo = new AvionMilitar("sistemaDeArmas",789,"modelo","marca",200,"motor",50);
        Avion ulala = new AvionPrivado(false,"claveWifi","modelo","marca",200,"motor",50);
        Avion cargadita = new AvionDeCarga(780000,"producttt","modelll","marquilla",25,"MOTORAAAAAAAASO");
        
        Constantes.Q_HANGARES = 4;
        
        System.out.println(hangares.añadir(001, latam));
        System.out.println(hangares.añadir(002, emirates));
        System.out.println(hangares.añadir(003, malo));
        System.out.println(hangares.añadir(96, cargadita));
        System.out.println(hangares.añadir(004, ulala));
        
        System.out.println(hangares.listar(0)); //en el parametro pones el numero de hangar que queres listar, y si queres listar todo pones 0

        JSONUtiles ju = new JSONUtiles();
        JSONArray ja = new JSONArray();
        ja=hangares.jsonArrayHangares();
        ju.guardar(ja);
        
//        if(hangares.buscar(001)!=null){
//            System.out.println(hangares.buscar(001).toString());
//        }else{
//            System.out.println("no existe");
//        }
    }
    
}
