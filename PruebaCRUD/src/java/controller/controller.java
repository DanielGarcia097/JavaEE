/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import modeldao.UsuarioDAO;

/**
 *
 * @author danie
 */
public class controller extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    String list = "views/list.jsp";
    String edit = "views/edit.jsp";
    String create = "views/create.jsp";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        UsuarioDAO usuariodao = new UsuarioDAO();
        String acceso = "";
        String accion = request.getParameter("accion");

        if (accion.equalsIgnoreCase("listar")) {
            acceso = list;
        } else if (accion.equalsIgnoreCase("crear")) {
            acceso = create;
        } else if (accion.equalsIgnoreCase("nuevo")) {
            String nombre = request.getParameter("user");
            String pass = request.getParameter("password");

            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setPassword(pass);
            
            usuariodao.create(usuario);
            acceso = list;
        } else if (accion.equalsIgnoreCase("editar")) {
            request.setAttribute("id_usuario", request.getParameter("id_usuario"));
            acceso = edit;

        } else if (accion.equalsIgnoreCase("actualizar")) {
            String nombre = request.getParameter("user");
            String pass = request.getParameter("password");

            Usuario usuario = new Usuario();
            usuario.setId(Integer.parseInt(request.getParameter("txtid")));
            usuario.setNombre(nombre);
            usuario.setPassword(pass);
            
            usuariodao.edit(usuario);
            acceso = list;
        }else if (accion.equalsIgnoreCase("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id_usuario"));
            usuariodao.delete(id);
            acceso = list;

        }
        

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        //response.sendRedirect(acceso);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
