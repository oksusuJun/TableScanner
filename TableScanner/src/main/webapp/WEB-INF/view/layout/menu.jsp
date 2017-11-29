<%@ page contentType="text/html;charset=UTF-8" %>
<%--Spring Security 커스텀태그 --%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
   <sec:authorize> : 태그 하위 내용을 볼 수 있는 사용자인지 인증/권한 체크
    속성 -  access="Spring Security EL"  : 볼수 있는 권한 설정
   													
 --%>
<ul class="nav nav-stacked">
<%--인증 안된(로그인 안한) 사용자 메뉴 : 인증되면 안보여야 하는 메뉴 --%>
<sec:authorize access="!isAuthenticated()">
	<li><a href="${initParam.rootPath }/login_form.do">로그인</a></li>
	<li><a href="${initParam.rootPath }/join_member_form.do">회원가입</a></li>
</sec:authorize>


<%--인증된(로그인한) 사용자 메뉴 : 인증 안된상태에서 안보여야 하는 메뉴 --%>
<sec:authorize access="isAuthenticated()">
	<li><a id="logout" style="cursor: pointer;">로그아웃</a>
</sec:authorize>


<%--관리자 메뉴 /admin 으로 시작--%>
<sec:authorize access="hasRole('ROLE_ADMIN')">
	<li><a href="${initParam.rootPath }/admin/register_admin_form.do">관리자 등록</a></li>
</sec:authorize>


<%--회원/관리자 공통 메뉴 /member로 시작 --%>
<sec:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')">
	<li><a href="${initParam.rootPath }/member/mypage.do">사용자 정보조회</a></li>
</sec:authorize>


<%--인증 관련 없는 메뉴 (로그인 여부와 관련없이 나올 메뉴) --%>

</ul>



<!-- 
	로그아웃전송폼
	+ 로그인/로그아웃은 반드시 POST방식으로 요청하며 csrf 토큰을 보내야 한다.
	+ 로그아웃은 단순 링크이므로 아래와 같이 hidden 폼을 말들고 클릭시 Javascript에서 form을 submit하여 처리한다.
 -->
<form id="logoutForm" action="${initParam.rootPath }/logout.do" method="post" style="display:none">
    <sec:csrfInput/>
</form>


<script>
$(document).ready(function(){
	$("#logout").on("click", function(){
		$("#logoutForm").submit();
	});
});
</script>

