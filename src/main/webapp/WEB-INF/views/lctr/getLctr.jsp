<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    body {
    margin: 0;
    padding: 0;
    }
    .a { /* 섹션>div 공통 */
      margin: 0 auto; 
      padding: 0 20px; 
      max-width: 1200px;
    }

    /* lctr_details banner, lctr_details contents  공통부분*/
    .container {
      box-sizing: border-box; 
      display: flex; 
      flex-direction: row; 
      flex-wrap: wrap; 
      margin: 0 -8px;
    }
    .lctr_details_banner {
      align-items: center
    }

    /* lctr_details banner */
    .img_wrapper {
      box-sizing: border-box; 
      flex: 0 0 auto; 
      padding-left: 8px; 
      padding-right: 8px; 
      max-width: 41.6666667%;
    }
    .banner_img {
      box-sizing: inherit; 
      padding: 30px 28px; 
      width: 100%; 
      max-width: 720px
    }
    .banner_expain {
      box-sizing: border-box; 
      flex: 0 0 auto; 
      padding: 10px 0px; 
      max-width: 58.3333333%;
    }

    /* lctr_details menu */
    .menu__el_wrapper {
      display: flex; 
      align-items: flex-end; 
      height: 45px; 
      overflow-x: auto; 
      padding: 0 35px; 
      margin: 0 auto; 
      box-sizing: border-box;
    }
    .menu__el {
      display: inline-block; 
      border-bottom: 2px solid black; 
      margin-right: 30px; 
      line-height: 1.3; 
      padding: 15px 0 6px;
    }

    a {
      box-sizing: inherit; 
      text-decoration: none;
    }
    
    /* lctr_details contents */
    .content_wrapper {
      box-sizing: inherit; 
      padding: 28px 16px 0 34px; 
      width: 100%; 
      max-width: 720px
    }
    .aa {
      border: 1px solid lightgray
    }
    .content {
      padding-left: 8px; 
      padding-right: 8px;
      box-sizing: border-box; 
    }
    .left {
      flex-basis: 66.66666667%; 
      max-width: 66.66666667%; 
      flex: 0 0 auto; 
    }
    .right {
      flex-basis: 33.33333333%; 
      max-width: 33.33333333%; 
      flex: 0 0 auto; 
    }
    .floating {
      box-sizing: inherit; 
      width: 100%; 
      max-width: 320px; 
      position: sticky; 
      top:75px; 
      margin: 28px 34px 20px auto;
    }
    .floating_container {
      box-sizing: inherit;
    }
    .floating__card {
      box-sizing: inherit; 
      border: 1px solid lightgray
    }
  </style>
<body>
<jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
<main class="lctr_details">
    <section class="lctr_details banner" style="background-color: lightblue;">
    <input type="hidden" name="lctrCode" id="lctrCode" value="${lctr.lctrCode}">
      <div class="lctr_details a">
        <div class="lctr_details_banner container">
          <div class="lctr_details_banner img_wrapper">
            <img class="banner_img" src="../h0831/images/bg4.jpg" alt="">
          </div>
          <div class="banner_expain">
            <div>
              <span>조회수</span>
            </div>
            <div>
              <h2>${lctr.lctrTitle }</h2>
            </div>
            <div>
              <span>별</span>
              <span>수강평수</span>
              <span>수강자수</span>
            </div>
            <div>
              <button>수강신청</button>
              <span>좋아요</span>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section class="lctr_details menu">
      <div class="lctr_details a" style="border-bottom: 1px solid lightgray;">
        <div class="menu__el_wrapper">
          <span class="menu__el lctr"><a href="주소#lctr"></a>강의소개</span>
          <span class="menu__el review"><a href="주소#review"></a>수강평<span>##</span></span>
        </div>
      </div>
    </section>
    <section class="lctr_details_menu contents">
      <div class="lctr_details a">
        <div class="lctr_details container">
          <div class="content left">
            <div class="content_wrapper">
              <section class="content_body aa">${lctr.lctrDetails }강의소개내용---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</section>
              <section class="content_review aa">수강평---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</section>
            </div>
          </div>
          <div class="content right">
            <aside class="floating">
              <div class="floating_container">
                <div class="floating__card">
                  <div class="floating__card top">무료/바로학습하기</div>
                  <div class="floating__card bottom">지식공유자</div>
                </div>
              </div>
            </aside>
          </div>
        </div>
      </div>
    </section>
 </main>
<script>
	
</script>
</body>
</html>