<%-- 
    Document   : burolist
    Created on : Nov 16, 2016, 2:54:29 AM
    Author     : Donut
--%>

<%@page import="com.bean.BuroBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>       
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-select.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/css-template.css">  
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/menu-style.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style1.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style2.css">
       <%!
            ArrayList<BuroBean> bean = null;
        %>
        <%
        bean = (ArrayList<BuroBean>) request.getSession().getAttribute("listBuro");
        %>
    </head>
    <body>
           
        <form name="burohome"  action="BurocAction.do" method="post">

            <div id="management" class="container" style="margin-top: 50px; margin-bottom: 50px;">
                <h1 style="text-align: center; margin-bottom: 20px;">ตรวจสอบสินเชื่อ</h1>
                <input type="hidden" name="todo">
                <input type="hidden" name="trc">
                <div class="col-md-12 top-1">
                    <div class="col-md-10">
                        <div class="col-md-5">
                            <input type="text" style="font-size: 12px; width: 100%;" class="form-control" placeholder="ระบุ รหัสประจำตัวประชาชน เลขที่บัญชี หรือ ชื่อ-สกุล " name="sert"/>
                        </div>
                        <button class="btn btn-info " onclick="resetT('selectlike')">ค้นหา <span class="glyphicon glyphicon-search"></span></button>         
                        <button class="btn btn-success" onclick="resetF('ckeck')">รีค่า <span class="glyphicon glyphicon-refresh"></span></button>
                    </div>
                    <div class="col-md-2">
                        <button onclick="insabe('addData')" class="btn btn-success">เพิ่ม<span class="glyphicon glyphicon-plus"></span></button>
                    </div>
                </div>
                
                <div class="col-md-12">
                    <table  border="1" style="width: 100%;">
                        <thead class="back-th">
                        <th>ลำดับ</th>
                        <th>รหัสประจำตัวประชาชน</th>
                        <th>เลขที่บัญชี</th>
                        <th>ธนาคาร</th>
                        <th>ชื่อ - สกุล</th>
                        <th>ยอดค้าชำระ</th>
                        <th>สถานะ</th>
                        </thead>
                        <%
                            if (bean != null && bean.size() != 0) {
                                for (int i = 0; i < bean.size(); i++) {
                                    BuroBean t = (BuroBean) bean.get(i);
                        %>
                        <tbody class="back-td">
                        <td style="text-align: center;"><%=i + 1%></td>
                        <td style="padding-left: 5px;"><%=t.getBr_Code()%></td>
                        <td style="padding-left: 5px;"><%=t.getBr_Account()%></td>                       
                        <td style="padding-left: 5px;"><%=t.getBr_Bank()%></td>
                        <td style="padding-left: 5px;"><%=t.getBr_Name()%> <%=t.getBr_Lastname()%></td>
                        <td style="padding-left: 5px;"><%=t.getBr_Total()%></td>
                        <td style="padding-left: 5px;"><%=t.getStatus()%></td>
                        <td style="text-align: center;"><button onclick="btsss('<%=t.getBr_Code()%>')" class="btn-success form-control">ตรวจสอบ</button></td>                    
                        </tbody>
                          <%}%>
                <%} else {%>
                <br><br>
                <strong style="color: red">ไม่พบข้อมูลการขออนุมัติสินเชื่อ</strong>        
                <%}%>
                    </table>
                </div>
            </div>
        </form> 
   

    </body>
                        <script type="text/javascript">
                        function insabe(todo){
                           document.burohome.todo.value = todo;
                           document.burohome.submit();
                        }
                           function  resetT(todo){
                            document.burohome.todo.value = todo;
                            document.burohome.submit();
                            
                        }
                        function  resetF(todo){
                            document.burohome.todo.value = todo;
                            document.burohome.submit();
                            
                        }

          
                    </script>
</html>
