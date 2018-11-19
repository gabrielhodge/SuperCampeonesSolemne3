    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.supercampeones.entidades;

import java.io.Serializable;

/**
 *
 * @author GabrielH
 */
public class Cancha implements Serializable {
    private int id_cancha;
    private String nombre_cancha;
    private int valorxhora;
    private int id_tipo;

    public Cancha() {
    }

    public Cancha(int id_cancha, String nombre_cancha, int valorxhora, int id_tipo) {
        this.id_cancha = id_cancha;
        this.nombre_cancha = nombre_cancha;
        this.valorxhora = valorxhora;
        this.id_tipo = id_tipo;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }

    public String getNombre_cancha() {
        return nombre_cancha;
    }

    public void setNombre_cancha(String nombre_cancha) {
        this.nombre_cancha = nombre_cancha;
    }

    public int getValorxhora() {
        return valorxhora;
    }

    public void setValorxhora(int valorxhora) {
        this.valorxhora = valorxhora;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
    
    
}
