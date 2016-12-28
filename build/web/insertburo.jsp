<%-- 
    Document   : insertburo
    Created on : Nov 16, 2016, 4:21:23 AM
    Author     : Donut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <form name="insertburo" method="post" action="BurocAction.do">
            <input type="hidden" name="todo"/>
          รหัสประจำตัวประชาชน  <input type="text" name="br_Code"/><br>
          เลขที่บัญชี  <input type="text" name="br_Account"/><br>
          ธนาคาร <input type="text" name="br_Bank"><br>
          ชื่อ  <input type="text" name="br_Name"/>
          สกุล  <input type="text" name="br_Lastname"/><br>
          ยอดค้างชำระ  <input type="text" name="br_Total"/><br>
          <button onclick="seve('insertburo')">บันทึก</button>
        </form>
    </body>
    <script type="text/javascript">
        function seve(todo){
            document.insertburo.todo.value = todo;
            document.insertburo.submit();
        }
    </script>
</html>
