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
public class TipoCancha implements Serializable{
    private int id_tipo;
    private String descripcion;

    public TipoCancha() {
    }

    public TipoCancha(int id_tipo, String descripcion) {
        this.id_tipo = id_tipo;
        this.descripcion = descripcion;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
