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
public class Perfil implements Serializable{
    private int id_perfil;
    private String descripcion;

    public Perfil() {
    }

    public Perfil(int id_perfil, String descripcion) {
        this.id_perfil = id_perfil;
        this.descripcion = descripcion;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
