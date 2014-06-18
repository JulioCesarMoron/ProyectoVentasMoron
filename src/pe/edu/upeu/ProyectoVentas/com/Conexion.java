/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.ProyectoVentas.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial7
 */
public class Conexion {
   
    public static   Connection getConex(){
        Connection cx= null;
        String url="jdbc:mysql://localhost/bd_ventas";
        String Usuario="root";
        String clave="root";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cx=DriverManager.getConnection(url, Usuario,clave);
        }catch(ClassNotFoundException| SQLException e){
            JOptionPane.showMessageDialog(null,"error"+e);
        }
        return cx;
    }
}
