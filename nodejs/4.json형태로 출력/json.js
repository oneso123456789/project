//웹 서버 모듈을 추출
var http = require('http');

//서버를 생성하고 실행
http.createServer(function (request, response) {
    var contact = {
	id: 1,
	lastName: "화수",
	firstName: "안"
	};
    response.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
    response.end('<h1>' + JSON.stringify(contact) +'</h1>');
}).listen(9002, function () {
    console.log('Server Running');
});
