<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    
	<form id="regist" action="${ pageContext.request.contextPath }/userAction_registWithPhone1"  method="post" >
						<table>
							<tbody><tr>
								<th>用户名:</th><td>
								<input type="text" id="UPhone" name="UPhone" class="text"/>	</td>
							</tr>
							
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="获取验证码">
								</td>
							</tr>
						</tbody></table></form>
  <form id="login" action="${ pageContext.request.contextPath }/userAction_registWithPhone2	"  method="post" >
						<table>
							<tbody>
							<tr>
								<th>用户名:</th><td>
								<input type="text" id="UPhone" name="UPhone" class="text"/>	</td>
							</tr>
							<tr>
								<th>密码:</th><td>
								<input type="text" id="password" name="UPassword" class="text"/>	</td>
							</tr>
							<tr>
								<th>验证&nbsp;&nbsp;码:</th>
								<td>
									<input type="text" id="UCheckCode" name="UCheckCode" />
									
								</td>	
							</tr>
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="注册">
								</td>
							</tr>
						</tbody></table></form>
    

  </body>
</html>
