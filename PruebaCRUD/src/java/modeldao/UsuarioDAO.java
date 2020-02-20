/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldao;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author danie
 */
public class UsuarioDAO implements CRUD {

    Conexion conexion = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Usuario usuario;

    @Override
    public List listar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "select * from usuario";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getString("contra"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {

        }

        return usuarios;
    }

    @Override
    public Usuario list(int id) {
        usuario = new Usuario();
        String sql = "select * from usuario where id_usuario=" + id;
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getString("contra"));
            }

        } catch (Exception e) {

        }

        return usuario;
    }

    @Override
    public boolean create(Usuario usuario) {
        String sql = "insert into usuario(nombre,contra) values('" + usuario.getNombre() + "','" + usuario.getPassword() + "')";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean edit(Usuario usuario) {
        String sql = "update usuario set nombre='" + usuario.getNombre() + "', contra='" + usuario.getPassword() + "' where id_usuario=" + usuario.getId();
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from usuario where id_usuario=" + id;
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Usuario validate(String user, String password) {
        usuario = new Usuario();
        String sql = "select * from usuario where nombre='" + user + "' AND contra='" + password + "'";
        try {
            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getString("contra"));
                return usuario;
            }
            return null;
        } catch (Exception e) {
            return null;
        }

    }

}
