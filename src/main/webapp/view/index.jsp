<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:forward page="/MyController">
		<jsp:param name="cmd" value="list" />
	</jsp:forward>
</body>
</html>