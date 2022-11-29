<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!--해당 부분 포함해야 한글 안 깨짐   -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>3조 AcLearn</title>
    </head>
<body>
	<jsp:include page="${pageContext.request.contextPath }/header.jsp"></jsp:include>
	
   <section class="top-banner">
    <div class="banner">
        <div class="banner-imgs">
          <div><a href="#"><img src="resources/images/1.webp"></a></div>
          <div><a href="#"><img src="resources/images/2.png"></a></div>
          <div><a href="#"><img src="resources/images/3.gif"></a></div>
          <div><a href="#"><img src="resources/images/4.png"></a></div>
          <div><a href="#"><img src="resources/images/5.webp"></a></div>
          <div><a href="#"><img src="resources/images/6.gif"></a></div>
          <div><a href="#"><img src="resources/images/7.gif"></a></div>
        </div>
    </div>
  </section>
	
  <section class="most-like-1">
    <div class="test2">
      <div class="test4"><a href="#" id="rank-lctr-1" class="common-1">인기 강의</a></div>
      <div id="container-lctr">
        <div class="rank-lctr-1">
          <div>
          <!-- db에서 데이터 가저오는거 물어보기, 별점순으로 정렬 2개만(스크립트), 비로그인 재생시 수강페이지 이동 -->
            <p align="middle" id="rank-lctr-left" class="test3"><iframe width="500" height="400" src="${al_lctr.LCTR_VIDEO_LINK}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></p>
            <h2>${al_lctr.LCTR_TITLE}</h2>
            <p>${al_lctr.LCTR_DETAILS}</p>
          </div>
          <div>
            <p align="middle" id="rank-lctr-right" class="test3"><iframe width="500" height="400" src="https://www.youtube.com/embed/hzd7YULioJI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></p>
            <h2>제목</h2>
            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ab cupiditate error suscipit necessitatibus, in eveniet magni eligendi sit doloremque quod! Facilis tenetur non doloribus doloremque aspernatur sapiente earum repellat nulla!</p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section class="most-like-2">
    <div class="test2">
      <div class="test5"><a href="#" id="rank-lctr-2" class="common-1">추천 강의</a></div>
      <div id="container-lctr">
        <div class="rank-lctr-2">
          <div class="test">
          <!-- 랜덤으로 정렬 8개(스크립트), 비로그인 재생시 수강페이지 이동 -->
            <p align="middle" class="rank-lctr">
              <iframe width="300" height="250" src="https://www.youtube.com/embed/iNewsbuJRsY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores qui perspiciatis id, nesciunt, accusantium voluptatem tempora voluptate molestiae aspernatur laudantium ipsa saepe, magnam officia. At, nesciunt. Natus soluta unde blanditiis.</p>
            </div>
          </div>
          <div class="test">
            <p align="middle" class="rank-lctr">
              <iframe width="300" height="250" src="https://www.youtube.com/embed/hzd7YULioJI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis rerum ad ea quidem? Similique consectetur consequatur aliquam ducimus? Inventore aliquid debitis excepturi dicta maxime iste, vel eius accusantium reprehenderit nemo!</p>
            </div>
          </div>
          <div class="test">
            <p align="middle" class="rank-lctr">
              <iframe width="300" height="250" src="https://www.youtube.com/embed/iNewsbuJRsY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Placeat saepe reprehenderit reiciendis cum! Rem aut at illo reiciendis. Magni laudantium voluptate autem magnam eos ipsum consequatur dolore, dolorem fugit. Excepturi!</p>
            </div>
          </div>
          <div class="test">
            <p align="middle" class="rank-lctr"><iframe width="300" height="250" src="https://www.youtube.com/embed/hzd7YULioJI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero fugit necessitatibus laudantium totam dignissimos ad rem maiores aperiam voluptatum harum vel, quo maxime in explicabo atque deleniti provident aliquam similique!</p>
            </div>
          </div>
          <div class="test">
            <p align="middle" class="rank-lctr">
              <iframe width="300" height="250" src="https://www.youtube.com/embed/iNewsbuJRsY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quidem laborum voluptatum consectetur nam, repellendus fuga modi dolore facilis. Voluptate maiores recusandae debitis odit doloremque aut architecto necessitatibus quo. Labore, voluptate.</p>
            </div>
          </div>
          <div class="test">
            <p align="middle" class="rank-lctr">
              <iframe width="300" height="250" src="https://www.youtube.com/embed/hzd7YULioJI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></p>
            <h3 class="title">title</h3>
            <div class="popup"> 
              <p class="test6">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ducimus, esse eum. Velit dignissimos aperiam, dolores eius delectus sit laudantium deserunt nihil expedita, accusantium debitis eligendi aspernatur nulla vel quia voluptatibus.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <script>
    $(function() {
      $flag = 0; 
      $(".test").on('mouseover', 
        function () { 
          console.log($(this));
          $(this).find(".popup").attr("style", "visibility:visible"); 
        } 
      ); 

      $(".test").on('mouseout', 
        function () { 
          $(this).find(".popup").attr("style", "visibility:hidden"); 
        } 
      ); 
    });
  </script>
  
  <jsp:include page="${pageContext.request.contextPath }/footer.jsp"></jsp:include>
</body>
</html>
