<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <canvas id="myCanvas" width="2000" height="2000"></canvas>
        
    <script>
        
      var canvas = document.getElementById('myCanvas');
      var context = canvas.getContext('2d');
      var cuerpo = new Image();
      var cuerpo1 = new Image();
      var cuerpo2 = new Image();
      var cuerpo3 = new Image();
      cuerpo.onload = function() {
        context.drawImage(cuerpo, 300, 0,500,200);
        
      };
      
     cuerpo1.onload = function (){
          context.drawImage(cuerpo1, 200, 200,200,350);
      };
     

      cuerpo2.onload = function() {
        context.drawImage(cuerpo2, 500, 200,200,350);
        
      };
      cuerpo3.onload = function() {
        context.drawImage(cuerpo3, 750, 200,300,350);
        
      };
      
      cuerpo.src = "<%= request.getSession().getAttribute("cuerpo") %>";
      cuerpo1.src = "<%= request.getSession().getAttribute("cuerpo1") %>";
      cuerpo2.src = "<%= request.getSession().getAttribute("cuerpo2") %>";
      cuerpo3.src = "<%= request.getSession().getAttribute("cuerpo3") %>";
    </script>

    </body>
</html>
