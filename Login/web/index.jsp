<%-- 
    Document   : index
    Created on : 18/02/2020, 08:23:18 PM
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Login MVC</title>
    </head>
    <body>
        <h1>Login</h1>

        <div style="height:500px; width:500px; background:#C4EDFE">
               
            <form method="post" action="Validacion">
            <div class="form-group">
                <label for="exampleInputEmail1">User name</label>
                <input type="text" class="form-control" name="user" id="user" aria-describedby="emailHelp">
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" name="password" id="password">
            </div>
            <button type="submit" class="btn btn-primary" name="entrar" id="entrar">Submit</button>
        </form>

        </div>

        
    </body>
</html>
