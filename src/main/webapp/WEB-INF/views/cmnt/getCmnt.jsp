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
		<h3>Ŀ�´�Ƽ �� ������</h3>
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
                        <label id="cmntModfdate">������ : ${cmntModfdate}</label>
                        <!-- �⺻ ��� -->
                        <label id="cmntRegdate">�ۼ��� : ${cmntRegdate}</label>
                        
					</td>
				</tr>
				<tr>
					<td style="text-align: left; width: 800px; height: 500px; ">
						${cmntContents}
					</td>
				</tr>
				<tr>
					<td style="text-align: center">
						<div>��</div>
                        <p>${cmntLike}</p>
					</td>
				</tr>
			</table>
            <button type="button" id="btnList" class="btnleft" onclick="location.href='getCmntList.html'">���</button>
            <!-- (session.userId == cmnt.userId) -->
            <button type="button" id="btnDelete" class="btnRight">����</button>
            <button type="button" id="btnUpdate" class="btnRight">����</button>
		</form>
		<hr/>
        <!-- ��� ���� -->
        <div>
            <!-- ��� �Է� ���� -->
            <div id="insertReply">
                <textarea name="replyContent" id="replyContent" cols="90" rows="5"></textarea>
                <button type="button" id="insertReply" class="insertReply">�Է�</button>
            </div>
            <!-- ��� ����Ʈ (���?? ����¡�� �ؾ���) -->
            <!-- -->
            <div>
                <!--���� �г���, �ۼ� �ð�-->
                <div>
                    <div>${userNickname}</div>
                    <div>${rpRegdate}</div>
                    <!-- c:if rpRegdate != rpModfdate -->
                    <div>${rpModfdate}</div>
                    <!-- /c:if -->
                </div>

            </div>
            <!-- forEach �ݱ� -->
        </div>
	</div>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp"></jsp:include>
</body>
