<%
 String us=request.getParameter("user");
 String psw=request.getParameter("password");
 if(us.equals(psw)){
 out.println("Welcome "+us);
 }
 else{
 out.println("Something wrong with your username & password");
 }
%>
