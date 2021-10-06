<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>상단 영역</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">

    <script type="text/javascript">

        function changeView(value){

            if(value == "0") // HOME 버튼 클릭시 첫화면으로 이동
            {
                location.href="/cms/home";
            }
            else if(value == "1") // 로그인 버튼 클릭시 로그인 화면으로 이동
            {
                <a href="${ctx}/cms/tourInfoList">시담당자 대시보드</a>
            }
            else if(value == "2") // 회원가입 버튼 클릭시 회원가입 화면으로 이동
            {
                location.href="MainForm.jsp?contentPage=member/view/JoinForm.jsp";
            }
            else if(value == "3") // 로그아웃 버튼 클릭시 로그아웃 처리
            {
                location.href="member/pro/LogoutPro.jsp";
            }
        }
    </script>

</head>
<body>
<div id = "wrap">
    <p>
        <button class="btn btn-success" onclick="changeView(0)">HOME</button>
        <%
            // 로그인 안되었을 경우 - 로그인, 회원가입 버튼을 보여준다.
            if(session.getAttribute("sessionID")==null){
        %>
        <button id="loginBtn" class="btn btn-primary" onclick="changeView(1)">로그인</button>
        <a href="${pageContext.request.contextPath}/cms/tourInfoList">시담당자 대시보드</a>

        <%
            // 로그인 되었을 경우 - 로그아웃, 내정보 버튼을 보여준다.
        }else{
        %>
        <button id="logoutBtn" class="btn btn-primary" onclick="changeView(3)">로그아웃</button>
        <button id="updateBtn" class="btn btn-primary" >내정보</button>
        <%    }    %>

        <button id="memberViewBtn" class="btn btn-warning">회원보기</button>
    </p>
</div>
</body>
</html>