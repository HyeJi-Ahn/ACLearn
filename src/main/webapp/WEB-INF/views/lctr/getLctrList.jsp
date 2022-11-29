<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2 { margin-left: 520px;}
	hr, .container { width: 1000px;}
    .container { 
      display: grid;
      grid-template-columns: repeat(3, 1fr);
      gap: 10px;
      margin: 0 auto;
    }
    .item { 
      border: 1px solid black;
    }
    img {
      width: 100%;
    }
    .pagination {
      text-align: center;
      margin-top: 20px;
    }
    .content, h3 {
     margin:10px;
    }
</style>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
	<h2><b>전체 강의 목록</b></h2>
	<hr>
	<div class="container">
		<c:forEach items="${lctrList }" var="lctr">
			<div class="item">
				<img src="/resources/imgs/test01.jpg" alt="NoImg">
				<h3>강의제목 : <a href="/lctr/getLctr.do?lctrCode=${lctr.lctrCode }">${lctr.lctrTitle }</a></h3>
				<div class="content">강의내용 : ${lctr.lctrDetails }</div>
				<div style="text-align: right;">좋아요</div>
			</div>
		</c:forEach>
	</div>
	<!-- Pagination -->
	<!-- 한 페이지에 보여줄 최대 강의 수도 페이지내이션에서 설정 -->
	<div class="pagination">
		<div>
			<a href="#">«</a>
			<a href="#">1</a>
			<a href="#">2</a>
			<a href="#">3</a>
			<a href="#">4</a>
			<a href="#">»</a>
		</div>
	</div>
</body>
</html>