<%@ page contentType = "text/html; charset=euc-kr" %>

<html>
<head><title>폼 생성</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		$("form").submit(function(){
			if($("#name").val()==""){
				alert("이름을 입력 하세요");
				$("#name").focus();
				return false;
			}
			if($("#address").val()==""){
				alert("주소를 입력 하세요");
				$("#address").focus();
				return false;
			}
		});
	});

</script>
</head>
<body>

폼에 데이터를 입력한 후 '전송' 버튼을 클릭하세요.
<form method="post" action="viewParameter.jsp">
이름: <input type="text" id="name" name="name" size="10"> <br>
주소: <input type="text" id="address" name="address" size="30"> <br>
좋아하는 동물:
    <input type="checkbox" name="pet" value="dog">강아지
    <input type="checkbox" name="pet" value="cat">고양이
    <input type="checkbox" name="pet" value="pig">돼지
<br>
<input type="submit" value="전송">
</form>
</body>
</html>