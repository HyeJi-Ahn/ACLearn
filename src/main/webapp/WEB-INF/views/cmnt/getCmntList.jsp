<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ACLearn - Community</title>
<style>
    #container {}
    td {
        padding: 10px;
    }
    #cmntRegdate {
        float: right;
    }

</style>
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
    
	<div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" id="container">
		<h3>커뮤니티 글 목록</h3>
		<c:forEach items="${cmntList}" var="cmnt">
			<div>
				글번호 : ${cmnt.cmntCode}
				${cmnt.userId}
				${cmnt.userNickname}
				${cmnt.cmntTitle}
				${cmnt.cmntContents}
				${cmnt.cmntOriImg}
				${cmnt.cmntNowImg}
				<fmt:formatDate value="${cmnt.cmntRegdate}" pattern="yyyy-MM-dd"/>
				${cmnt.cmntModfdate}
				${cmnt.cmntDelYn}
			</div>
		</c:forEach>
		
		
		
        <button type="button" id="btnList" onclick="location.href='cmnt/getCmntList.do'">목록</button>
        <button type="submit" id="btnInsert">등록</button>
		<hr/>
		<a href="/board/getBoardList.do">글 목록</a>
	</div>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp"></jsp:include>
</body>
</html>