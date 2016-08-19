//웹 서버 모듈을 추출 - 라이브러리 호출
var http = require('http');

//웹서버를 생성하고 실행
http.createServer(function (request, response) {
  response.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
  response.end('<h1>Hello World...!</h1>'); //브라우저에  출력
}).listen(9000, function () {				// 웹서버를 실행
  console.log('Server running at http://127.0.0.1:9000/');
});