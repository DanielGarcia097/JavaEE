<%-- 
    Document   : list
    Created on : 19/02/2020, 02:27:20 PM
    Author     : danie
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Usuario"%>
<%@page import="modeldao.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/style.css" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="pos-f-t">
            <%
                String nombre = request.getParameter("user");
            %>

            <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-toggler">
                    <span class="navbar-toggler-icon"></span>
                    Home
                </a>
                <div class="dropdown">
                    <a style="color:white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Sesion</a>
                    <div class="dropdown-menu text-center " >
                        <a><%=nombre%></a>
                        <a class="dropdown-divider"></a>
                        <a class="dropdown-item" href="index.jsp">Salir</a>
                    </div>
                </div>
            </nav>
        </div>


        <div>
            <h1 class="display-1">Listado</h1>
        </div>

        <div class="container">
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Usuario</th>
                        <th scope="col">Password</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        UsuarioDAO dao = new UsuarioDAO();
                        List<Usuario> list = dao.listar();
                        Iterator<Usuario> iterador = list.iterator();
                        Usuario user = null;

                        while (iterador.hasNext()) {
                            user = iterador.next();
                    %>
                    <tr>
                        <th scope="row">1</th>
                        <td><%= user.getId()%></td>
                        <td><%= user.getNombre()%></td>
                        <td><%= user.getPassword()%></td>
                        <td><a type="button" class="btn btn-success" href="controller?accion=editar&id_usuario=<%= user.getId()%>">Editar</a>
                            <a type="button" class="btn btn-danger" href="controller?accion=eliminar&id_usuario=<%= user.getId()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>

        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>


