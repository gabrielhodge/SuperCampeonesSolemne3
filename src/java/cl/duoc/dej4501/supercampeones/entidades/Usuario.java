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
public class Usuario implements Serializable{
    private int id_usuario;
    private String nombre_usuario;
    private String password;
    private int id_perfil;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String password, int id_perfil) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.id_perfil = id_perfil;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }
    
    
    
    
}
