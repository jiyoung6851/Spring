<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   	<table border="1" align="center">
   		<form method="post" action="loginYn">
	   		<tr height="30">
		    	<td width="100">
		    		사용자 ID
		    	</td>
		    	<td width="100">
					<input type="text" name="mem_uid">
				</td> 
			</tr>
	   		<tr height="30">
		    	<td width="100">
		    		비밀번호
		    	</td>
		    	<td width="100">
					<input type="text" name="mem_pw">
				</td> 
			</tr>
			<tr>
				<td colspan="2" align="center">
		        	<input type="submit" value="로그인">
		        	<a href="register">회원가입</a>
				</td>
		    </tr>
   		</form>
   	</table>
</body>
</html>