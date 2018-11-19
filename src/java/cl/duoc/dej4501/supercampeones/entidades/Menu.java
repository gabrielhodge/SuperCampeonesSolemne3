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
public class Menu implements Serializable {
    private int id_menu;
    private String nombre_menu;
    private int padre_menu;
    private String destino_menu;
    private int id_perfil;

    public Menu() {
    }

    public Menu(int id_menu, String nombre_menu, int padre_menu, String destino_menu, int id_perfil) {
        this.id_menu = id_menu;
        this.nombre_menu = nombre_menu;
        this.padre_menu = padre_menu;
        this.destino_menu = destino_menu;
        this.id_perfil = id_perfil;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNombre_menu() {
        return nombre_menu;
    }

    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }

    public int getPadre_menu() {
        return padre_menu;
    }

    public void setPadre_menu(int padre_menu) {
        this.padre_menu = padre_menu;
    }

    public String getDestino_menu() {
        return destino_menu;
    }

    public void setDestino_menu(String destino_menu) {
        this.destino_menu = destino_menu;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }
    
    
}
