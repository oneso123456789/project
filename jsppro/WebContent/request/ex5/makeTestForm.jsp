<%@ page contentType = "text/html; charset=euc-kr" %>

<html>
<head><title>�� ����</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		$("form").submit(function(){
			if($("#name").val()==""){
				alert("�̸��� �Է� �ϼ���");
				$("#name").focus();
				return false;
			}
			if($("#address").val()==""){
				alert("�ּҸ� �Է� �ϼ���");
				$("#address").focus();
				return false;
			}
		});
	});

</script>
</head>
<body>

���� �����͸� �Է��� �� '����' ��ư�� Ŭ���ϼ���.
<form method="post" action="viewParameter.jsp">
�̸�: <input type="text" id="name" name="name" size="10"> <br>
�ּ�: <input type="text" id="address" name="address" size="30"> <br>
�����ϴ� ����:
    <input type="checkbox" name="pet" value="dog">������
    <input type="checkbox" name="pet" value="cat">�����
    <input type="checkbox" name="pet" value="pig">����
<br>
<input type="submit" value="����">
</form>
</body>
</html>