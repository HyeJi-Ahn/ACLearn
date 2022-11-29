<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
  <link href="resources/css/styles.css?ver=1" rel="stylesheet" />
  <script>
    $(document).ready(function () {
      $(".banner-imgs").bxSlider({ slideWidth: 1500,
        adaptiveHeight: true, maxSlides: 1, moveSlides: 1, slideMargin: 20, pause: 5000, speed: 2000, 
        auto: true, autoHover: true, infiniteLoop: true, controls: false, captions:true})
    })
  </script>
</head>
<body>

	<header class="top-nav-bar">
    <a href="/index.jsp" class="logo">Aclearn</a>
    <nav class="nav-bar">
      <a href="#">강의</a>
      <a href="#">수강평</a>
      <a href="#">커뮤니티</a>
    </nav>
    <!-- <div class="search">
      <input type="text" class="search-bar" placeholder="검색어 입력">
      <a><img src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png" id="search-icon"></a>
    </div> -->
    <!-- 액션 위치, 버튼에 이미지 넣어보기 -->
	<form id="search" action="/board/getBoardList.do" method="post">
		<c:if test="${searchCondition == 'all' || searchCodition == '' || searchCondition == null}"/>
		<input type="text" class="search-bar" name="searchKeyword" placeholder="검색어 입력" value="${searchKeyword }">
		<button type="submit" id="search-btn">🔍︎</button>
	</form>
    <div id="sign">
	    <c:choose>
			<c:when test="${loginUser == null}">
				<a href="/user/login.do" class="sign-in-btn">로그인</a>
				<a href="/user/join.do" class="sign-up-btn">회원가입</a>
			</c:when>
			<c:otherwise>
				<a href="/user/mypage.do">${loginUser.USER_NICKNAME }님</a>
				<a href="/user/logout.do">로그아웃</a>
			</c:otherwise>
		</c:choose>
    </div>
  </header>
</body>
</html>