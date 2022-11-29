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
 	${cmntList }
	<div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" id="container">
		<h3>커뮤니티 글 목록</h3>
		<form id="searchForm" action="/cmnt/getCmntList.do" method="post">
			<table border="1" style="width: 700px; border-collapse: collapse;">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<option value="all"
								<c:if test="${searchCondition eq 'all' || searchCondition eq '' || searchCondition eq null}">
									selected = "selected"
								</c:if>
							>전체</option>
							<option value="title"
								<c:if test="${searchCondition eq 'title'}">
									selected = "selected"
								</c:if>
							>제목</option>
							<option value="content"
								<c:if test="${searchCondition eq 'content'}">
									selected = "selected"
								</c:if>
							>내용</option>
							<option value="writer"
								<c:if test="${searchCondition eq 'writer'}">
									selected = "selected"
								</c:if>
							>작성자</option>
						</select>
						<input type="text" name="searchKeyword" value="${searchKeyword}">
						<button type="submit" id="btnSearch">검색</button>
					</td>
				</tr>
			</table>
		</form>
		
		<table id="boardTable" border="1" style="width: 700px; border-collapse: collapse;">
			<tr>
				<th width="5%">번호</th>
				<th width="50%">제목</th>
				<th width="10%">작성자</th>
				<th width="20%">등록일</th>
				<th width="10%">조회수</th> 
				<th width="5%">y/n</th>
			</tr>
			<c:forEach items="${cmntList}" var="cmnt">
			<%-- <c:if test="${cmnt.cmntDelYn eq 'Y'}"> --%>
			<tr>
				<td>${cmnt.cmntCode}</td>
				<td><a href="/board/updateCmntCnt.do?CmntCode=${cmnt.cmntCode}">${cmnt.cmntTitle}</a></td>
				<td>${cmnt.userNickname}</td>
				<td><fmt:formatDate value="${cmnt.cmntRegdate}" pattern="yyyy-MM-dd"/></td>
				<td>${cmnt.cmntCnt}</td>
				<td>${cmnt.cmntDelYn}</td>
			<tr>
			<%-- </c:if> --%>
			</c:forEach>
		</table>
		<br>
		
        <button type="button" onclick="location.href='/cmnt/insertCmnt.do'">등록</button>
	</div>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp"></jsp:include>
</body>
</html>