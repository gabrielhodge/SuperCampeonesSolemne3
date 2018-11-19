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
public class ReservaCancha implements Serializable{
    private int id_reserva;
    private Date fecha_reserva;
    private int hora_inicio;
    private int hora_fin;
    private int id_arriendo;
    private int id_cancha;

    public ReservaCancha() {
    }

    public ReservaCancha(int id_reserva, Date fecha_reserva, int hora_inicio, int hora_fin, int id_arriendo, int id_cancha) {
        this.id_reserva = id_reserva;
        this.fecha_reserva = fecha_reserva;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.id_arriendo = id_arriendo;
        this.id_cancha = id_cancha;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    public int getId_arriendo() {
        return id_arriendo;
    }

    public void setId_arriendo(int id_arriendo) {
        this.id_arriendo = id_arriendo;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(int id_cancha) {
        this.id_cancha = id_cancha;
    }
    
    
    
}
