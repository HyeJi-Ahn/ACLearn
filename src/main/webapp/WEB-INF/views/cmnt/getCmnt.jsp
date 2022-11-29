<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ACLearn - Community</title>
<style>
    #container { margin: 0 auto;}
    td {
        padding: 10px;
    }
    #cmntRegdate, #cmntModfdate {
        float: right; margin-left: 30px;
    }
    .btnleft {float: left;}

    .btnRight {float:right;}

    #insertReply { float: right;}

</style>
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
    ${cmnt}
	<div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" id="container">
		<h3>커뮤니티 상세 페이지</h3>
		<form>
			<table border="1" style="border-collapse: collapse;">
				<tr>
					<td style="text-align: left; width: 800px">
						<p id="cmntTitle">${cmnt.cmntTitle}</p>
					</td>
				</tr>
				<tr>
					<td style="text-align: left">
						<label id="cmntUserId">${cmnt.userNickname}</label>
						<!-- 작성일과 수정일이 다를 때(수정된 게시물에는 추가 출력) -->
                        <c:if test="${cmnt.cmntModfdate ne cmnt.cmntRegdate}">
                        	<label id="cmntModfdate">수정일 : ${cmnt.cmntModfdate}</label>
                        </c:if>
                        <!-- 기본 출력 -->
                        <label id="cmntRegdate">작성일 : ${cmnt.cmntRegdate}</label>
                        
					</td>
				</tr>
				<tr>
					<td style="text-align: left; width: 800px; height: 500px; ">
						${cmnt.cmntContents}
					</td>
				</tr>
				<tr>
					<td style="text-align: center">
						<div>♥</div>
                        <p>${cmntLike}</p>
					</td>
				</tr>
			</table>
            <button type="button" id="btnList" class="btnleft" onclick="location.href='getCmntList.do'">목록</button>
            <!-- (session.userId == cmnt.userId) -->
            <button type="button" id="btnDelete" class="btnRight">삭제</button>
            <button type="button" id="btnUpdate" class="btnRight" onclick="location.href='/board/updateCmnt.do?cmntCode=${cmnt.cmntCode}'" >수정</button>
		</form>
		<hr/>
        <!-- 댓글 영역 -->
        <div>
            <!-- 댓글 입력 영역 -->
            <div id="insertReply">
                <textarea name="replyContent" id="replyContent" cols="90" rows="5"></textarea>
                <button type="button" id="insertReply" class="insertReply">입력</button>
            </div>
            <!-- 댓글 리스트 (몇개씩?? 페이징도 해야함) -->
            <!-- -->
            <div>
                <!--유저 닉네임, 작성 시간-->
                <div>
                    <div>${userNickname}</div>
                    <div>${rpRegdate}</div>
                    <!-- c:if rpRegdate != rpModfdate -->
                    <div>${rpModfdate}</div>
                    <!-- /c:if -->
                </div>

            </div>
            <!-- forEach 닫기 -->
        </div>
	</div>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp"></jsp:include>
</body>
