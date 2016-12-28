<%-- 
    Document   : home
    Created on : Nov 16, 2016, 2:46:29 AM
    Author     : Donut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="homeb"  action="BurocAction.do" method="post">
            <input type="hidden" name="todo">
            <button onclick="listburo('ckeck')">listburo</button>
        </form>
       
    </body>
    <script type="text/javascript">
    function listburo(todo){
        document.homeb.todo.value = todo;
        document.homeb.submit();
    }    
    </script>
                
</html>
