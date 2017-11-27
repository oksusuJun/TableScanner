<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>TableScanner</title>
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$(".tab > a > div").on("mouseover",function(){
				$(this).css("border-right","3px solid red");
			});
			$(".tab > a > div").on("mouseout",function(){
				$(this).css("border-right","1px solid #E0E0E0");
			});
			$(".ownersubmit").on("mouseover",function(){
				$(this).css({"background":"#fff","color":"#000","border":"2px solid #0B9BA9"});
				
			});
			$(".ownersubmit").on("mouseout",function(){
				$(this).css({"background":"#0B9BA9","color":"#fff","border":"0"});
			});
		});



	</script>

	<link rel="stylesheet" type="text/css" href="common.css">
	
	<style type="text/css">
		header{
			min-width: 1080px;
			width: 100%;
			height: 60px;
			border-bottom: 1px solid #E0E0E0;
		}
		.logo{
			width: 250px;
			height: 100%;
			float: left;
		}
		.tab{
			width: 250px;
			float: left;
			border-right: 1px solid #E0E0E0;
		}
		
		.tab > a > div {
			width: 100%;
			height: 100px;
			border-bottom: 1px solid #E0E0E0;	
			cursor: pointer;
		}
		.tab > a > div > span {
			line-height: 100px;
			font-size: 26px;

			font-family: HoonWhitecatR;
		}


		.content{
			width: calc(100% - 251px);
			float: left;
		}
		.owner{
			width: 500px;
			margin-top: 40px;
		}
		.owner > label{
			width: 100%;
			float: left;
			height: 40px;
			line-height: 40px;
			text-align: left;
		}
		.owner > input{
			width: 100%;
			float: right;
			height: calc(40px - 4px);
		}
		footer{
			width: 100%;
			height: 60px;	
			margin-top: 100px;
			float: left;
		}

	</style>


</head>
<body>
	<header>
		<div class="logo">
			<a href="#">
				<span style="line-height: 60px; font-size :32px;">TableScanner</span>
			</a>
		</div>

	</header>
	<div class="tab">
		<a href="#">
			<div class="tab1">
				<span>음식점 정보수정</span>
			</div>
		</a>
		<a href="#">
			<div class="tab2">
				<span>음식점 메뉴수정</span>
			</div>
		</a>
		<a href="#">
			<div class="tab3">
				<span>음식점 테이블수정</span>
			</div>
		</a>
		<a href="#">
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

			<div id="map" style="width:100%;height:350px;"></div>

			<input type="submit" value="등록" class="ownersubmit" style="width: 200px; margin-top: 30px; height: 50px; outline: 0; border: 0; background: #0B9BA9; font-size: 22px; cursor: pointer; font-weight: bold; border-radius: 5px; color: #Fff">
		</form>
	</div>

	<footer></footer>
</body>
</html>