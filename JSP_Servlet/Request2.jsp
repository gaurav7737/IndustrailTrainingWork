<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			out.print(request.getParameter("name"));
		%>
		<br/>
		
		<%
	              	Integer hitsCount = 
	                    (Integer)application.getAttribute("hitCounter");
	                    if( hitsCount ==null || hitsCount == 0 )
	                    {
	                        /* First visit */
	                        out.println("Welcome to my website!!");
	                        hitsCount = 1;
	                    }
	                    else
	                    {
	                        /* return visit */
	                        out.println("Welcome to my website!!");
	                        hitsCount += 1;
	                    }
	                    application.setAttribute("hitCounter", hitsCount);
	        %>
	        <br/>
	        <p>You are visitor number: <%= hitsCount%></p>
</body>
</html>