<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
<title>wesite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/guestbook.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<c:import url ="/WEB-INF/views/include/header.jsp"/>
	
		<div id="content">
			<div id="guestbook" class="delete-form">
				<form method="post" action="${pageContext.request.contextPath}/guestbook/delete?no=${param.no}">
					<label>비밀번호</label>
					<input type="password" name="password">
					<input type="submit" value="확인">
				</form>
				<a href="${pageContext.request.contextPath}/guestbook/list">방명록 리스트</a>
			</div>
		</div>
		<c:import url ="/WEB-INF/views/include/navigation.jsp"/>
		<c:import url ="/WEB-INF/views/include/footer.jsp"/>
	</div>
</body>
</html>