 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Consultas extends Conexion {

    public boolean autenticacion(String usuario, String password) throws SQLException {
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT * from usuario";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            if (usuario.equals(rs.getString("nombre")) && password.equals(rs.getString("contra"))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        try {
            Consultas consultas = new Consultas();
            System.out.println(consultas.autenticacion("daniel", "garcia"));
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
