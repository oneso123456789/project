<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head><title>choose �±�</title></head>
	<body>

	<ul>
	<c:choose> 
		<c:when test="${param.name == 'bk'}" > 
			<li> ����� �̸��� ${param.name} �Դϴ�.
		</c:when> 
		<c:when test="${param.age > 18}" > 
			<li> ����� 18�� �̻��Դϴ�.
		</c:when> 
		<c:otherwise> 
			<li> ����� 'bk'�� �ƴϰ� 18�� �̻��� �ƴմϴ�.
		</c:otherwise> 
	</c:choose> 
</ul>

</body>
</html>
