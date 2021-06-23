<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8" %>
   <%@ page import ="java.util.List"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<%
//List<SiteVO> list = (List<SiteVO>)request.getAttribute("list");



 %>



<body>

   			<form action="keyword" method="GET">
            	<input name="tag" type="text" />
            	<input type="submit" value="찾기"/>
            </form>
      
            
</body>
</html>