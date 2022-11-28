<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
	h2 {
	padding-bottom: 10px;
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
   	
   	#btnNickCheck {
   	
   	}
   	#btnJoin {
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
			<h2>회원가입</h2>
			<p>ACLearn에서 새로운 성장의 기회를 얻으세요.</p><br>
			<div class="input-area">
				<div class="input-wrapper" >
					<label for="userId" >아이디</label>
				</div>
				<div>
					<input type="text" id="userId" name="userId" size="34"
							placeholder="영문, 숫자 조합으로 8~16자리" required >
					<button type="button" id="btnIdCheck" style="width: 70px; height: 40px;">중복체크</button>
				</div>
				<p id="idValidation" style="color:red; font-size:0.5rem;">
					아이디는 영문, 숫자 조합의 8~16자리로 설정해주세요.
				</p>
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
					<button type="submit" id="btnJoin">확 인</button>
				</div>
			</div>
		</form>
		</div>
	<jsp:include page="${pageContext.request.contextPath }/footer.jsp"></jsp:include>
	
	<script>
		$(function(){
			// 아이디 중복체크 했는지 확인
			var checkId = false;
			// 아이디가 형식에 맞는지
			var idValidation = false;
			// 비밀번호가 형식에 맞는지
			var pwValidation = false;
			// 비밀번호 확인란과 일치하는지
			var pwCheck = false;
			// 닉네임 중복체크
			var nicknameCheck = false;
			// 닉에임이 형식에 맞는지
			var nickValidation = false;
		
			$("#idValidation").hide();
			$("#pwValidation").hide();
			$("#pwCheckResult").hide();
			$("#nickValidation").hide();
			
			// 아이디 중복체크
			$("#btnIdCheck").on("click",function(){
				console.log($("#joinForm").serialize());
				console.log($("#joinForm"));
				$.ajax({
					url: '/user/idCheck.do',
					type: 'post',
					data: $("#joinForm").serialize(),
					success: function(obj){
						console.log(obj);
						
						if(obj == 'duplicatedId'){
							alert("중복된 아이디입니다.");
							$("#userId").focus();
						} else {
							if(confirm("사용 가능한 아이디 입니다. '" + $("#userId").val() + 
									"'를(을) 사용하시겠습니까?")) {
								checkId = true;
								$("#btnIdCheck").attr("disabled", true);
							}
						}
					},
					error: function(e){
						console.log(e);
					}
				})
				
				
			});
			// 아이디 중복체크 후 다시 아이디를 변경했을 때
			$("#userId").on("change",function(){
				checkId = false;
				$("#btnIdCheck").attr("disabled", false);
			});
			
			// 아이디 유효성 - 영문, 숫자 조합으로 8~16자리
			$("#userId").on("change", function(){
				var regexId = /^(?=.*[a-zA-Z])(?=.*[0-9]).{8,16}$/;
				var resultId = regexId.exec($("#userId").val());
				
				  if(resultId != null){
					  $("#idValidation").hide(); 
                   }else{
                	   $("#idValidation").show();
   					   $("#userId").focus();
   					   $("#btnIdCheck").attr("disabled", true);
                   }
			});
			
			
			// 비밀번호 유효성 검사 - 영문, 숫자, 특수문자 조합으로 8~16자리
			function validatePassword(character){
				return /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*+=-])(?=.*[0-9]).{8,16}$/.test(character);
			}
			// 비밀번호 입력될때마다 유효성 검사
			$("#userPw").on("change",function(){
				// 비밀번호 유효성 처리
				if(!validatePassword($("#userPw").val())){
					pwValidation = false;
					$("#pwValidation").show();
					$("#userPw").focus();
				} else {
					pwValidation = true;
					$("#pwValidation").hide();
				}
				
				// 비밀번호 확인까지 입력한 후 다시 비밀번호 재설정할 경우
				if($("#userPw").val() == $("#userPwCheck").val()){
					pwCheck = true;
					$("#pwCheckResult").css("color", "green");
					$("#pwCheckResult").text("비밀번호가 일치합니다.");
				} else {
					pwCheck = false;
					$("#pwCheckResult").css("color", "red");
					$("#pwCheckResult").text("비밀번호가 일치하지 않습니다.");
				}
			});
			
			// 비밀번호 확인란 입력할 때 일치하는지
			$("#userPwCheck").on("change", function(){
				$("#pwCheckResult").show();
				
				if($("#userPw").val() == $("#userPwCheck").val()){
					pwCheck = true;
					$("#pwCheckResult").css("color", "green");
					$("#pwCheckResult").text("비밀번호가 일치합니다.");
				} else {
					pwCheck = false;
					$("#pwCheckResult").css("color", "red");
					$("#pwCheckResult").text("비밀번호가 일치하지 않습니다.");
				}
			});
			
			
			// 닉네임 중복체크
			$("#btnNickCheck").on("click",function(){
				$.ajax({
					url: '/user/nicknameCheck.do',
					type: 'post',
					date: $("#joinForm").serialize(),
					success: function(obj){
						console.log(obj);
						
						if(obj == 'duplicatedNickname'){
							alert("중복된 닉네임 입니다.");
							$("#userNickname").focus();
						} else {
							if(confirm("사용 가능한 닉네임 입니다. '" + $("#userNickname").val() + 
									"'를(을) 사용하시겠습니까?")) {
								nicknameCheck = true;
								$("#btnNickCheck").attr("disabled", true);
							}
						}
					},
					error: function(e){
						console.log(e);
					}
				})
				
			});
			
			// 닉네임 중복체크 후 다시 변경
			$("#userNickname").on("change",function(){
				nicknameCheck = false;
				$("#btnNickCheck").attr("disabled", false);
			});
			
			// 닉넴 유효성 -
			$("#userNickname").on("change", function(){
				var regexNick = /^(?=.*[a-z0-9가-힣])[a-z0-9가-힣]{2,10}$/;
				var resultNick = regexNick.exec($("#userNickname").val());
				
				  if(resultNick != null){
					  $("#nickValidation").hide(); 
                   }else{
                	   $("#nickValidation").show();
   					   $("#userNickname").focus();
                   }
			});
			
			
			// 회원가입 진행
			// (e) 이벤트 객체 넣어주기
			$("#joinForm").on("submit", function(e){
				// submit이 실핼될 때 구현할 동작
				// 아이디 중복체크가 안됐거나, 중복된 아이디 사용했을 때
				if(!checkId) {
					alert("아이디 중복체크를 진행하세요.");
					$("#userId").focus();
					e.preventDefault();
					return false;
				} 
				
				if(!checkId) {
					alert("아이디 중복체크를 진행하세요.");
					$("#userId").focus();
					e.preventDefault();
					return false;
				} 
				
				
				
				// 비밀번호 유효성 검사가 틀렸을 때
				if(!pwValidation){
					alert("영문, 숫자, 특수문자 조합의 8~16자리로 설정하세요.");
					$("#userPw").focus();
					e.preventDefault();
					return;
				}
				
				// 비밀번호와 비밀번호 확인이 일치하지 않을 때
				if(!pwCheck) {
					alert("비밀번호가 일치하지 않습니다.");
					$("#userPwCheck").focus();
					e.preventDefault();
					return;
				}
				
				// 닉네임 중복체크
				if(!nicknameCheck) {
					alert("닉네임 중복체크를 진행하세요.");
					$("#userNickname").focus();
					e.preventDefault();
					return;
				} 
				
				
				
				
				// 모두 true일 경우 아무것도 작성하지 X
				
			});
		
			
		});
	</script>
</body>
</html>