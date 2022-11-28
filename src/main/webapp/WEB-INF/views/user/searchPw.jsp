<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<style>
		h3 {
		padding-bottom: 12px;
		font-size: 30px;
	}
	.form-wrapper {
		display: flex;
      	text-align: center;
      	position:absolute;
     	top: 50%;
     	left: 50%;
      	transform: translate(-50%, -50%);  
	}

	#loginForm {
		width: 460px;
		height: 430px;
		text-align: center;
		border:1px solid black;
	}
	
	#loginForm input {
		width: 300px;
		height:40px;
		
	}
	
	input::placeholder {
  		font-size: 15px;
  		font-style: italic;
	}
	
	#loginForm .login_append {
		margin-right:20px;
	}
	
	#loginForm div {
	
	}
			
	#btnFindPw {
		width: 310px;
		height: 43px;
		background-color:black;
		color:white;
		font-size: 15px;
		font-weight: bold;
	}
</style>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
	
	<div class="form-wrapper">
		<form id="loginForm">
			<h3>비밀번호 찾기</h3>
			<div class="input-wrapper" style="display:block; margin:20px auto;">
				<input type="text" id="userId" name="userId" placeholder=" 아이디" required>
			</div>
			<div class="input-wrapper" style="display:block; margin:20px auto;">
				<input type="text" id="userName" name="userName" placeholder=" 이름" required>
			</div>
			<div class="input-wrapper" style="display:block; margin:20px auto;">
				<input type="text" id="userBirth" name="userBirth" placeholder=" 생년월일 8자리(ex.19001201)" required>
			</div>
			<div style="display:block; margin:20px auto;">
				<button type="button" id="btnFindPw">확 인</button>
			</div>
			
			<div class="login_append">
	        <span class="txt_find">
	           <a href="/user/searchId.do" class="link_find">아이디 찾기</a>
	            /
	           <a href="/user/join.do" class="link_find">회원가입</a>
	         </span>
	       </div>
	
				
		</form>
	</div>
	
	<jsp:include page="${pageContext.request.contextPath }/footer.jsp"></jsp:include>
	<script>
	
	</script>
</body>
</html>