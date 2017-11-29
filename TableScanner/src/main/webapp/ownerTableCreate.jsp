<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/TableScanner/css/common.css">
<script type="text/javascript" src="/TableScanner/script/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/TableScanner/script/jquery-ui.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
header {
	min-width: 1080px;
	width: 100%;
	height: 60px;
	border-bottom: 1px solid #E0E0E0;
}

header>a>span {
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

#droppable>div {
	margin: 0;
	width: 100px;
	height: 100px;
	background: rgba(0, 0, 0, 0.1);
}
</style>
</head>
<body>
	<header>
		<div class="logo">
			<a href="#"> <span style="line-height: 60px; font-size: 32px;">TableScanner</span>
			</a>

		</div>
		<a href="#"> <span>음식점 관리</span>
		</a> <a href="#"> <span>예약 관리</span>
		</a> <a href="#"> <span>매출 관리</span>
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
		</a> <a href="ownerTableCreate.jsp">
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
		<script type="text/javascript">
			$(function() {
				$("#droppable > div").draggable({
					containment : "#droppable",
					scroll : false,

				});
				// 그전기록을 불러올때 그거에 부여할것
				$(".draggable").on("dragstop", function() {
					var position = $(this).position();
					$(".x").val(position.left);
					$(".y").val(position.top);
				});

				$("#droppable").droppable({
					accept : "#draggable"
				});
				$("#tablecreate").on("click", $(".draggable"), function() {
					var text = $(".people").val();
					$("#droppable").append("<div class=draggable><span>" + text + "</span></div>");
					$("#droppable > div").draggable({
						containment : "#droppable",
						scroll : false,
					});
					//  		$(".draggable").on("dragstop",function(){
					// 	var position = $(this).position();

					//  			$(".x").val(position.left);
					//  			$(".y").val(position.top);

					// });		
				});
				$(".hidden").on("click", function() {

					$(".draggable").each(function(index, item) {
						var divposition = $(this).position();
						var divvalue = $(this).eq(0).text();
						var String1 = "<input type=hidden name=tableXY value="+ divposition.left + ">";
						var String2 = "<input type=hidden name=tableXY value="+ divposition.top + ">";
						var String3 = "<input type=hidden name=tableXY value="+ divvalue + "> <br>";
						$(".tableform").append(String1);
						$(".tableform").append(String2);
						$(".tableform").append(String3);

					});

				});
			});
		</script>

		<div id="droppable" style="width: 700px; height: 500px; border: 2px solid #E0E0E0; position: relative; margin-top: 30px;"></div>
		인원수 <input type="number" name="people" class="people">
		<button id="tablecreate">생성</button>

		<form class="tableform">

			<input type="button" value="완료" class="hidden">
		</form>


	</div>
</body>
</html>