<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<body>

Hello World of Spring!

<br><br>

<%
    String name = request.getParameter("studentName");
    out.println("Firstname: " + name);
%>
<%
    String message = request.getParameter("message");
    out.println("Wo!!!!!! "+message ); %>

The message : ${message}

</body>

</html>






