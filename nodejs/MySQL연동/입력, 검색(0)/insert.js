// 모듈을 추출합니다.
var mysql = require('mysql');

// 데이터베이스와 연결합니다.
var client = mysql.createConnection({
  user: 'root',
  password: '1234',
  database: 'company'
});

// 데이터베이스 쿼리를 실행합니다.
client.query('INSERT INTO products(name, modelnumber, series) VALUES(?, ?, ?)',
	['Name Value', '모델', 'Series Value'], function (error, results, fields) {
	if(error) {
	    console.log('쿼리 문장에 오류가 있습니다.');
	} else {
	    console.log("입력 성공");
	}
});