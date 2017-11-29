<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>TableScanner</title>

<script type="text/javascript" src="/TableScanner/script/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=963fe752c533d158667c78cad1a5be21&libraries=services"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=963fe752c533d158667c78cad1a5be21&libraries=services,clusterer,drawing"></script>
<link rel="stylesheet" type="text/css" href="/TableScanner/css/common.css">
<script type="text/javascript">
	$(function() {
		$(".tab > a > div").on("mouseover", function() {
			$(this).css("border-right", "3px solid red");
		});
		$(".tab > a > div").on("mouseout", function() {
			$(this).css("border-right", "1px solid #E0E0E0");
		});
		$(".ownersubmit").on("mouseover", function() {
			$(this).css({
				"background" : "#fff",
				"color" : "#000",
				"border" : "2px solid #0B9BA9"
			});
		});
		$(".ownersubmit").on("mouseout", function() {
			$(this).css({
				"background" : "#0B9BA9",
				"color" : "#fff",
				"border" : "0"
			});
		});
		$("header > a > span").on("mouseover", function(){
			$(this).css({
				"border-bottom" : "1px solid red"
			});
		});
		$("header > a > span").on("mouseout", function(){
			$(this).css({
				"border-bottom" : "0"
			});
		});

	
	});
</script>



<style type="text/css">
header {
	min-width: 1080px;
	width: 100%;
	height: 60px;
	border-bottom: 1px solid #E0E0E0;
}
header > a > span { 
	float: left;
	font-size: 20px;
	margin-left: 40px;
	line-height: 60px;  
	font-family: NanumGothic;
}

.logo {
	width: 250px;
	height: 100%;
	float: left;
}

.tab {
	width: 250px;
	float: left;
	border-right: 1px solid #E0E0E0;
}

.tab>a>div {
	width: 100%;
	height: 100px;
	border-bottom: 1px solid #E0E0E0;
	cursor: pointer;
}

.tab>a>div>span {
	line-height: 100px;
	font-size: 26px;
	font-family: HoonWhitecatR;
}

.content {
	width: calc(100% - 251px);
	float: left;
}

.owner {
	width: 500px;
	margin-top: 40px;
}

.owner>label {
	width: 100%;
	float: left;
	height: 40px;
	line-height: 40px;
	text-align: left;
}

.owner>input {
	width: 100%;
	float: right;
	height: calc(40px - 4px);
}

</style>


</head>
<body>
	<header>
		<div class="logo">
			<a href="#"> 
				<span style="line-height: 60px; font-size: 32px;">TableScanner</span>
			</a>
			
		</div>
			<a href="#">
				<span>음식점 관리</span>
			</a>
			<a href="#">
				<span>예약 관리</span>
			</a>
			<a href="#">
				<span>매출 관리</span>
			</a>

	</header>
	<div class="tab">
		<a href="#">
			<div class="tab1">
				<span>음식점 정보수정</span>
			</div>
		</a> <a href="#">
			<div class="tab2">
				<span>음식점 메뉴수정</span>
			</div>
		</a> <a href="#">
			<div class="tab3">
				<span>음식점 테이블수정</span>
			</div>
		</a> <a href="#">
			<div class="tab4">
				<span>음식점 정보삭제</span>
			</div>
		</a>

	</div>
	<div class="content">
		<form class="owner">
			<label>사업자번호 :</label> <input type="text" name="businessNum" placeholder="'-' 빼고 입력해주세요. "> 
			<label>음식점명 :</label> <input type="text" name="businessName"> 
			<label>음식점 전화번호 :</label> <input type="text" name="businessTel" placeholder="'-' 빼고 입력해주세요. "> 
			<label>업종 :</label> <input type="text" name="businessField"> 
			<label>휴무일 : </label><input type="text" name="businessHoliday"> 
			<label>OPEN : </label><input type="text" name="businessOpen"> 
			<label>CLOSE :</label> <input type="text" name="businessClose"> 
			<label>수용가능 인원 : </label><input type="text" name="businessCapaity"> 
			<label>1인당 예약금 : </label><input type="text" name="businessdeposit">
			<label>위치 : </label><input type="text" name="businessdAddress" class="Address" style="width: 70%; float: left;">
			<div class="Search" style="width: 27%; height: 40px; background: rgb(11, 155, 169); float: left; font-size: 20px; line-height: 40px; color: #fff; margin-left: 10px;">검색</div>
  
<!-- test -->
			<div id="map" style="width:504px; height:400px; top: 20px;"></div>
			<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=963fe752c533d158667c78cad1a5be21"></script>
			<script>
				var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
			    mapOption = {
			        center: new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			        level: 3 // 지도의 확대 레벨
			    };  
				// 지도를 생성합니다    
				var map = new daum.maps.Map(mapContainer, mapOption); 

				// 주소-좌표 변환 객체를 생성합니다
				var geocoder = new daum.maps.services.Geocoder();
		

				$(".Search").on("click",function(){
				var address = $(".Address").val();
				// 주소로 좌표를 검색합니다
				geocoder.addressSearch(address, function(result, status) {
				    // 정상적으로 검색이 완료됐으면 
				     if (status === daum.maps.services.Status.OK) {

				        var coords = new daum.maps.LatLng(result[0].y, result[0].x);

				        // 결과값으로 받은 위치를 마커로 표시합니다
				        var marker = new daum.maps.Marker({
				            map: map,
				            position: coords
				        });

				        // 인포윈도우로 장소에 대한 설명을 표시합니다
				        
				        var infowindow = new daum.maps.InfoWindow({
				            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+address+ '</div>'
				        });
				        infowindow.open(map, marker);

				        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
				        map.setCenter(coords);
				    } else {
				    	alert("검색결과가 없습니다.");
				    }
					});
				});   
			</script>
<!-- test -->
			
			
			
			<input type="submit" value="등록" class="ownersubmit"
				style="width: 200px; margin-top: 30px; height: 50px; outline: 0; border: 0; background: #0B9BA9; font-size: 22px; cursor: pointer; font-weight: bold; border-radius: 5px; color: #Fff"
			>
		</form>
	</div>

</body>
</html>