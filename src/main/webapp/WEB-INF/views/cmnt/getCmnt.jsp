<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	<div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" id="container">
		<h3>커뮤니티 상세 페이지</h3>
		<form>
			<table border="1" style="border-collapse: collapse;">
				<tr>
					<td style="text-align: left; width: 800px">
						<p id="cmntTitle">${cmntTitle}</p>
					</td>
				</tr>
				<tr>
					<td style="text-align: left">
						<label id="cmntUserId">${userNickname}</label>
                        <!-- cmntRegdate != cmntModfdate-->
                        <label id="cmntModfdate">수정일 : ${cmntModfdate}</label>
                        <!-- 기본 출력 -->
                        <label id="cmntRegdate">작성일 : ${cmntRegdate}</label>
                        
					</td>
				</tr>
				<tr>
					<td style="text-align: left; width: 800px; height: 500px; ">
						${cmntContents}
					</td>
				</tr>
				<tr>
					<td style="text-align: center">
						<div>♥</div>
                        <p>${cmntLike}</p>
					</td>
				</tr>
			</table>
            <button type="button" id="btnList" class="btnleft" onclick="location.href='getCmntList.html'">목록</button>
            <!-- (session.userId == cmnt.userId) -->
            <button type="button" id="btnDelete" class="btnRight">삭제</button>
            <button type="button" id="btnUpdate" class="btnRight">수정</button>
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
