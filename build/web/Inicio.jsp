<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <h1>Fabrica</h1>
        <h2>¿Que tipo de milicia desea crear?</h2>
        <form action="MiliciaServlet" name="inicio" method="post">

            <input type="radio" name="gender" value="hombre" checked> Hombre<br>
            <input type="radio" name="gender" value="enano"> Enano<br>
            <input type="radio" name="gender" value="hechizero"> Hechizero<br>
            <input type="radio" name="gender" value="elfo"> Elfo
            <p><input type="submit" value="Enviar"></p>            
        </form>
    </body>
</html>
