<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// 스크립틀릿 태그(Scriptlet tag)

	out.println("출력1<br>");
	out.println("출력2" + "<br>");
	out.println("출력3<br>");
	System.out.println("콘솔에 출력됨");

	//변수
	int i = 10;
	double d = 42.195;
	char c1 = 'j';
	char c2 = '자';
	boolean b1 = true;
	boolean b2 = false;
	String str1 = "JSP연습";
	String str2 = new String("오라클 연습");
	
	out.println("i="+i+"<br>");
	out.println("str1="+str1+"<br>");
	
%>

<!-- 표현식 태그 -->
1+2+3+4+5=<%=1+2+3+4+5 %><br>
<%="Monday" %><br>
<%="출력성공~!!" %><br>
str1=<%=str1 %><br>
str2=<%=str2 %><br>


<!-- 선언 태그 -->
<%!  // 메소드는 반드시 선언태그에서 정의 해야함.
	int it = 100;
	public int check(){
	
		return 50;
	}

%>



