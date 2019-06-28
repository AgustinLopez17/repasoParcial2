/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial2.abstractas;

/**
 *
 * @author Agus_
 */
public class Aeropuerto {
    private String nombre;
    private int codigoInternacional;
    private int direccion;
    private int capacidadDeOperacion;

    public Aeropuerto(String nombre, int codigoInternacional, int direccion, int capacidadDeOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadDeOperacion = capacidadDeOperacion;
    }
    
    public int getCapacidadDeOperacion(){
        return capacidadDeOperacion;
    }
    
    
}
