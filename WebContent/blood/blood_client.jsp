<%@ page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function send(){
	//DOM 의 상하위 관계(위계)를 통한 접근법
	form1.method="post";
	form1.action="/blood.do";//컨트롤러에게 요청!!
	form1.submit();
	
}
</script>
</head>
<body>
	<form name="form1">
		<select name="blood">
			<option value="A형">A형</option>
			<option value="B형">B형</option>
			<option value="O형">O형</option>
			<option value="AB형">AB형</option>
		</select>
	</form>
		<button onclick="send()">평가요청</button>
</body>
</html>