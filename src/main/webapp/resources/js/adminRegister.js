$(function (){

    $("#adminIdDupleCheck").click(function() {
        const admin_id = $("input[name=admin_id]").val();
        if (admin_id === "" || admin_id === null) {
            alert("아이디를 입력해주세요")
        } else {
            $.ajax({
                type: 'POST',
                url: '/ajax/adminIdDupleCheck',
                data: {"admin_id" : admin_id},
                success: function (data) {
                    if (data.result === true) {
                        $("#adminIdDupleCheckFlag").val("fail");
                        alert("중복된 ID입니다")
                    } else {
                        $("#adminIdDupleCheckFlag").val("pass");
                        alert("사용가능한 ID입니다")
                    }
                }
            })
        }
    })


    //가입하기 버튼
    $("#adminRegister").click(function() {
        const admin_id = $("input[name=admin_id]").val();
        const admin_name = $("input[name=admin_name]").val();
        const admin_pwd = $("input[name=admin_pwd]").val();

        if ( admin_id === '' || admin_id === null) {
            alert("아이디는 필수입니다")
        } else if ( admin_pwd === '' || admin_pwd=== null ) {
            alert("비밀번호는 필수입니다")
        } else if ( admin_name === '' || admin_name === null) {
            alert("이름은 필수입니다")
        } else {
            //ID 중복체크
            if ($("#adminIdDupleCheckFlag").val() === "pass"){
                const queryString = $("#adminRegisterForm").serialize();
                $.ajax({
                    type: 'POST',
                    url: '/ajax/adminRegister',
                    data: queryString,
                    success: function (data) {
                        if (data.resultCode === 200) {
                            alert("회원가입이 완료되었습니다")
                        }
                    },
                    error: function () {
                        alert("서버 오류")
                    }
                });
            } else alert("ID 중복체크를 해주세요")
        }

    })


})