<%-- 
    Document   : create
    Created on : 19/02/2020, 02:27:32 PM
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/style.css" type="text/css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1 class="display-1">Crear usuario</h1>
        </div>
        <div style="height:500px; width:500px;">
            <form action="controller">
                <div class="form-group">
                    <label for="exampleInputEmail1">Usuario: </label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="user">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password: </label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
                </div>

                <button type="submit" class="btn btn-primary" name="accion" value="nuevo">Submit</button>
            </form>
        </div>

    </body>
</html>
