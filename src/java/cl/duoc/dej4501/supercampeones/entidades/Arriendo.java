/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.supercampeones.entidades;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author GabrielH
 */
public class Arriendo implements Serializable {
    private int id_arriendo;
    private Date fecha_arriendo;
    private int total;
    private int id_usuario;

    public Arriendo() {
    }

    public Arriendo(int id_arriendo, Date fecha_arriendo, int total, int id_usuario) {
        this.id_arriendo = id_arriendo;
        this.fecha_arriendo = fecha_arriendo;
        this.total = total;
        this.id_usuario = id_usuario;
    }

    public int getId_arriendo() {
        return id_arriendo;
    }

    public void setId_arriendo(int id_arriendo) {
        this.id_arriendo = id_arriendo;
    }

    public Date getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(Date fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
