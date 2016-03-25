<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
    
	<form id="regist" action="${ pageContext.request.contextPath }/userAction_registWithName"  method="post" >
						<table>
							<tbody><tr>
								<th>用户名:</th><td>
								<input type="text" id="UName" name="UName" class="text"/>	</td>
							</tr>
							<tr>
								<th>密&nbsp;&nbsp;码:</th>
								<td>
									<input type="password" id="upassword" name="UPassword" />
									
								</td>	
							</tr>
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="注册">
								</td>
							</tr>
						</tbody></table></form>
  	<form id="login" action="${ pageContext.request.contextPath }/userAction_loginWithName"  method="post" >
						<table>
							<tbody><tr>
								<th>用户名:</th><td>
								<input type="text" id="UName" name="UName" class="text"/>	</td>
							</tr>
							<tr>
								<th>密&nbsp;&nbsp;码:</th>
								<td>
									<input type="password" id="upassword" name="UPassword" />
									
								</td>	
							</tr>
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="登陆">
								</td>
							</tr>
						</tbody></table></form>
						<br><br><br>
						<a href="${ pageContext.request.contextPath }/storeAction_findTop">
						findTop
						</a>
   						<br><br><br>
   						
   						<a href="${ pageContext.request.contextPath }/goodsAction_findbyPID">
						findByPID
						</a>
   						<br><br>
   						<br>
   	<form id="findSid" action="${ pageContext.request.contextPath }/goodsAction_findSIDbyGID"  method="post" >
						<table>
							<tbody><tr>
								<th>Gid :</th><td>
								<input type="text" id="Gid" name="GId" class="text"/>	</td>
							</tr>
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="Find">
								</td>
							</tr>
							</tbody>
							</table>
	</form>	
	<form id="findStorebyGID" action="${ pageContext.request.contextPath }/goodsAction_findStorebyGID"  method="post" >
						<table>
							<tbody><tr>
								<th>Gid :</th><td>
								<input type="text" id="Gid" name="GId" class="text"/>	</td>
							</tr>
							<tr>
								<th>&nbsp;</th>
								<td>
									<input type="submit" class="submit" value="findStorebyGID">
								</td>
							</tr>
							</tbody>
							</table>
	</form>					
</body>
</html>
