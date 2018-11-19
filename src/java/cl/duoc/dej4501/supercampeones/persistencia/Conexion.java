/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.supercampeones.persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GabrielH
 */
public class Conexion {
public static Connection getConexion() throws ConexionException{
        Connection con=null;
        try{
            String driverClassName="com.mysql.jdbc.Driver";
            String driverUrl="jdbc:mysql://localhost/";
            Class.forName(driverClassName);
            con= (Connection) DriverManager.getConnection(driverUrl,"root","bdcanchas");
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new ConexionException("error al conectar la Base de datos"+ e.getMessage());
        }
        return con;
    }

}
    

