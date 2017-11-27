<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="/TableScanner/script/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="/TableScanner/css/common.css">
<link rel="stylesheet" type="text/css" href="/TableScanner/css/main.css">

<script type="text/javascript">
$(document).ready(function(){
	var now = 0;
	var imgs = $(".slide_img > img");
	var limit = imgs.length-1;
	
	imgs.eq(now).siblings().css({"left":"100%"});
	
	setInterval(function(){
		var pre = now;
		
		now = now >= limit ? 0 : now+1;
		
		imgs.eq(now).css({"left":"100%"});
		imgs.eq(pre).animate({"left":"-100%"},1000);
		imgs.eq(now).animate({"left":"0"},1000);
	},2000);
});

</script>
</head>
<body>

	<jsp:include page="/WEB-INF/view/content/layout/header.jsp"></jsp:include>
	
	
	<section>
		<div class="slide">
			<div class="slide_img">
				<img src="/TableScanner/image/slide/slide1.jpg" alt="img">
				<img src="/TableScanner/image/slide/slide2.jpg" alt="img">
				<img src="/TableScanner/image/slide/slide3.jpg" alt="img">
				<img src="/TableScanner/image/slide/slide4.jpg" alt="img">
				<img src="/TableScanner/image/slide/slide5.jpg" alt="img">
			</div>
			<div class="slide_bar">
				<div class="slide_bar_choose"></div>
				<div class="slide_bar_input_name slide_bar_size">
				
				</div>
				<div class="slide_bar_input_condition slide_bar_size">
				<img src ="#" alt="img" class="gpsimage">
					<input type="text" value="위치" class="local">
					<input type="text" value="인원" class="people">
					<input type="date" class="time">
					<div class="time2">
						<input type="date" class="hour">
						<input type="date" class="minute">   
					</div>
					<button class="search">검색</button>
				</div>
			</div>
	</div>
	
		<div class="contents">
			<div class="contents_left">
			</div>
			<div class="contents_mid">
			</div>
			<div class="contents_right">
			</div>
		</div>

		<div class="contents">
			<div class="contents_mid_left">
			</div>
			<div class="contents_mid_right">
			</div>
		</div>

		<div class="contents">
			<div class="contents_left">
			</div>
			<div class="contents_mid">
			</div>
			<div class="contents_right">
			</div>
		</div>
	</section>
		
	<jsp:include page="/WEB-INF/view/content/layout/footer.jsp"></jsp:include>
</body>
</html>