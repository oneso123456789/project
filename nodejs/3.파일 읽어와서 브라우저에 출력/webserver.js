//웹 서버 모듈을 추출 - 라이브러리 호출
var http = require('http');

//파일 모듈을 추출
var fs = require('fs');

//서버를 생성하고 실행
http.createServer(function(request, response){
	
	//page.html 파일의 내용을 읽어서
	fs.readFile('page.html', function(error, data){
		response.writeHead(200,
				{'Content-Type':'text/html; charset=utf-8'});
		
		//브라우저에 읽은 내용을 출력
		response.end(data);
	});
}).listen(9005, function(){		// 웹서버를 실행
	console.log("서버 실행 중");
});
