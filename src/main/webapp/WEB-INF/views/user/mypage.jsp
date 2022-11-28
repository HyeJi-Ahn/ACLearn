<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지(회원정보 수정)</title>
<style>
	h2 {
	padding-bottom: 50px;
	}
	
 	.form-wrapper {
      	display: flex;
      	text-align: center;
      	position:absolute;
     	top: 50%;
     	left: 50%;
      	transform: translate(-50%, -50%);  
   	}
   	
 	#joinForm {
   		width: 700px;
   		height: 810px;
		border:1px solid black;
    }
    
   	.input-wrapper {
   		margin-top: 20px;
   		margin-left: 180px;
   		
   		padding-bottom: 5px;
		display: flex;
		justify-content: space-between;
		align-items: center;
		font-size : 13px;
      	font-weight: bold;
   	}
   	
   	#joinForm input {
     	height:35px;
  	 }
   	#btnIdCheck {
     	
   	}
   	#btnEdit {
      	width: 150px; 
      	height:40px;
      	background-color:black;
		color:white;
		font-size: 16px;
		font-weight: bold;
   	}
   	
</style>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
	
		<div class="form-wrapper">
			<form id="joinForm" action="/user/join.do" method="post">
			<h2>회원정보 수정</h2>
			<div class="input-area">
				<div class="input-wrapper" >
					<label for="userId" >아이디</label>
				</div>
				<div>
					<input type="text" id="userId" name="userId" size="45"
							placeholder="아이디고정" required >
				</div>
				<div class="input-wrapper" >
					<label for="userPw">비밀번호</label>
				</div>
				<div>
					<input type="password" id="userPw" name="userPw" size="45"
							placeholder="영문, 숫자, 특수문자 조합으로 8~16자리" required>
				</div>
				<p id="pwValidation" style="color:red; font-size:0.5rem;">
					비밀번호는 영문, 숫자, 특수문자 조합의 8~16자리로 설정해주세요.
				</p>
				<div class="input-wrapper" >
					<label for="userPwCheck">비밀번호 확인</label>
				</div>
				<div>
					<input type="password" id="userPwCheck" name="userPwCheck" size="45"
					 		placeholder="영문, 숫자, 특수문자 조합으로 8~16자리" required>
				</div><br>
				<p id="pwCheckResult" style="font-size:0.8rem;">
				
				</p>
				<div class="input-wrapper" >
					<label for="userName">이름</label>
				</div>
				<div>
					<input type="text" id="userName" name="userName" size="45" 
							placeholder="이름" required>
				</div>
				<div class="input-wrapper" >
					<label for="userNickname">닉네임</label>
				</div>
				<div>		
					<input type="text" id="userNickname" name="userNickname" size="34"
							placeholder="영문, 한글, 숫자 조합으로 2~10자리"required>
					<button type="button" id="btnNickCheck" style="width: 70px; height: 40px;">중복체크</button>
				</div>
				<p id="nickValidation" style="color:red; font-size:0.5rem;">
					닉네임은 영문, 한글, 숫자 조합의 2~10자리로 설정해주세요.
				</p>
				<div class="input-wrapper" >
					<label for="userBirth">생년월일</label>
				</div>
				<div>
					<input type="text" id="userBirth" name="userBirth" size="45" 
							placeholder="생년월일 8자리(ex.19001201)" >
				</div><br>
				<div style="display: block; margin: 20px auto;">
					<button type="submit" id="btnEdit">수 정</button>
				</div>
			</div>
		</form>
		</div>
	<jsp:include page="${pageContext.request.contextPath }/footer.jsp"></jsp:include>
	
</body>
</html>