/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Usuario;

/**
 *
 * @author danie
 */
public interface CRUD {
    
    public List listar();
    public Usuario list(int id);
    public boolean create(Usuario usuario);
    public boolean edit(Usuario usuario);
    public boolean delete(int id);
    public Usuario validate(String user, String password);
    
    
}
