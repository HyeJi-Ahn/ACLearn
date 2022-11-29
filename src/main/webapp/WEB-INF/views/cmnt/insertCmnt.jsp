<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ACLearn - Community</title>
<style>
    #container { text-align: center;}
    td {
        padding: 10px;
    }
	table { 
		border: 1px solid green; border-collapse: collapse;
	}
    #cmntTitle {
		width: 780px; height: 30px;
	}
	#cmntRegdate {
        float: right;
    }


</style>
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
	<div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" id="container">
		<h3>커뮤니티 글 작성 페이지</h3>
		<form id="insertCmnt" action="/cmnt/insertCmnt.do" method="post" enctype="multipart/form-data">
			<input type="hidden" name="userId" value="HJ"> <!-- ${loginUser.userId} -->
			<table>
				<tr>
					<td style="text-align: left; width: 800px;">
						<input type="text" name="cmntTitle" id="cmntTitle" placeholder="제목">
					</td>
				</tr>
				<tr>
					<td style="text-align: left">
						<label id="userNickname">작성자 : 혜지</label><!-- ${loginUser.userNickname} -->
					</td>
				</tr>
				<tr>
					<td style="text-align: left; width: 800px; height: 500px; ">
						<textarea name="cmntContents" cols="110" rows="30"></textarea>
					</td>
				</tr>
				<tr>
					<td style="text-align: left">
						<label for="cmntFile">이미지 업로드 :&nbsp;&nbsp;</label><input type="file" >
					</td>
				</tr>
			</table>
            <button type="button" id="btnList" onclick="location.href='/cmnt/getCmntList.do'">목록</button>
            <button type="submit" id="btnInsert">등록</button>
		</form>
		<hr/>
	</div>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp"></jsp:include>
</body>
</html>