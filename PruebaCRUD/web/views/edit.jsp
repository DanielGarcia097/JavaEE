<%-- 
    Document   : edit
    Created on : 19/02/2020, 02:27:42 PM
    Author     : danie
--%>

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
        <div>
            <h1 class="display-1">Editar usuario</h1>
        </div>
        <div style="height:500px; width:500px;">
            <%
                UsuarioDAO dao = new UsuarioDAO();
                int id = Integer.parseInt((String) request.getAttribute("id_usuario"));
                Usuario user = new Usuario();
                user = dao.list(id);
            %>
            <form action="controller">
                <div class="form-group">
                    <label for="exampleInputEmail1">Usuario: </label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="user" value="<%=user.getNombre()%>">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password: </label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="password" value="<%=user.getPassword()%>">
                    <input type="hidden" class="form-control" id="exampleInputPassword1" name="txtid" value="<%=user.getId()%>">
                </div>

                <button type="submit" class="btn btn-primary" name="accion" value="actualizar">Submit</button>
            </form>
        </div>
    </body>
</html>
